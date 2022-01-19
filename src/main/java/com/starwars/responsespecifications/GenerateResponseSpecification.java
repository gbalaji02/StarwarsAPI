package com.starwars.responsespecifications;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class GenerateResponseSpecification {

    private static final String STATUS_LINE = "HTTP/1.1 200 OK";

    public static ResponseSpecification generateSuccessResponseSpecWithJsonContentType() {
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectStatusLine(STATUS_LINE)
                .expectContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
    }

    public static ResponseSpecification generateSuccessResponseSpecWithTextContentType() {
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectStatusLine(STATUS_LINE)
                .expectContentType(ContentType.TEXT)
                .log(LogDetail.ALL)
                .build();
    }

}

