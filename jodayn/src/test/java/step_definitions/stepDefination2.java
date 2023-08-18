package step_definitions;

import java.io.IOException;

import TestDataBuilder.APIResourcesPet;
import TestDataBuilder.TestData;
import TestDataBuilder.utils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.*;
public class stepDefination2 extends utils {
   static RequestSpecification res;
  ResponseSpecification resspec;
  Response response;
  TestData data = new TestData();
  static String place_id;
  @Given("Add pet {string} {string} {string}")
public void add_place(String string, String string2, String string3) throws IOException {
   
  resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(io.restassured.http.ContentType.JSON).build();
  res = given().spec(requestspec2("baseUrl")).body(data.addpet(string, string2, string3));
}
  @When("calls {string} with {string} http request")
  public void httprequest(String request, String requesttype) {
    APIResourcesPet resourceAPI = APIResourcesPet.valueOf(request);
    resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(io.restassured.http.ContentType.JSON).build();
    if(requesttype.equalsIgnoreCase("POST")){
    response = res.when().post(resourceAPI.getResource()).then().spec(resspec).extract().response();
    }
    else if(requesttype.equalsIgnoreCase("GET")){
      response = res.when().get(resourceAPI.getResource()).then().spec(resspec).extract().response();
    }else if(requesttype.equalsIgnoreCase("DELETE")){
      response = res.when().delete(resourceAPI.getResource()).then().spec(resspec).extract().response();
    }
  }
}
