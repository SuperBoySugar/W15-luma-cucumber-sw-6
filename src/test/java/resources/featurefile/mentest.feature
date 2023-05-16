
Feature: Men Test

  As a user I should able to add product successfully to shopping cart

  Background: I am on homepage

    @smoke
    Scenario:   User should able to add product successfully to shopping cart
      Given     I mouse hover on Men
      When      I mouse hover on Bottom
      And       I click on Pants
      And       I mouse hover on Product Name
      And       I click on Size
      And       I click on Colour Black
      And       I click on add to cart
      And       I verify text message "You added Cronus Yoga Pant to your shopping cart."
      And       I click on shopping cart
      And       I verify shopping cart title "Shopping Cart"
      And       I verify product name "Cronus Yoga Pant"
      And       I verify product size "32"
      Then      I verify product colour "Black"