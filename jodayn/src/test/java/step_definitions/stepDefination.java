package step_definitions;

import org.apache.hc.core5.http.ContentType;
import org.junit.runner.RunWith;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.FileNotFoundException;

import TestDataBuilder.TestData;
import TestDataBuilder.utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
@RunWith(Cucumber.class)
public class stepDefination extends utils {
  RequestSpecification res;
  ResponseSpecification resspec;
  Response response;
  TestData data = new TestData();
  @Given("^Add place$")
  public void add_place() throws FileNotFoundException {
   
  resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(io.restassured.http.ContentType.JSON).build();
  res = given().spec(requestspec()).body(data.addplace());
}
  @When("user calls {string} with post http request")
  public void post_req(String string) {
    resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(io.restassured.http.ContentType.JSON).build();
    response = res.when().post("/maps/api/place/add/json").then().spec(resspec).extract().response();
  }
}

