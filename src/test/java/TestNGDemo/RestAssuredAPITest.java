package TestNGDemo;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class RestAssuredAPITest {
    static String baseUrl = "https://fake-json-api.mock.beeceptor.com";
    @Test
    public void testGETRequest() {
        Response response = given()
                .when()
                .get(baseUrl + "/users")
                .then()
                .statusCode(200) // Validate response code
                .extract().response();

        System.out.println("GET Response: " + response.asString());
//        Assert.assertEquals(response.jsonPath().getInt("id"), 1, "ID should be 1");
    }
}
