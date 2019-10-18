#Feature: Ability to View Current Day's Meetings on Source Mapping page

 # Background:

  #  Given User Successfully logs into the CAPP UI
   # And User is on Manage Source Mapping page
    #When User clicks on Today Meeting Details tab
    #Then The list of available meetings for today should be displayed with meeting date shown
    #And Displayed meetings should appear under the following heading
     # | Venue | Location| Meeting Code| Display Name| Short Name| Date| Start Time| End Time| Video| Audio| Pin|
      #| Venues| MK/SL   | 12345  | Henlow          | Henlow    | 19/8/2019| 08:00| 23:00   | No Source| No Source| Pin|
    #And The meetings should be listed in Ascending order by Start Time

  #Scenario: Viewing Meetings available for Current day
   # Given User is on Today's Meeting view page
    #And User displayed meetings are for All Location (MK and SL)
    #And Save button should be available on the View page



  #Scenario: Display Only Meetings with Location MK
   # Given User clicks on Location drop Down button and selects MK
    #Then List of meetings for the selected location (MK) should be displayed next to them
    #And User verifies that meeting details are displayed under appropriate column headings as follows
     # | Venue | Location| Meeting Code| Display Name| Short Name| Date| Start Time| End Time| Video| Audio| Pin|
      #| Venues| MK   | 12345  | Henlow          | Henlow    | 19/8/2019| 08:00| 23:00   | No Source| No Source| Pin|
    #And user will be able to see the meetings


  #Scenario: Display Only Meetings with Location SL
   # Given User clicks on Location drop Down button and selects SL
    #Then List of meetings for the selected location (SL) should be displayed next to them
    #And User verifies that meeting details are displayed under appropriate column headings as follows
     # | Venue | Location| Meeting Code| Display Name| Short Name| Date| Start Time| End Time| Video| Audio| Pin|
      #| Venues| SL  | 12345  | Henlow          | Henlow    | 19/8/2019| 08:00| 23:00   | No Source| No Source| Pin|
    #And User should verify the meetings