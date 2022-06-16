Feature: Goibibo

background:
Given user should launch url

@Regression
Scenario Outline: FlightSearch

Given user should be on flights page
When user enters "<source>" and "<destination>" and date clicks search
Then Flights should be displayed
Then close the browser

Examples:
    | source | destination |
    | Pune | New York |
    | Mumbai| Delhi |

@Regression
Scenario: HotelsSearch

Given user should be on hotels page
When user enters Where dates clicks search
Then Hotels should be displayed
Then close the browser


#Scenario: GoogleTest

#Given user should be on Google page

#Then close the browser
