package com.gaidelfanclub.example;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.gaidelfanclub.sdk.CodeforcesSDK;
import com.gaidelfanclub.sdk.model.User;

import java.lang.ref.WeakReference;
import java.util.List;

public class UserLoadingActivity extends Activity {

    private TextView handle;
    private TextView firstName;
    private TextView lastName;
    private TextView rank;
    private SearchView searchView;
    private View userInfoContainer;
    private View loadingProgress;
    private DownloadUserTask currentLoadingTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
        initViews();
        setupSearchView();
    }

    private void initViews() {
        handle = (TextView) findViewById(R.id.handle);
        firstName = (TextView) findViewById(R.id.first_name);
        lastName = (TextView) findViewById(R.id.last_name);
        rank = (TextView) findViewById(R.id.rating);
        searchView = (SearchView) findViewById(R.id.search_view);
        userInfoContainer = findViewById(R.id.user_info_container);
        loadingProgress = findViewById(R.id.loading_progress);
    }

    private void setupSearchView() {
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if (!TextUtils.isEmpty(query)) {
                    if (currentLoadingTask != null) {
                        currentLoadingTask.cancel(false);
                    }
                    currentLoadingTask = new DownloadUserTask(UserLoadingActivity.this);
                    currentLoadingTask.execute(query);
                }
                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }

    private void startLoadingState() {
        loadingProgress.setVisibility(View.VISIBLE);
        userInfoContainer.setVisibility(View.GONE);
    }

    private void showUserData(User user) {
        loadingProgress.setVisibility(View.GONE);
        if (user == null) {
            Toast.makeText(this, R.string.cant_load_user, Toast.LENGTH_SHORT).show();
        } else {
            userInfoContainer.setVisibility(View.VISIBLE);
            handle.setText(user.getHandle());
            firstName.setText(user.getFirstName());
            lastName.setText(user.getLastName());
            rank.setText(user.getRank());
        }
    }

    private static class DownloadUserTask extends AsyncTask<String, Void, User> {

        private WeakReference<UserLoadingActivity> activityWeakReference;

        DownloadUserTask(UserLoadingActivity activity) {
            activityWeakReference = new WeakReference<>(activity);
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            UserLoadingActivity activity = activityWeakReference.get();
            if (activity != null) {
                activity.startLoadingState();
            }
        }

        @Override
        protected User doInBackground(String... params) {
            List<User> users = null;
            try {
                users = CodeforcesSDK.userInfo(params[0]).execute();
            } catch (Exception ignored) { //TODO ignored for now
            }
            return users == null || users.size() != 1 ? null : users.get(0);
        }

        @Override
        protected void onPostExecute(User user) {
            super.onPostExecute(user);
            UserLoadingActivity activity = activityWeakReference.get();
            if (activity != null && !isCancelled()) {
                activity.showUserData(user);
            }
        }
    }


}
