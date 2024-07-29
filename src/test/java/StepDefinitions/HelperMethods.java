package StepDefinitions;

import io.restassured.path.json.JsonPath;

public class HelperMethods {

    public static JsonPath ParseJson(String Response){

        JsonPath Js = new JsonPath(Response);

        return  Js;


    }
}
