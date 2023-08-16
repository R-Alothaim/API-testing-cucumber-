package Pojo2;

import java.util.List;

import com.graphbuilder.struc.LinkedList;

public class loca {
  private location location;
  private int accuracy;
  private String name;
  private String phone_number;
  private String address;
private String Website;
private String language;
private List<String> types;

  public List<String> getTypes() {
    return this.types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }
  public String getWebsite() {
    return this.Website;
  }

  public void setWebsite(String Website) {
    this.Website = Website;
  }

  public String getLanguage() {
    return this.language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }
  public location getLocation() {
    return this.location;
  }

  public void setLocation(location location) {
    this.location = location;
  }

  public int getAccuracy() {
    return this.accuracy;
  }

  public void setAccuracy(int accuracy) {
    this.accuracy = accuracy;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone_number() {
    return this.phone_number;
  }

  public void setPhone_number(String phone_number) {
    this.phone_number = phone_number;
  }

  public String getAddress() {
    return this.address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

}
