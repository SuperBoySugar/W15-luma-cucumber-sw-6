
Feature: Gear Test

  As a user I should able to add product successfully to shopping cart for Gear


  Background: I am on homepage

 @sanity  @smoke
    Scenario:    User should able to add product successfully to shopping cart for Gear
      Given           I move hover on Gear
      When            I click on Bags
      And             I click on Overnight Duffle
      And             I verify the title "Overnight Duffle"
      And             I change quantity "3"
      And             I click on add to Cart
      And             I verify text "You added Overnight Duffle to your shopping cart."
      And             I click on Shopping cart link
      And             I verify Product name "Overnight Duffle"
      And             I verify Product price "$135.00"
      And             I change product quantity "5"
      And             I click on update
      Then            I verify product price "$225.00"

