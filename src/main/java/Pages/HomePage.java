package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
        WebDriver driver;

    public HomePage(WebDriver driver){  //constrctor
        this.driver = driver;
    }
    public By RegisterBtn =  By.linkText("REGISTER");

    public void selectRegisterMenu(){
            driver.findElement(RegisterBtn).click();
    }
}
