package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.scheduling.TaskExecutors;
import io.micronaut.scheduling.annotation.ExecuteOn;
import jakarta.inject.Inject;

@ExecuteOn(TaskExecutors.BLOCKING)
@Controller
public class ExampleController {

    private final ExampleClient exampleClient;

    @Inject
    public ExampleController(ExampleClient exampleClient) {
        this.exampleClient = exampleClient;
    }

    @Get
    public void getWebsiteHtml() {
        exampleClient.getWebsiteHtml();
    }
}
