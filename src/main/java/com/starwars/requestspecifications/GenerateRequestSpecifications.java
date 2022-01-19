package com.starwars.requestspecifications;


import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class GenerateRequestSpecifications {

    protected  RequestSpecification generateRequestSpec (String baseUri, ContentType contentType) {
        return new RequestSpecBuilder()
                .setBaseUri(baseUri)
                .setContentType(contentType)
                .build();

    }

    protected RequestSpecification generateRequestSpec(String baseUri, ContentType type, String apiKey) {
        return new RequestSpecBuilder()
                .setBaseUri(baseUri)
                .addQueryParam("key", apiKey)
                .setContentType(type)
                .log(LogDetail.ALL)
                .build();
    }
}
