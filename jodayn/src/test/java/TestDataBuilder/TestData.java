package TestDataBuilder;

import java.util.LinkedList;

import Pojo2.loca;
import Pojo2.location;
import io.restassured.path.json.JsonPath;
public class TestData {
public loca addplace(String name, String language, String address) {
 loca locaMain = new loca();
  location locationValues = new location();
  locationValues.setLat(-38.383494);
  locationValues.setLng(33.427362);
  locaMain.setLocation(locationValues);
  locaMain.setAccuracy(50);
  locaMain.setName(name);
  locaMain.setPhone_number("(+91) 983 893 3937");
  LinkedList<String> L = new LinkedList<String>();
  L.add("shoe park");
  L.add("shop");
  locaMain.setTypes(L);
  locaMain.setAddress(address);
  locaMain.setWebsite("http://google.com");
  locaMain.setLanguage(language);

return locaMain;

  }
  public String deleteplace(String place_id) {
    return "{\r\n    \"place_id\":\""+place_id+"\"\r\n}";
  }
}
