Feature: Category Page

  @sanity, @smoke, @regeneration
  Scenario: verifyUserShouldNavigateToWomenCategoryPageSuccessfully()
    Given  I am on the Homepage
    And I Click on WOMEN tab
    Then I Verify "WOMEN" text

  @sanity, @smoke, @regeneration
  Scenario Outline: verifyUserShouldAddProductToTheCartSuccessfully(String product, String qty, String size, String colour)
    Given  I am on the Homepage
    And I Click on WOMEN tab
    And I Click on the product "<product>"
    And I Change quantity "<qty>"
    And I Select size "<size>"
    And I Select colour "<colour>"
    And I Click on Add To Cart Button
    And I Verify the message "Product successfully added to your shopping cart"
    And I Click on X button and close the popup

    Examples:
      | product               | qty | size | colour |
      | Blouse                | 2   | M    | White  |
      | Printed Dress         | 3   | L    | Orange |
      | Printed Chiffon Dress | 4   | S    | Green  |
      | Printed Summer Dress  | 2   | M    | Blue   |