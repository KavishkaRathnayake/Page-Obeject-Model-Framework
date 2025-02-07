package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterSuccessPage {
    WebDriver driver;

    public RegisterSuccessPage(){
        this.driver = driver;
    }

        By successtext_loc = By.xpath("//b[contains(text(),'Dear')]");

    public String RegisterSuccessText(){
        String SuccessText = driver.findElement(successtext_loc).getText();
        return SuccessText;
    }
}
