package tests;


import actions.APIActions;
import actions.AssertActions;
import com.starwars.requestpayload.RequestPayload;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected RequestSpecification requestSpecification;
    protected AssertActions assertActions = new AssertActions();
    protected APIActions apiActions = new APIActions();
    protected RequestPayload requestPayload = new RequestPayload();

    protected final String BASE_URL = "https://swapi.dev/api";
    protected final String FILMS = "/films";
    protected final Integer SC_OK = HttpStatus.SC_OK;


    public static RequestSpecBuilder reqBuilder;
    public static RequestSpecification reqSpec;

    @BeforeMethod
    public static void beforeAll() {

        reqBuilder = new RequestSpecBuilder();
        reqBuilder.setContentType(ContentType.JSON);

        reqSpec = reqBuilder.build();
    }
}

