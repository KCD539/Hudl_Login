package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


import static steps.Hooks.*;

public class HudlSteps {
    @And("under {string} user types {string} in input box")
    public void underUserTypesInInputBox(String input, String field) {
        switch (input) {
            case "Email":
                loginPage.emailInput.sendKeys(field);
                break;
            case "Password":
                loginPage.passwordInput.sendKeys(field);
                break;
            case "Organization Email":
                organizationLoginPage.organizationEmailInput.sendKeys(field);
                break;
            default:
                System.out.println("Invalid Field Error!!!");
        }


    }

    @When("user clicks on {string} button")
    public void userClicksOnButton(String buttonName) {
        switch (buttonName){
            case "Log In":
                loginPage.logInButton.click();
                break;
            case "Log In with an Organization":
                loginPage.organizationLogIn.click();
                break;
            case "High Schools, Clubs & Colleges":
                signUpPage.highSchoolsClubsCollegesButton.click();
                break;
            case "Login In in Organization Page":
                organizationLoginPage.organizationLogInButton.click();
                break;
            case "Sign up":
                loginPage.signUpLink.click();
                break;
            default:
                System.out.println("Invalid Button Error!!!");
        }

    }

    @Then("user should see alert {string} message")
    public void userShouldSeeAlertMessage(String message) {
        switch (message){
            case "This account can't log in with an organization yet. Please log in using your email and password.":
                Assert.assertEquals(message, organizationLoginPage.errorMessage.getText());
                break;
            default:
                System.out.println("Invaild Alert Message!!!");
        }
    }



    @Then("user selects remember me checkbox")
    public void userSelectsCheckbox() {
        loginPage.rememberMeCheckBox.click();

    }
}
