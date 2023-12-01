package seleniumgluecode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPage;

public class TestBase {

    protected WebDriver driver = Hooks.GetDriver();

    protected LoginPage loginPage;




}
