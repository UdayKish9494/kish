Feature: flipkart login and add one item to cart

      
     Scenario: flipkart login with valid credentials
     Given load url of flipkart
     And enter userid and password
     Then user should login sucessfully
     When user selected a item to add
     Then item should be added to cart