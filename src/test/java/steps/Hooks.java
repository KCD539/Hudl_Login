package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.OrganizationLoginPage;
import pages.SignUpPage;
import utils.Driver;

public class Hooks {

    public static WebDriver driver;
    public static LoginPage loginPage;

    public static OrganizationLoginPage organizationLoginPage;

    public static SignUpPage signUpPage;

    @Before
    public void setup(){
        driver = Driver.getDriver();
        loginPage = new LoginPage(driver);
        organizationLoginPage = new OrganizationLoginPage(driver);
        signUpPage = new SignUpPage(driver);
    }

    @After
    public void teardown(Scenario scenario){
        System.out.println("Scenario = " + scenario.getName() + "\nStatus = " +  scenario.getStatus());
        try{
            if(scenario.isFailed()){
                byte[] screenshot = ((TakesScreenshot)Driver.getDriver())
                        .getScreenshotAs(OutputType.BYTES);

                scenario.embed(screenshot, "image/png");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            Driver.quitDriver();
        }
    }
}