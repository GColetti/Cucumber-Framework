#Date: 21-07-2022
#Author: Kiruthika Ramachandran

Feature: Feature to test login Functionality

Scenario: SignIn button should exist
Given User launch the Browser
When User launch Zero Bank Application
Then SignIn button should be Displayed

Scenario: User should login with valid credentials
Given User launch the Browser
And User launch Zero Bank Application
And SignIn button should be Displayed
When User enter valid '<user>' and '<password>'
And Submit the form
Then User should be able to see the userIndex page

Examples:
					|user				| password	|
				#	|usr				| pass			|
					|username		| password	|
