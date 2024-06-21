package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

public class AddPlaceAPI {


    @Given("Add Place Payload")
    public void add_place_payload() {
        RestAssured.baseURI = "http://universities.hipolabs.com";
        String response = given().queryParam("country","South+Africa").when().get().then().extract().response().asString();
        JsonPath Js = new JsonPath("response");
        System.out.println(response);


    }

    @When("user calls {string} with post http request")
    public void user_calls_with_post_http_request(String string) {

    }

    @Then("the API call got success with status code {int}")
    public void the_api_call_got_success_with_status_code(Integer int1) {

    }

    @Then("{string} in response body is {string}")
    public void in_response_body_is(String string, String string2) {

    }

    @Then("{string} in response body id {string}")
    public void in_response_body_id(String string, String string2) {

    }

}
