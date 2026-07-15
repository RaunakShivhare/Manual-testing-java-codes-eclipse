Feature: Banking Application

Scenario: Customer Registration
Given the customer is on the Registration page
When the customer registers with valid details
Then the registration should be successful

Scenario: Customer Login
Given the customer is on the Login page
When the customer enters valid credentials
Then the customer should be logged in successfully

Scenario: Account Summary
Given the customer is logged into the application
When the customer opens the Account Summary page
Then the account details should be displayed

Scenario: Balance Enquiry
Given the customer is logged into the application
When the customer performs a Balance Enquiry
Then the current account balance should be displayed

Scenario: Add Beneficiary
Given the customer is logged into the application
When the customer adds a beneficiary with valid details
Then the beneficiary should be added successfully

Scenario: Fund Transfer
Given the customer is logged into the application
And a beneficiary is already added
When the customer transfers funds to the beneficiary
Then the fund transfer should be successful

Scenario: Mini Statement
Given the customer is logged into the application
When the customer views the Mini Statement
Then the recent transactions should be displayed

Scenario: Transaction History
Given the customer is logged into the application
When the customer views the Transaction History
Then all transactions should be displayed

Scenario: Change Password
Given the customer is logged into the application
When the customer changes the password with valid details
Then the password should be updated successfully

Scenario: Logout
Given the customer is logged into the application
When the customer clicks on Logout
Then the customer should be logged out successfully