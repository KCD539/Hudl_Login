package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationLoginPage {
    public OrganizationLoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='uniId_1']")
    public WebElement organizationEmailInput;

    @FindBy(xpath = "//button[ text()='Log In']")
    public WebElement organizationLogInButton;

    @FindBy(xpath = "//p[@class='uni-text']")
    public WebElement errorMessage;

}
