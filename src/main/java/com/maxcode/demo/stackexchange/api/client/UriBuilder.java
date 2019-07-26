package com.maxcode.demo.stackexchange.api.client;

import java.util.HashMap;

public class UriBuilder {

    private static final String API_URI = "https://api.stackexchange.com/2.2/";

    private UriBuilder() {
    }

    public static String getApiUri(String method, HashMap<String, String> parameters) {
        StringBuilder uri = new StringBuilder(API_URI + method + "?");

        parameters.forEach((key, value) -> uri.append(key + "=" + value + "&"));

        uri.deleteCharAt(uri.length() -1);

        return uri.toString();
    }
}