package TestDataBuilder;

public enum APIResourcesPet {
  addPlaceAPI("/pet");

  private String resource;
  APIResourcesPet(String resource){
    this.resource = resource;
  }
  public String getResource() {
    return resource;
  }
}