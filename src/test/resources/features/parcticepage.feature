Feature: register page

@smoketest
Scenario: validate the register page 

Given user is on rahullshetty home page

When user click on practice page link

Then user move towards register page

And validate "Join now to Practice" text on register page


@smoketest
Scenario: validate the automation page

Given user is on rahul shetty register page

When user gives name as "Ravi aggarwal" and email as"ravdel216gmail.com"

And select the check box

And click on submit button

Then validate automation project page is open 

And validate "OUR PROJECTS" text is found


@smoketest
Scenario: validate the greencart page

Given user is on rahul shetty automationpage 

When user click on autoamation practice1

Then Greenkart product page is open

And logo is found "GREENKART"

@sanitytest
Scenario Outline:

Given user is on rahulshetty greencart page

When user search for "<product>" with "<shortname>"

Then searched "<product>" is found on greencartpage

Examples:
|  product  |  shortname  |
|  mango    |  man        |
|  tomato   |  tom        |

@regression
Scenario:

#Given user is on rahulshetty greencart page

#When user click on add to cart button on "Mango" product 

#And click on the cart

#Then product "Mango"is added to the cart

#When user click on proceed to checkout 

#Then place order page is open 

#And product is added to table

#When user click on place oredr button

#Then proceed page is open 

#And choose country text is found

#When user click on select country dropdown and select country from dropdown

#And check the term and condition chekboxes

#And click on proceed button

#Then order should be placed

#And thank you for shopping page is open

#And thank you msg is displayed

@explore
Scenario Outline:

Given user is on rahulshetty greencart page

When user click on add to cart button on desired "<product>" 

Then "<product>" is added to the cart

Examples:
|  product  |
|  Carrot   |
|  Corn     |
|  Orange   |

Given user is on rahulshetty greencart page


