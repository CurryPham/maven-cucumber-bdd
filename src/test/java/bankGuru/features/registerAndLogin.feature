Feature:  Register and Login

  @register_login
  Scenario: Register to system and login
    Given Open Register Page
    When Input to First name textbox
    And Input to Last name textbox
    And Input to Email textbox
    And Input to Password textbox
    And Input to Confirm Password textbox
    And Click to Submit
    Then Verify Register success
    Given Open Login Page
    And Submit valid infor to login form
    Then Home page displayed