# g_ganeshbabu_C3_Project
Executive PG Programme in Software Development - March'24 - Restaurant Finder Project

## Part 1: UML Diagrams
Design the UML diagram for the below details.
1. Use Case Diagram
   * Identify the Actors involved
   * Identify Use Cases and their associations with actors.
   * Club similar Use Cases into modules.
   * Use relationships between Use Cases, if applicable.
2. Activity Diagram
   * Identify the types of Users
   * Analyze the actions and the sequence of actions

Google Drive : [Link](https://docs.google.com/document/d/1AunVq_vbvbW5agWXDoVU4idy_SR-5A4wae1SPIl_4gE/edit)

## Part 2: Implementing Methods and Tests
The following test methods are also to be implemented:
1. **Restaurant.java**
   - *getMenu()* -Returns the list of items in the menu.
   - *isRestaurantOpen()* - Returns a boolean: whether the restaurant is open or not.
2. **RestaurantService.java**
   - *findRestaurantByName()* -Searches for and returns the restaurant matching the input string. 
3. **RestaurantServiceTest.java**
   - *searching_for_existing_restaurant_should_return_expected_restaurant_object()* - To test if findRestaurantByName() returns the expected restaurant object
   - *searching_for_non_existing_restaurant_should_throw_exception()*-To test if findRestaurantByName() throws an exception when the restaurant cannot be found
4. **RestaurantTest.java**
   - *Is_restaurant_open_should_return_true_if_time_is_between_opening_and_closing_time()*- To test if the method isRestaurantOpen() returns true if the current time is between the opening and closing time.
   - *Is_restaurant_open_should_return_false_if_time_is_outside_opening_and_closing_time()*-To test if the method isRestaurantOpen() returns false if the current time is outside the opening and closing time.

## Part 3: Adding a Feature using TDD 

The features to be developed in TDD way.
* *List down requirements: what parameter has to be passed, what should be returned*
* *Write failing test cases for the feature to be developed*
* *Develop the feature as required to make the test case pass*
* *Running the test case should now lead to a pass case scenario and line coverage should be 98% or more. (You can ignore the methods written for output formatting)*
