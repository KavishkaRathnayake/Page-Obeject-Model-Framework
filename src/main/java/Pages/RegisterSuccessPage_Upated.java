package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterSuccessPage_Upated {
    WebDriver driver;

    public RegisterSuccessPage_Upated(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//b[contains(text(),'Dear')]" )
        public WebElement successtext_loc;

    public String RegisterSuccessText(){
        String SuccessText = successtext_loc.getText();
        return SuccessText;
    }
}
