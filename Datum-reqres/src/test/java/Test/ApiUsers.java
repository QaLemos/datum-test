package Test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ApiUsers {

    String url = "https://reqres.in/api/login";

    @Test
    public void loginSucess(){

        given().
                param("email", "eve.holt@reqres.in").
                param("password", "cityslicka").
                when().
                get(url).
                then().
                statusCode(200).
                body(containsString("aqua sky"));
    }

}
