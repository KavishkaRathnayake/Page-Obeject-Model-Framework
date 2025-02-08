package TestCases;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC001_RegisterUserTest_Upated {
    WebDriver driver;

    @BeforeMethod
    public void OpenPage(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBrowserVersion("121");
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().window().maximize();
        driver.get("https://www.demo.guru99.com/test/newtours/");
    }

    @Test

    public void TC001() throws InterruptedException {
        RegisterUser();
        VerifyRegisterUser();
    }

    public void RegisterUser(){
        HomePage_Upated homePageUpated = new HomePage_Upated(driver);
        homePageUpated.selectRegisterMenu();

        RegisterPage_Upated registerPage = new RegisterPage_Upated(driver);
        registerPage.setFirstName("xxxxx");
        registerPage.setLastName("Rathnayake");
        registerPage.setEmail("kavishka@abc.com");
        registerPage.setCountry();
        registerPage.setUsername("Kavishka");
        registerPage.setUsername("baxxxzx xxnba");
        registerPage.setPassword("123");
        registerPage.setConfirmpassword("123");
        registerPage.setSubmitBtn();

    }

    public void VerifyRegisterUser(){
        RegisterSuccessPage_Upated registerSuccessPageUpated = new RegisterSuccessPage_Upated(driver);
        String ActualText = registerSuccessPageUpated.RegisterSuccessText();
        Assert.assertTrue(ActualText.contains("Dear"), "Registration attempt failed");

    }

    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
