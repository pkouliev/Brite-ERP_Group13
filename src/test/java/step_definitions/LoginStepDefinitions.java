package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.BrowserUtilities;
import utilities.ConfigurationReader;
import utilities.Driver;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("Open login page");
        String env = "env";
        if (System.getProperty("env") != null) {
            env = System.getProperty("env");
        }
        String URL = ConfigurationReader.getProperty("env");
        System.out.println("URL :: " + URL);
        Driver.getDriver().get(URL);
    }

    @When("user logs in as a POS manager")
    public void user_logs_in_as_a_POS_manager() {
        System.out.println("Login as POS manager");
        loginPage.login("posmanager89@info.com", "posmanager");
    }

    @Then("user should verify title")
    public void user_should_verify_title() {
        System.out.println("Verify that title is a Point of Sale - Odoo");
        BrowserUtilities.waitForPageToLoad(10);
        BrowserUtilities.wait(2);
        Assert.assertEquals("#Inbox - Odoo", Driver.getDriver().getTitle());
    }

    @When("user logs in as a Events manager")
    public void user_logs_in_as_a_Events_manager() {
        System.out.println("Login as Events manager");
        loginPage.login("eventscrmmanager60@info.com", "eventscrmmanager");

    }

    @When("user logs in as a CRM manager")
    public void user_logs_in_as_a_CRM_manager() {
        System.out.println("Login as CRM manager");
        loginPage.login("eventscrmmanager64@info.com", "eventscrmmanager");

    }

    @When("user logs in as {string}")
    public void user_logs_in_as(String userType) {
        loginPage.login(userType);
    }

    @When("user navigates to {string} and {string}")
    public void user_navigates_to_and(String string, String string2) {
        System.out.printf("User clicks on the %s tab and navigates to %s module\n", tab, module);
        loginPage.navigateTo(tab, module);
    }

    @Then("user verifies that page title is {string}")
    public void user_verifies_that_page_title_is(String string) {

    }


}
