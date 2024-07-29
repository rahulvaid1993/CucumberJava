package StepDefinitions;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.given;

public class Test1 {


    public static  void main(String[] args){

        Test1.universities();
    }


    public static void universities() {

//        RestAssured.baseURI = "http://universities.hipolabs.com";
//        RestAssured.urlEncodingEnabled=false;
//        String response = given().log().all().queryParam("country","South+Africa").when().get().then().log().all().extract().response().asString();
        JsonPath Js = new JsonPath(Payload.responseBody());
        System.out.println("Here is yr response:   =============>"+Payload.responseBody());

        System.out.println("This is what you are looking for :  "+Js.getString("github"));

        System.out.println("This is what you are looking for 2:  "+Js.getString("author"));
    }
}
