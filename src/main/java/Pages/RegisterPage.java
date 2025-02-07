package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }


    By firstName_loc =  By.name("firstName");
    By LastName_loc = By.xpath("//input[@name='lastName']");
    By Phone_Loc = By.xpath("//input[@name='phone']");
    By email_loc = By.xpath("//input[@id='userName']");
    By country_loc = By.xpath("//select[@name='country']");
    By username_loc = By.xpath("//input[@id='email']");
    By password_loc = By.xpath("//input[@name='password']");
    By confirmpassword_loc = By.xpath("//input[@name='confirmPassword']");
    By submitBtn_loc = By.name("submit");

    public void setFirstName(String firstName){
        driver.findElement(firstName_loc).sendKeys(firstName);
    }

    public void setLastName(String lastName){
        driver.findElement(LastName_loc).sendKeys(lastName);
    }

    public void setPhone(String phone){
        driver.findElement(Phone_Loc).sendKeys(phone);
    }

    public void setEmail(String email){
        driver.findElement(email_loc).sendKeys(email);
    }

    public void setCountry(){
        WebElement countrySelectElement = driver.findElement(country_loc);
        Select select = new Select(countrySelectElement);
        select.selectByIndex(2);
    }

    public void setUsername(String username){
        driver.findElement(username_loc).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(password_loc).sendKeys(password);
    }

    public void setConfirmpassword(String confirmpassword){
        driver.findElement(confirmpassword_loc).sendKeys(confirmpassword);
    }

    public void setSubmitBtn(){
        driver.findElement(submitBtn_loc).click();
    }


}


