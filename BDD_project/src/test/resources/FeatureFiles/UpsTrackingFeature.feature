
Feature: tracking feature

Scenario: track with wrong tracking number

Given : ups tracking page is launched
When  : click on tracking link
And   : click on track and tracking history link
And   : input wrong "trackNum"
And   : click on tracking button
Then  : displayed an error message