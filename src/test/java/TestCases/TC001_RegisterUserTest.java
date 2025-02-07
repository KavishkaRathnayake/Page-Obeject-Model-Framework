package TestCases;

import Pages.HomePage;
import Pages.RegisterPage;
import Pages.RegisterSuccessPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC001_RegisterUserTest {
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

    public void TC001(){
        HomePage homePage = new HomePage(driver);
        homePage.selectRegisterMenu();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.setFirstName("Kavishka");
        registerPage.setLastName("Rathnayake");
        registerPage.setEmail("kavishka@abc.com");
        registerPage.setCountry();
        registerPage.setUsername("Kavishka");
        registerPage.setUsername("kavi");
        registerPage.setPassword("123");
        registerPage.setConfirmpassword("123");
        registerPage.setSubmitBtn();

        RegisterSuccessPage registerSuccessPage = new RegisterSuccessPage();
        String ActualText = registerSuccessPage.RegisterSuccessText();
        Assert.assertTrue(ActualText.contains("Dear"), "Registration attempt failed");

    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }
}
