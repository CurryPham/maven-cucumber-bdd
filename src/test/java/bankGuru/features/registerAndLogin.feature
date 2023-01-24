Feature:  Register and Login

  @register_login
  Scenario: Register to system and login
  Given Open Register Page
    When Input to Email textbox
    And Click to Submit
    Then Get User and password infor
    When Back to Login page
    And Submit valid infor to login form
    Then Home page displayed