package com.gaidelfanclub.sdk.utils;

public class QueryUtils {
    private QueryUtils() {
    }

    private final static String DELIM = ";";

    public static String listToQuery(String... list) {
        if (list == null) {
            return null;
        }
        StringBuilder query = new StringBuilder();
        for (int i = 0; i < list.length; i++) {
            query.append(list[i]);
            if (i != list.length - 1) {
                query.append(DELIM);
            }
        }
        return query.toString();
    }
}
