Feature: Get product
  Scenario: Through api
    Given I hit the url to get api response
    When I pass the url of porduct
    Then url should give status code 200