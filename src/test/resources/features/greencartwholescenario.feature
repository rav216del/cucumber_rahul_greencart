Feature: greencart whole page

Background: 

#Given user is on rahulshetty greencart page

@whole1
Scenario: validate add to cart on greencart page 

Given user is on rahulshetty greencart page

When user should click on add to cart button on "Apple" product 

Then items present in greencart page should be increased

@whole1
Scenario: validate product added to cart

When user should click on the cart

Then product "Apple" should added to the cart

@whole1
Scenario: validate place order table

When user click on proceed to checkout button

Then place order page should open 

And product is added to product table

@whole
Scenario: validate product page

When user click on place oredr button

Then proceed page is open 

And choose country text is found

#@whole
#Scenario: validate order should be placed

When user click on select country dropdown and select country from dropdown

And check the term and condition chekboxes

And click on proceed button

Then order should be placed

#@whole
#Scenario: validate thank you message is displayed

When order is placed

Then thank you for shopping page is open

And thank you msg is displayed