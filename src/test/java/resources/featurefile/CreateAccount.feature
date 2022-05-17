Feature: Register

  @sanity, @smoke, @regeneration
  Scenario Outline: verifyThatUserShouldCreateAccountSuccessfully()
    Given I am on the Homepage
    When I click on sign in link
    And Enter email address "<email>"
    And Click on Create an account button
    And I enter First Name "<Firstname>"
    And I enter Last Name "<lastname>"
    And I enter password "<password>"
    And I enter Address "<Address>"
    And I enter City "<City>"
    And I enter State "<State>"
    And I enter PostCode "<PostCode>"
    And I enter phone number "<PhoneNumber>"
    And I click on register button
    And Verify message My Account "<Message>"

    Examples:
      | email           | Firstname | lastname | password | Address           | City   | State     | PostCode | PhoneNumber | Message    |
      | rl123@gmail.com | Ron       | Jira     | r123456  | 105 london street | london | Louisiana | 11111    | 07123456789 | MY ACCOUNT |
