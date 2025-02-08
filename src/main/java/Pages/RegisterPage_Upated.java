package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage_Upated {
    WebDriver driver;

    public RegisterPage_Upated(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "firstName")
    public WebElement firstName_loc;

    @FindBy(xpath = "//input[@name='lastName']")
    public WebElement LastName_loc;

    @FindBy(xpath = "//input[@name='phone']")
    public WebElement Phone_Loc;

    @FindBy(xpath = "//input[@id='userName']")
    public WebElement  email_loc;

    @FindBy(xpath = "//select[@name='country']")
    public WebElement  country_loc;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement  username_loc;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement  password_loc ;

    @FindBy(xpath = "//input[@name='confirmPassword']")
    public WebElement  confirmpassword_loc;

    @FindBy(name = "submit")
    public WebElement  submitBtn_loc;

    public void setFirstName(String firstName){
        firstName_loc.sendKeys(firstName);
    }

    public void setLastName(String lastName){
        LastName_loc.sendKeys(lastName);
    }

    public void setPhone(String phone){
        Phone_Loc.sendKeys(phone);
    }

    public void setEmail(String email){
        email_loc.sendKeys(email);
    }

    public void setCountry(){

        Select select = new Select(country_loc);
        select.selectByIndex(2);
    }

    public void setUsername(String username){
       username_loc.sendKeys(username);
    }
    public void setPassword(String password){
        password_loc.sendKeys(password);
    }

    public void setConfirmpassword(String confirmpassword){
        confirmpassword_loc.sendKeys(confirmpassword);
    }

    public RegisterSuccessPage_Upated setSubmitBtn(){
        submitBtn_loc.click();
        return new RegisterSuccessPage_Upated(driver);
    }


}


