package TestDataBuilder;

import java.util.LinkedList;

import Pojo2.loca;
import Pojo2.location;
import io.restassured.path.json.JsonPath;
public class TestData {
public loca addplace() {
 loca locaMain = new loca();
  location locationValues = new location();
  locationValues.setLat(-38.383494);
  locationValues.setLng(33.427362);
  locaMain.setLocation(locationValues);
  locaMain.setAccuracy(50);
  locaMain.setName("Frontline house");
  locaMain.setPhone_number("(+91) 983 893 3937");
  LinkedList<String> L = new LinkedList<String>();
  L.add("shoe park");
  L.add("shop");
  locaMain.setTypes(L);
  locaMain.setAddress("29, side layout, cohen 09");
  locaMain.setWebsite("http://google.com");
  locaMain.setLanguage("French-IN");

return locaMain;

  }
}
