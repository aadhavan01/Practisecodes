Feature: Test fb login credentials

@smoke
  Scenario Outline: Login testing
    Given Open the fb sign in page
    When enter credentials "<username>" and "<password>"
    Then validate the login and close browser

    Examples: 
      | username   |  | password |
      | aadhavan   |  | jhjhgjh  |
     
      
      @sanity
   Scenario: Test radio buttons
      
    Given Open the url
    When Click the radio buttons
    Then validate and close the browser
    
    
