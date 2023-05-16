
Feature: Women Test

  As a user I should able to verify the products by name filter and can verify
  the products sort by price filter

  Background: I am on homepage

  @regression
    Scenario:   Verify user should filter product by name
      Given     I mouse hover on Women
      When      I mouse hover on Tops
      And       I mouse hover on Jackets and click
      And       I select on Sort By Product Name "Product Name"
      Then       I verify product are in ascending order


   Scenario:   Verify user should filter by price
     Given      I mouse hover on Women
     When       I mouse hover on Tops
     And        I mouse hover on Jackets and click
     And        I select on Sort By Price "Price"
     Then       I verify product are in low to high

