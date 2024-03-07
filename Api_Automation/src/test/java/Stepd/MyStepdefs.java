package Stepd;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MyStepdefs {
    @Given("I hit the url to get api response")
    public void iHitTheUrlToGetApiResponse() {
        RestAssured.baseURI="https://fakestoreapi.com/";
        RequestSpecification httpreq=RestAssured.given();
        Response response=httpreq.get("products");
        System.out.println(response.getStatusCode());

    }

    @When("I pass the url of porduct")
    public void iPassTheUrlOfPorduct() {

    }

    @Then("url should give status code {int}")
    public void urlShouldGiveStatusCode(int arg0) {
    }
}
