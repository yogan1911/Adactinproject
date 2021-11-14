Feature: To  Check the booking functionality of the Adactin hotel application



Scenario Outline: user checking the login page with combination of username and password.
Given user launch the application
When user enter the valid "<username>" in the username field
And user enter the valid "<password>" in the password field
Then user clicks on the login button

Examples:
|username | password |
|Arun	  | 12365df  |
|Aravind  | 123Reff  |
|Yogan123|yogan@1911|

Scenario: User Navigate to Search Hotel page
Given User Navigate from login page
When user select the correct location from the drop down menu
And user select the Hotel name from the drop down menu
And user select the room type from the drop down menu
And user select the Number of Rooms from the drop down menu
And user the valid check In date in the Check In Field
And user the valid check Out date in the Check Out Field
And user select the Adults per room from the drop down menu
And user select the Childrens per room from the drop down menu
Then user clicks on the Search button

Scenario: User Navigate from Search Hotel to select hotel page
Given user navigate from search hotel page
When user selects the radio button for the confirmation of their search
Then user clicks on the Continue button

Scenario: User Navigate from Select Hotel to Book hotel page
Given user navigate from select hotel page
When user enter the valid firstname in the firstname field
And user enter the valid lastname in the lastname field
And user enter the valid Billing Address in the Billing Address field
And user enter the valid Credit card number in the Credit card No field
And user select the valid Credit card Type in the given field
And user select the valid Expiry Date in the Month field
And user select the valid Expiry Date in the year field
And user enter the valid CVV number in the CVV number field
Then user clicks on the Book Now button

Scenario: User navigate to Booking confirmation page
Given User navigate from Book hotel page
When user scroll down to My Itinerary Button
Then user clicks on the My Itinerary Button

Scenario: User navigate to My Itinerary Page
Given User navigate from Confimation page
When user takes screen shot of the page
Then user clicks in logout button  
