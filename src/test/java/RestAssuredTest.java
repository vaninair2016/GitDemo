import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
public class RestAssuredTest
{
@Test
    public void myFirstTest(){

        given().
                when().
                get("http://api.zippopotam.us/us/90210").then().
                assertThat().
        body("places[0].'place name'", equalTo("Beverly Hills"));

    }
}
