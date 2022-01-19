package com.starwars.requestspecifications;

import com.starwars.utils.PropertiesReader;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class FilmsRequestSpecification extends GenerateRequestSpecifications {

    private static final String BASE_URI = PropertiesReader.readProperty("STARWARS_BASE_URI");
    private static final String API_KEY = PropertiesReader.readProperty("STARWARS_API_KEY");
    private static final String BASE_PATH = PropertiesReader.readProperty("STARWARS_BASE_PATH");

    public RequestSpecification generateJSONRequestSpec() {
        return generateRequestSpec(BASE_URI, ContentType.JSON, API_KEY);
    }

    public RequestSpecification generateJSONRequestSpecWithoutAuth() {
        return generateRequestSpec(BASE_URI, ContentType.JSON);
    }
}