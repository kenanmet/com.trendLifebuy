package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AdminDashboardPage;
import pages.AdminLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US033 {
    AdminLoginPage adminLoginPage=new AdminLoginPage();
    AdminDashboardPage adminDashboardPage=new AdminDashboardPage();

    // [login steps for admin page]
    @Given("user goes to admin login page")
    public void user_goes_to_admin_login_page() {
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
    }
    @Then("enters valid email to mail box")
    public void enters_valid_email_to_mail_box() {
        adminLoginPage.eMailBox.sendKeys(ConfigReader.getProperty("adminValidMail"));
    }
    @Then("enters valid password to password box")
    public void enters_valid_password_to_password_box() {
        adminLoginPage.passwordBox.sendKeys(ConfigReader.getProperty("adminValidPassword"));
    }
    @Then("clicks to the sign in button")
    public void clicks_to_the_sign_in_button() {
        adminLoginPage.signInBtn.click();
    }
    @Then("clicks to customer button")
    public void clicks_to_customer_button() {
        adminDashboardPage.customerBtn.click();
    }
    @Then("clicks to all customer button")
    public void clicks_to_all_customer_button() {
        adminDashboardPage.allCustomerBtn.click();
    }

    // [TC001]
    @And("user verifies that he is on page All customer")
    public void userVerifiesThatHeIsOnPageAllCustomer() {
        String expectedUrl = "https://trendlifebuy.com/customer/all-customer-list";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    // [TC002]
    @And("verifies that the All Customer List is visible")
    public void verifiesThatTheAllCustomerListIsVisible() {
        Assert.assertTrue(adminDashboardPage.allCustomerList.isDisplayed());
    }

    // [TC003]
    @And("clicks to sorting button")
    public void clicksToSortingButton() {
        adminDashboardPage.sortingBtn.click();
    }
    @Then("clicks to is active radio button")
    public void clicksToIsActiveRadioButton() throws InterruptedException {
        Thread.sleep(3000);
        adminDashboardPage.isActiveRadioBtn.click();
    }
    @And("verifies that success toast massage is displayed")
    public void verifiesThatSuccessToastMassageIsDisplayed() {
        Assert.assertTrue(adminDashboardPage.successToastMessage.isDisplayed());
    }

    // [TC004]
    @Then("clicks to the active customer link")
    public void clicksToTheActiveCustomerLink() {
        adminDashboardPage.activeCustomerLink.click();
    }
    @Then("verifies that the Active Customer List is visible")
    public void verifiesThatTheActiveCustomerListIsVisible() {
        Assert.assertTrue(adminDashboardPage.activeCustomerList.isDisplayed());
    }
}
