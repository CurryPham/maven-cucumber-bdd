@customer
Feature:  Register/ Login and new Customer

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

  @new_customer
  Scenario Outline: New Customer
    #link

    Given Open "My account" navbar page
    And Open "Customer info" page

    #Radio button
    When Click to "Male" radion button

     #Text box
    And Input to "FirstName" textbox with value "<FirstName>"
    And Input to "LastName" textbox with value "<LastName>"
    And Select to "DateOfBirthDay" dropdown list with value "<Date>"
    And Select to "DateOfBirthMonth" dropdown list with value "<Month>"
    And Select to "DateOfBirthYear" dropdown list with value "<Year>"
    And Input to "Email" textbox with value "<Email>"

    #Checkbox
    And Input to "Newsletter" checkbox

    #Button
    And Click to "Save" button

    #Message
    Then Success message displayed with "The customer info has been updated successfully...."

    #Text

    And The valid value displayed at "FirstName" with "<FirstName>"
    And The valid value displayed at "LastName" with "<LastName>"
    And The valid value by name displayed at "DateOfBirthDay" with "<Date>"
    And The valid value by name displayed at "DateOfBirthMonth" with "<ValueMonth>"
    And The valid value by name displayed at "DateOfBirthYear" with "<Year>"
    And The valid value displayed at "Email" with "<Email>"

    Examples:
      | Gender | FirstName | LastName | Date | Month    | Year | Email                | ValueMonth |
      | Male   | Curry     | Pham     | 10   | December | 2000 | curry.pham@gmail.com | 12         |