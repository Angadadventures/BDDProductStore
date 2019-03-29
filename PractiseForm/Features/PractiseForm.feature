@Process1
Feature: Insert Product feature

  Scenario: User is trying to add product with invalid set of details
    Given User is accessing Product registration page on browser
		When user is trying to submit data without entering 'Product Id'
		Then  "Product Id should not be empty / length between 3 to 9" should be displayed
		
		When user is trying to submit data without entering 'Product name'
		Then  "Name should not be empty / length be between 12 to 7" should be displayed
		
		When user is trying to submit data without entering 'Price'
		Then  "Price should not be empty and must have Digits only" should be displayed
		
		When user is trying to submit data without entering 'Address'
		Then  "Store address must have alphanumeric characters only" should be displayed
		
		When user is trying to submit data without entering 'city'
		Then  "Select your city from the list" should be displayed
		
		When user is trying to submit data without entering 'Email'
		Then  "You have entered an invalid email address!" should be displayed
		
		When user is trying to submit data without entering 'Product Category'
		Then  "Please Select Product category" should be displayed
	
	Scenario: user is trying to register using valid set of details
 	  Given  User is on Product registration page on Browser
 	  When  User is trying to submit request after entring valid set of information 
 	  Then 'Your Succesfully added a Product ' should be displayed
	
		
		
		
		
		
		
		
		
		
