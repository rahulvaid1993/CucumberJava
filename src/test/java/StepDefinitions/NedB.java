package StepDefinitions;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.ArrayList;

import static io.restassured.RestAssured.*;


public class NedB {


    public static void main(String []args){

        RestAssured.baseURI = "http://universities.hipolabs.com";
        String response = given().urlEncodingEnabled(false)
        .queryParam("country","South+Africa")
                .when().get("search").then()
                .extract().response().asString();



        JsonPath js = new JsonPath(response);

       int ab = js.getInt([]);

        System.out.println(ab);












    }
}
