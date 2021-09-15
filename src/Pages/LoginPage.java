package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.security.PublicKey;

public class LoginPage {




        WebDriver driver = null;

        By username = By.xpath("//input[@formcontrolname='userName']");
        By password = By.xpath("//input[@formcontrolname='password']");
        By loginBtn = By.xpath("//button[@type='submit']");
        By Logout = By.xpath("//span[@mattooltip='Logout']");
        By ErrorMsgBlankData = By.xpath("//span[contains (text(),'Please Enter Valid Data ...!')]");
            By ErrorMsgInvalidData =By.xpath("//span[contains (text(),'Something Went Wrong ...!')]");




        public LoginPage(WebDriver driver) {
            this.driver = driver;
        }
        //TC 1.1 methods declaration
        public void setUsername(String text) {
            driver.findElement(username).sendKeys(text);
        }
        public void setPassword(String text) {
            driver.findElement(password).sendKeys(text);
        }
        public void clickLoginButton() {
            driver.findElement(loginBtn).click();
        }
        public void ClickLogoutBtn() {
            driver.findElement(Logout).click();
        }
        public void ClearUserID(){driver.findElement(username).clear();}
        public void ClearPWD(){driver.findElement(password).clear();}
        public void VerifyAssertError(){
            String actual_msg=driver.findElement(ErrorMsgBlankData).getText();
            String expect="Please Enter Valid Data ...!";
            Assert.assertEquals(actual_msg, expect);
        }
    public void VerifyAssertErrorInvalidData(){
        String actual_msg=driver.findElement(ErrorMsgInvalidData).getText();
        String expected_msg="Something Went Wrong ...!";
        Assert.assertEquals(actual_msg, expected_msg);
    }
    public void VerifyHomePage(){
        String actual_page=driver.getCurrentUrl();
        String expected_page="https://alpha.neutrino-ai.com/#/home/project-management";
        Assert.assertEquals(actual_page, expected_page);
    }}







