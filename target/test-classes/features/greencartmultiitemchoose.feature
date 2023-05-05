Feature: greencart multiitem choose


@whole1
Scenario: validate add to cart on greencart home page 

Given user is on rahulshetty greencarts home page

When user should click on add to cart button on multiple product
|  product1  |  product2  |  product3  |  product4     |  product5  |  product6  |
|  Tomato    |  Potato    |  Onion     |  Pomegranate  |  Almonds   |  Mushroom  |
Then items present in greencart home page should be increased to 6

@whole2
Scenario: validate product added to cart

When user should click  on the cart

Then multiple product should added to the cart
|  Tomato    |  Potato    |  Onion     |  Pomegranate  |  Almonds   | Mushroom |
@whole3
Scenario: validate place order table

When user click  on proceed to checkout button

Then place order  page should open 

And multiple product is added to product table
|  product1  |  product2  |  product3  |  product4     |  product5  |  product6  |
|  Tomato    |  Potato    |  Onion     |  Pomegranate  |  Almonds   |  Mushroom  |

@whole4
Scenario: validate code is applied

When user enter the promocode"rahulshettyacademy" in promocode textbox

And click on applybutton

Then text "Code applied ..!" is found
@whole5
Scenario: validate is discount is displayed

When text "Code applied ..!" is  found there

Then total amount "424" is found

And discount "10%" is found
@whole6
Scenario: validate total amount after discount is displayed
When discount "10%" is found there

Then total amount after discount "381.6" is found
@whole7
Scenario: validate proceed page
When user click  on place oredr button

Then proceed page  is open 

And choose country  text is found

@whole8
Scenario: validate order should be placed

When user click on select country  dropdown and select country from dropdown

And check the term and  condition chekboxes

And click on  proceed button

Then order  should be placed

@whole9
Scenario: validate thank you message is displayed

When order  is placed

Then thank you  for shopping page is open

And thank you message is displayed
