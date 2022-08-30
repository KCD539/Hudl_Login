package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(id = "logIn")
    public WebElement logInButton;

    @FindBy(xpath = "//button[contains(., 'Log In with an Organization')]")
    public WebElement organizationLogIn;

    @FindBy(xpath = "//a[contains(text(),'Sign up')]")
    public WebElement signUpLink;

    @FindBy(xpath = "//div[@class='uni-form__check-item']")
    public WebElement rememberMeCheckBox;
}
