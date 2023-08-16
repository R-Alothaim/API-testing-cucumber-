package TestDataBuilder;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

public class utils {
  RequestSpecification req;
  public io.restassured.specification.RequestSpecification requestspec() throws FileNotFoundException{
    PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
     RestAssured.baseURI = "https://rahulshettyacademy.com";
   req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key", "qaclick123").addFilter(RequestLoggingFilter.logRequestTo(log))
   .addFilter(ResponseLoggingFilter.logResponseTo(log)).setContentType(io.restassured.http.ContentType.JSON).build();
  return req;
  }
}
