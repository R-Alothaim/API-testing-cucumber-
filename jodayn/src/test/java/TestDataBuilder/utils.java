package TestDataBuilder;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class utils {
  public static RequestSpecification req;
   public static RequestSpecification req2;
  public io.restassured.specification.RequestSpecification requestspec(String u) throws IOException{
    if(req==null){
    PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));
    
   req = new RequestSpecBuilder().setBaseUri(getGlobalValue(u)).addQueryParam("key", "qaclick123").addFilter(RequestLoggingFilter.logRequestTo(log))
   .addFilter(ResponseLoggingFilter.logResponseTo(log)).setContentType(io.restassured.http.ContentType.JSON).build();
  return req;
    }
    return req;
  }

    public io.restassured.specification.RequestSpecification requestspec2(String u) throws IOException{
    if(req2==null){
    PrintStream log = new PrintStream(new FileOutputStream("logging2.txt"));
    
   req2 = new RequestSpecBuilder().setBaseUri(getGlobalValue(u)).addQueryParam("key", "qaclick123").addFilter(RequestLoggingFilter.logRequestTo(log))
   .addFilter(ResponseLoggingFilter.logResponseTo(log)).setContentType(io.restassured.http.ContentType.JSON).build();
  return req2;
    }
    return req2;
  }

  public static String getGlobalValue(String key) throws IOException

  {
    Properties prop = new Properties();
    FileInputStream file = new FileInputStream("C:\\Users\\RayanAlOthaim\\OneDrive - JODAYN\\Documents\\VSC\\API testing\\Proj1\\jodayn\\src\\test\\java\\TestDataBuilder\\global.properties");
    prop.load(file);
   return prop.getProperty(key);
    
  }
  public String getJsonPath(Response response, String key){
    String resp = response.asString();
    JsonPath js = new JsonPath(resp);
   return js.get(key);
  }
}
