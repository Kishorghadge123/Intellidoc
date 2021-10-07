package Tests;

import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class CreateUserAdminTest extends BasePage {
    WebDriver driver;

    @Test
    public void CreateUserAdminFlow() throws InterruptedException, IOException {
        try {

            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");
            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectPath + ".\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            CreateUserPage UserPageObj = new CreateUserPage(driver);
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();


            // Login with Admin
            UserPageObj.setUsername(ReadProps.readAttr("AdminUser"));
            Thread.sleep(2000);
            UserPageObj.setPassword(ReadProps.readAttr("AdminPwd"));
            Thread.sleep(2000);
            UserPageObj.clickLoginButton();
            Thread.sleep(10000);
            TakesScreen.takeSnapShot(driver, "test-output//AdminUserCreation//AdminValid.jpg");
            Thread.sleep(2000);

            //Create user with blank data
            UserPageObj.ClickUserBtn();
            Thread.sleep(3000);
            UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            TakesScreen.takeSnapShot(driver, "test-output//AdminUserCreation//AdminBlankUserCreate.jpg");
            UserPageObj.UserBlankAssert();
            Thread.sleep(4000);

            // Create user with valid data
           /* UserPageObj.ClickUserBtn();
            Thread.sleep(3000);
            UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            UserPageObj.EnterUserName(ReadProps.readAttr("AdminUserNm"));
            Thread.sleep(2000);
            UserPageObj.EnterEmail(ReadProps.readAttr("AdminID"));
            Thread.sleep(2000);
            UserPageObj.ClickActiveUser();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//User//AdminUserCreate.jpg");
            Thread.sleep(2000);
            System.out.println("User Created Successfully");
            Thread.sleep(2000);*/


            // Create user with Invalid data
            UserPageObj.ClickUserBtn();
            Thread.sleep(3000);
            UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            UserPageObj.EnterUserName(ReadProps.readAttr("CUname"));
            Thread.sleep(2000);
            UserPageObj.EnterEmail(ReadProps.readAttr("CUemail"));
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            UserPageObj.UserBlankAssert();
            System.out.println("Please Check Form Detail...!");
            TakesScreen.takeSnapShot(driver, "test-output//AdminUserCreation//AdminInvalidCredentials.jpg");
            // UserPageObj.ClickCancelBtn();
            //  Thread.sleep(3000);

            //Active and disable user
            UserPageObj.ClickUserBtn();
            Thread.sleep(3000);
            UserPageObj.SearchCreatedUser(ReadProps.readAttr("AdminUserNm"));
            Thread.sleep(3000);
            UserPageObj.SelectSearchedAdminUser();
            Thread.sleep(2000);
            UserPageObj.ClickDisableUser();
            Thread.sleep(3000);
            UserPageObj.ClickUpdateUser();
            Thread.sleep(4000);
            UserPageObj.SearchCreatedUser(ReadProps.readAttr("AdminUserNm"));
            Thread.sleep(2000);
            UserPageObj.SelectSearchedAdminUser();
            Thread.sleep(2000);
            UserPageObj.ClickActiveUser();
            Thread.sleep(2000);
            UserPageObj.ClickUpdateUser();
            Thread.sleep(4000);

            UserPageObj.LogOut();
            Thread.sleep(6000);

            driver.close();
        } catch (Exception e) {
            test.log(status.FAIL, e);
        }
    }
}
