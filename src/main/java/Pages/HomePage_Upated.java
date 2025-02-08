package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_Upated {
        WebDriver driver;

    public HomePage_Upated(WebDriver driver){  //constrctor
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(linkText = "REGISTER")
    public WebElement registerBtnLoc;

    public RegisterPage_Upated selectRegisterMenu(){
        registerBtnLoc.click();
        return new RegisterPage_Upated(driver);
    }










//    public By RegisterBtn =  By.linkText("REGISTER");
//
//    public void selectRegisterMenu(){
//            driver.findElement(RegisterBtn).click();
//    }
}
