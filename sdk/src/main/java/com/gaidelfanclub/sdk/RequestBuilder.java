package com.gaidelfanclub.sdk;


import java.io.IOException;

public interface RequestBuilder<T> {
    T execute() throws IOException;
}
