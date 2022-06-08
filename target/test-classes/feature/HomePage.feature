@CompeleteHomePageTest
Feature: Test scenarios for Home Page

	Background: 
		Given User is on Retail website
		
		#done
		@HomePageTest1
		Scenario: User verify currency values change
		When User click on Currency
		And User Choose Euro from dropdown
		Then currency value should change to Euro


		#done
		@HomePageTest2
		Scenario: User empty Shopping cart message displays
		When User click on shopping cart
		Then “Your shopping cart is empty!” message should display

