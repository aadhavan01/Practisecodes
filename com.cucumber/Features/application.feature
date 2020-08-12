Feature: Test fb login credentials

@smoke
  Scenario Outline: Login testing
    Given Open the fb sign in page
    When enter credentials "<username>" and "<password>"
    Then validate the login and close browser

    Examples: 
      | username   |  | password |
      | aadhavan   |  | jhjhgjh  |
      | aadhavan01 |  | jhgjhgk  |
      
      @sanity
   Scenario: test login of fb
      
    Given Open the fb sign in page
    When enter credentials "sceanrio" and "pass"
    Then validate the login and close browser
