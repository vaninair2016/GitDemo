package restAPIAutomationProject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
public class myFirstRestAssuredClass {

    public static void main(String[] args) {
        //getResponseBody();
        getResponseStatus();
    }


    public static void getResponseBody() {
        given().queryParam("CUSTOMER_ID","68195").queryParam("PASSWORD", "1234!").queryParam("Account_No", "1")
                .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log().body();

    }
    public static void getResponseStatus() {
        int statusCode=
                given().queryParam("CUSTOMER_ID","68195").queryParam("PASSWORD", "1234!").queryParam("Account_No", "1")
                        .when().get("http://demo.guru99.com/V4/sinkministatement.php").getStatusCode();// To get the status code
        System.out.println("Status code is : " +statusCode);//print it
        given().when().get("http://demo.guru99.com/V4/sinkministatement.php").then().assertThat().statusCode(200);// Verify if it is 200

    }

}
