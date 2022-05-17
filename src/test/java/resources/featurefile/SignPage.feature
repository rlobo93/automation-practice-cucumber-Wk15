Feature: Login Test
  @smoke, @regeneration
  Scenario: userShouldNavigateToSignInPageSuccessFully
    Given I am on the Homepage
    When I click on sign in link
    Then I verify text <"AUTHENTICATION">

  @sanity, @regeneration
  Scenario Outline: verifyTheErrorMessageWithInValidCredentials(String username, String password,String message).
    Given I am on the Homepage
    When I click on sign in link
    And I Enter username "<email>"
    And I Enter password "<password>"
    And I Click on Sign in Button
    Then I Verify the Error message "<Message>"

    Examples:
      | email          | password | Message                    |
      |                | 123456   | An email address required. |
      | abcd@gmail.com |          | Password is required.      |
      | adfdfgfg       | 123456   | Invalid email address.     |
      | abcd@gmail.com | 123456   | Authentication failed.     |

  @sanity, @regeneration
  Scenario: verifyThatUserShouldLogInSuccessFullyWithValidCredentials().
    Given I am on the Homepage
    When I click on sign in link
    And I Enter EmailId <"rl123@gmail.com">
    And I enter password in passwordfield <"r123456">
    And I Click on Sign Button
    And I Verify that Sign out link is displayed

  @sanity, @smoke, @regeneration
  Scenario: verifyThatUserShouldLogOutSuccessFully()
    Given I am on the Homepage
    When I click on sign in link
    And  I Enter EmailId <"rl123@gmail.com">
    And  I enter password in passwordfield <"r123456">
    And  I Click on Sign Button
    And  I Click on Sign out Link
    And  I Verify that Sign In Link displayed