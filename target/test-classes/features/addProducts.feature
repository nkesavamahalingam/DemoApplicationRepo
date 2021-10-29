@apptest

Feature: Application Test - Add products to wishlist

Scenario Outline: Verify_Customer_Add_The_Product_In_Wishlist_And_Add_To_Cart_<tc_id>
	Given I add "<no_of_products>" different products to my wishlist
	When I view my wishlist table
	Then I find total "<no_of_products>" selected items in my wishlist
	When I search for "<product_rate>" price product
	And I am able to add the "<product_rate>" price item to my cart
	Then I am able to verify the item in my cart
	
	Examples:
		| tc_id | no_of_products | product_rate |
		| TC_001| 4							 |	lowest			| 
		