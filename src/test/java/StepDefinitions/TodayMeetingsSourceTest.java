package StepDefinitions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class TodayMeetingsSourceTest {

    public WebDriver driver=null;




    @Given("^User Successfully logs into the CAPP UI$")
    public void user_Successfully_logs_into_the_CAPP_UI() throws Throwable {

        //System.setProperty("")

        System.out.println("Testing the myscript 1");

    }

    @Given("^User is on Manage Source Mapping page$")
    public void user_is_on_Manage_Source_Mapping_page() throws Throwable {
        System.out.println("Testing the myscript 133");

    }

    @When("^User clicks on Today Meeting Details tab$")
    public void user_clicks_on_Today_Meeting_Details_tab() throws Throwable {
        System.out.println("Testing the myscript 5 451");

    }

    @Then("^The list of available meetings for today should be displayed with meeting date shown$")
    public void the_list_of_available_meetings_for_today_should_be_displayed_with_meeting_date_shown() throws Throwable {

    }

    @Then("^Displayed meetings should appear under the following heading$")
    public void displayed_meetings_should_appear_under_the_following_heading(DataTable heading) throws Throwable {

        List<List<String>>data=heading.raw();

    }

    @Then("^The meetings should be listed in Ascending order by Start Time$")
    public void the_meetings_should_be_listed_in_Ascending_order_by_Start_Time() throws Throwable {

    }

    @Given("^User is on Today's Meeting view page$")
    public void user_is_on_Today_s_Meeting_view_page() throws Throwable {

    }

    @Given("^User displayed meetings are for All Location \\(MK and SL\\)$")
    public void user_displayed_meetings_are_for_All_Location_MK_and_SL() throws Throwable {

    }

    @Given("^Save button should be available on the View page$")
    public void save_button_should_be_available_on_the_View_page() throws Throwable {


    }

    @Given("^User clicks on Location drop Down button and selects MK$")
    public void user_clicks_on_Location_drop_Down_button_and_selects_MK() throws Throwable {


    }

    @Then("^List of meetings for the selected location \\(MK\\) should be displayed next to them$")
    public void list_of_meetings_for_the_selected_location_MK_should_be_displayed_next_to_them() throws Throwable {

    }

    @Then("^User verifies that meeting details are displayed under appropriate column headings as follows$")
    public void user_verifies_that_meeting_details_are_displayed_under_appropriate_column_headings_as_follows(DataTable XYZ) throws Throwable {

        List<List<String>>data=XYZ.raw();

    }

    @Then("^user will be able to see the meetings$")
    public void user_will_be_able_to_see_the_meetings() throws Throwable {

    }

    @Given("^User clicks on Location drop Down button and selects SL$")
    public void user_clicks_on_Location_drop_Down_button_and_selects_SL() throws Throwable {

    }

    @Then("^List of meetings for the selected location \\(SL\\) should be displayed next to them$")
    public void list_of_meetings_for_the_selected_location_SL_should_be_displayed_next_to_them() throws Throwable {

    }

    @Then("^User should verify the meetings$")
    public void user_should_verify_the_meetings() throws Throwable {

    }
}
