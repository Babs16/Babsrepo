Feature: Login to Web Editor
  Scenario: User should be able to Login to Web editor with Valid credentials
    Given Enters valid URL for the Web Editor
    When User enters valid username "bfatade" and Password "Password10"
    And Clicks on Logon button
    Then Editor Homepage should be opened
   # And confirm the Page Title is 'Sports Data Editor'

Scenario: View BHB Meetings and Republish a Meeting
  Given User is on the BHB Meeting screen
  And User clicks on Republish button
  And User confirms republish by clicking Yes on the popover
    #And User clicks Delete icon for the first meeting on the list
    #Then User Confirms Deletion by clicking Delete button on the popover

  Scenario:BHB Events processing
    Given That user clicks on the the first meeting on the list
   #  And User clicks on Delete icon
     #And User confirms Event Deletion by clicking on Delete on the popover
     Then User clicks Runners button
     And Click Delete icon next to a runner on the resulting popup
    # And  User Confirms Deletion by clicking Delete button on the popover
     Then User closes the Runners pop up