import Steps.SignUp;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

/**
 * Created by Manish on 6/9/2017.
 */
public class Test {
    WebDriver driver;

    @org.testng.annotations.BeforeClass
    public void openBrowser(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\maade\\Desktop\\geckodriver.exe");
        driver =new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterClass
    public void closeBrowser(){
       // driver.close();
        driver.quit();
    }

    @org.testng.annotations.Test
    public void verifySignUppage()throws InterruptedException{
        SignUp steps = new SignUp(driver);
        Thread.sleep(2000);
        steps.openSignUp();
    }
}
