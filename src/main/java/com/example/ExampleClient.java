package com.example;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.client.annotation.Client;

@Client("google")
public interface ExampleClient {

    @Get("/apis/docs/http")
    String getWebsiteHtml();
}
