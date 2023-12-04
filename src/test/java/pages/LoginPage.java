package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

    private WebDriver driver;


    @FindBy(how = How.NAME, using = "email")
    private WebElement emailInputLocator;

    @FindBy(how = How.NAME, using = "password")
    private WebElement passwordInputLocator;

    @FindBy(how = How.XPATH, using = "//input[@type='submit']")
    private WebElement loginButtonLocator;

    @FindBy(how = How.LINK_TEXT, using = "Forgotten Password")
    private WebElement forgottenPasswordLinkLocator;

    @FindBy(how = How.LINK_TEXT, using = "Logout")
    private WebElement logoutLinkLocator;

    @FindBy(how = How.CSS, using = ".alert-danger")
    private WebElement alertText;



    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        }


    public void enterEmail(String email) {
        emailInputLocator.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInputLocator.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButtonLocator.click();
    }

    public void clickForgottenPasswordLink() {
        forgottenPasswordLinkLocator.click();
    }

    public boolean checkForgotPwdLink() {

        return forgottenPasswordLinkLocator.isDisplayed();
    }

    public boolean checkLogoutLink(){
        return logoutLinkLocator.isDisplayed();
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
    }

    public String getForgotPwdPageUrl(){
        String forgotPwdPageUrl = driver.getCurrentUrl();
        return forgotPwdPageUrl;
    }

    public WebElement getAlertText () {

        return alertText;

    }


}