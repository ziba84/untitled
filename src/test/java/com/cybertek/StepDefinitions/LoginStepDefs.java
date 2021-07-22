package com.cybertek.StepDefinitions;

import com.cybertek.Pages.LoginPage;
import com.cybertek.Utilities.ConfigurationReader;
import com.cybertek.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @Given("I am on login page")
    public void i_am_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("I login as librarian")
    public void i_login_as_librarian() {
        String username = ConfigurationReader.getProperty("lib13_user");
        String password = ConfigurationReader.getProperty("lib13_pass");
        loginPage.librarianUserName.sendKeys(username);
        loginPage.librarianPassword.sendKeys(password);
        loginPage.signInButton.click();
    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        String expected = "dashbord";

        wait.until(ExpectedConditions.urlContains(expected));
        String actual = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actual.contains(expected));


    }


    @When("I login as student")
    public void iLoginAsStudent() {

        String username = ConfigurationReader.getProperty("stu11_user");
        String password = ConfigurationReader.getProperty("stu11_pass");
        loginPage.librarianUserName.sendKeys(username);
        loginPage.librarianPassword.sendKeys(password);
        loginPage.signInButton.click();
    }


    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("I enter username {string}")
    public void iEnterUsername(String arg0) {
        loginPage.librarianUserName.sendKeys(arg0);
    }

    @And("I enter password {string}")
    public void iEnterPasswordAOYKYTMJ(String arg1) {
        loginPage.librarianPassword.sendKeys(arg1);

    }

    @And("click the sign in button")
    public void clickTheSignInButton() {
        loginPage.signInButton.click();
    }

    @And("there should be {int} users #numbercan be whatever you have there")
    public void thereShouldBeUsersNumbercanBeWhateverYouHaveThere(int arg0) {
        int expected = arg0;

        wait.until(ExpectedConditions.visibilityOf(loginPage.userCount));
        String Expected = String.valueOf(expected);
        String actual = loginPage.userCount.getText();
        Assert.assertEquals("actual user count doesnt match with expeted" + actual, expected);
    }

    @When("I login using {string}and {string}")
    public void iLoginUsingAnd(String username, String password) {
        loginPage.librarianUserName.sendKeys(username);
        loginPage.librarianPassword.sendKeys(password);


    }

    @And("there should be {int} users #number can be whatever you have there")
    public void thereShouldBeUsersNumberCanBeWhateverYouHaveThere(int arg0) {
        int expected = arg0;

        wait.until(ExpectedConditions.visibilityOf(loginPage.userCount));
        String Expected = String.valueOf(expected);
        String actual = loginPage.userCount.getText();
        Assert.assertEquals( actual, expected);
    }

}


