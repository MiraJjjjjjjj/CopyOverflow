package com.maxcode.demo.stackexchange.api.client;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

public class StackExchangeApi {

    private static HttpClient client = HttpClientBuilder.create().build();

    public static String getRequest(String uri) throws IOException {
        HttpGet request = null;
        HttpEntity httpEntity = null;
        try {
            request = new HttpGet(uri);
            HttpResponse httpResponse = client.execute(request);
            httpEntity = httpResponse.getEntity();
            InputStream entityContentStream = httpEntity.getContent();
            String output = IOUtils.toString(entityContentStream, StandardCharsets.UTF_8.name());
            return output;
        } catch (final IOException ex) {
            throw new IllegalStateException(ex);
        } finally {
            if (request != null) {
                request.releaseConnection();
            }
            if (httpEntity != null) {
                EntityUtils.consume(httpEntity);
            }
        }
    }
}