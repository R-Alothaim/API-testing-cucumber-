package step_definitions;

import org.apache.hc.core5.http.ContentType;
import org.apiguardian.api.API;
import org.junit.runner.RunWith;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import TestDataBuilder.APIResources;
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
  @Given("Add place {string} {string} {string}")
public void add_place(String string, String string2, String string3) throws IOException {
   
  resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(io.restassured.http.ContentType.JSON).build();
  res = given().spec(requestspec()).body(data.addplace(string, string2, string3));
}
  @When("user calls {string} with {string} http request")
  public void post_req(String string, String string2) {
    APIResources resourceAPI = APIResources.valueOf(string);
    resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(io.restassured.http.ContentType.JSON).build();
    if(string2.equalsIgnoreCase("POST")){
    response = res.when().post(resourceAPI.getResource()).then().spec(resspec).extract().response();
    }
    else if(string2.equalsIgnoreCase("GET")){
      response = res.when().get(resourceAPI.getResource()).then().spec(resspec).extract().response();
    }else if(string2.equalsIgnoreCase("DELETE")){
      response = res.when().delete(resourceAPI.getResource()).then().spec(resspec).extract().response();
    }
  }
}

