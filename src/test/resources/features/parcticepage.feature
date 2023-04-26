Feature: register page

Scenario: validate the register page 

Given user is on rahullshetty home page

When user click on practice page link

Then user move towards register page

And validate "Join now to Practice" text on register page

When user gives name as "Ravi aggarwal" and email as"ravdel216gmail.com"

And select the check box

And click on submit button

Then validate automation project page is open 

And validate "OUR PROJECTS" text is found

When user click on autoamation practice1

Then Greenkart product page is open

And logo is found "GREENKART"


