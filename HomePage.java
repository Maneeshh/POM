package medicare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Manish on 6/9/2017.
 */
public class HomePage {
    WebDriver driver;
    String baseUrl ="https://www.medicare.gov/";

    public HomePage(WebDriver drv){
        this.driver = drv;
    }

    By signUpLink = By.linkText("Sign Up / Change Plans");

    public void visitHomePage(){
        driver.get(baseUrl);
    }

    public void openSignUpPage(){
        driver.findElement(signUpLink).click();
    }
}
