Feature: This is for pet API
@AddPet
Scenario Outline: Verify if Add pet functionality is working
    Given Add pet "<Header 1>" "<Header 2>" "<Header 3>"
    When calls "addPlaceAPI" with "post" http request
    #Then "status" in response body is "OK"
    #And verify place_id created maps to "<Header 1>" using "getPlaceAPI"
    Examples:
      | Header 1 | Header 2 | Header 3 |
      | Ryan     | English  | Riyadh   |
  #| Roon  | Arabic  | Jeddah  |
#@DeletePet
#Scenario: Verify if Delete place functionality is working
 #   Given Delete place payload
  #  When user calls "deletePlaceAPI" with "post" http request
   # Then "status" in response body is "OK"