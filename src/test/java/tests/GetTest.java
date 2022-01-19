package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class GetTest extends BaseTest {

    @Test()
    @Severity(SeverityLevel.NORMAL)
    @Description("Verify that Status code is 200 when we call get")
    public void testHttpGetFilms() {

        Response response = given()
                .spec(reqSpec)
                .when()
                .get("https://swapi.dev/api/films/")
                .then()
                .statusCode(SC_OK)
                .extract()
                .response();

        assertActions.verifyStatusCode(response);
        JsonPath json = response.jsonPath();
        List<String> titles = json.getList("results.title");
        assertActions.verifyResponseBody(titles.size(), 6, "Verifies titles returned is equal to 6" );
    }
}
