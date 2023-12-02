package seleniumgluecode;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import runner.browser_manager.ChromeDriverManager;
import runner.browser_manager.DriverManager;
import runner.browser_manager.DriverManagerFactory;
import runner.browser_manager.DriverType;

import java.sql.Driver;
import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class Hooks {

    private static WebDriver driver;
    private DriverManager driverManager;
    private static int numberOfCase=0;


    @Before
    public void Initialize() {

        numberOfCase++;
        System.out.println("Se esta ejecutando el escenario nro: " + numberOfCase);
        driverManager = DriverManagerFactory.getManager(DriverType.CHROME);
        driver = driverManager.GetDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void TearDown () {

        System.out.println("El escenario numero: "+numberOfCase+" se ejecuto exitosamente");
        driverManager.QuitDriver();
    }


    public static WebDriver GetDriver () {

        return driver;
    }


    }




