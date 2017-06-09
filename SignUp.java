package Steps;

import medicare.HomePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by Manish on 6/9/2017.
 */
public class SignUp {

    WebDriver driver;
    HomePage objHome;

    public  SignUp(WebDriver driver){
        this.driver=driver;
        objHome = new HomePage(driver);
    }
    public void openSignUp()throws InterruptedException{
        objHome.visitHomePage();
        Thread.sleep(2000);
        objHome.openSignUpPage();
    }
}
