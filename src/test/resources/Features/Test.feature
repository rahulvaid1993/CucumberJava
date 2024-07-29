Feature: validating Place API's

Scenario: Verify if place is being added sucessfully using AddPlace API
  Given Add Place Payload
  When user calls "AddPlaceAPI" with Post http request
