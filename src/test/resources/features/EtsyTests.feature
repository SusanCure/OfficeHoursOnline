#Verify that when I click on a submodule then I will be navigated to the corresponding page with the correct title
@etsy
Feature: Etsy Navigation
  Scenario: Clothing & Shoes Submodule
    Given I am on the etsy homepage
    When I click on Clothing & Shoes
    Then the site subtitle will be Clothing & Shoes

    Examples:
     submoduleName |
    | clothing & Shoes |
    | home & Living    |



    Scenario:
      Given I am on the etsy homepage