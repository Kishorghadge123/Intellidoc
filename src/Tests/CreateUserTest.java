package Tests;

import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class CreateUserTest extends BasePage
{
    @Test
    public void CreateUserFlow() throws InterruptedException, IOException
    {
        try
        {
            BasePage.LoginTest();

            Thread.sleep(3000);
            CreateUserPage UserPageObj = new CreateUserPage(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");

            //Blank username and Blank ID
            UserPageObj.ClickUserBtn();
            Thread.sleep(3000);
            UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(2000);
            System.out.println("Please Check Form Detail...!");
            TakesScreen.takeSnapShot(driver,"test-output//UserCreation//InvalidUsernameId.jpg");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);

            // Valid Username Blank ID
            UserPageObj.EnterUserName(ReadProps.readAttr("CUName"));
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(2000);
            System.out.println("Please Check Form Detail...!");
            TakesScreen.takeSnapShot(driver,"test-output//UserCreation//ValidUserNameBlankId.jpg");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);

            //Blank Username Valid ID
            UserPageObj.EnterEmail(ReadProps.readAttr("CUEmail"));
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(2000);
            System.out.println("Please Check Form Detail...!");
            TakesScreen.takeSnapShot(driver,"test-output//UserCreation//BlankUsernameValidId.jpg");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);

            //Invalid UserName Blank ID
            UserPageObj.EnterUserName(ReadProps.readAttr("CUname"));
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(2000);
            System.out.println("Please Check Form Detail...!");
            TakesScreen.takeSnapShot(driver,"test-output//UserCreation//InvalidUsernameBlankId.jpg");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);

            // Blank UserName Invalid Id
            UserPageObj.EnterEmail(ReadProps.readAttr("CUemail"));
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(2000);
            System.out.println("Please Check Form Detail...!");
            TakesScreen.takeSnapShot(driver,"test-output//UserCreation//BlankUserNameInvalidId.jpg");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);

            //  Invalid Credential
            UserPageObj.EnterUserName(ReadProps.readAttr("CUname"));
            Thread.sleep(2000);
            UserPageObj.EnterEmail(ReadProps.readAttr("CUemail"));
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(2000);
            System.out.println("Please Check Form Detail...!");
            TakesScreen.takeSnapShot(driver,"test-output//UserCreation//InvalidCredentials.jpg");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);

            //Blank Credentials
            UserPageObj.ClickCreateBtn();
            Thread.sleep(2000);
            System.out.println("Please Check Form Detail...!");
            TakesScreen.takeSnapShot(driver,"test-output//UserCreation//BlankCredentials.jpg");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);


            //Valid UserName Valid ID
            UserPageObj.EnterUserName(ReadProps.readAttr("CUName"));
            Thread.sleep(2000);
            UserPageObj.EnterEmail(ReadProps.readAttr("CUEmail"));
            Thread.sleep(2000);
            UserPageObj.ClickActiveUser();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//UserCreation//ValidUsernameValidId.jpg");
            Thread.sleep(2000);
            UserPageObj.ClickCancelBtn();
            Thread.sleep(2000);

            //Creation Of User
            /*UserPageObj.ClickCreateUserBtn();
            Thread.sleep(2000);
            UserPageObj.EnterUserName(ReadProps.readAttr("Username4"));
            Thread.sleep(2000);
            UserPageObj.EnterEmail(ReadProps.readAttr("UserEmail"));
            Thread.sleep(2000);
            UserPageObj.ClickActiveUser();
            Thread.sleep(2000);
            UserPageObj.ClickCreateBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//User//UserCreate.jpg");
            Thread.sleep(2000);
            System.out.println("User Created Successfully");
            Thread.sleep(2000);*/

            UserPageObj.CreateUserAssert();
            Thread.sleep(2000);
            System.out.println("User Created");

           /* UserPageObj.TimeAssert();
            Thread.sleep(2000);
            System.out.println("Time Assert Pass ");*/

            //Search for already Created user
            UserPageObj.SearchCreatedUser(ReadProps.readAttr("Username4"));
            Thread.sleep(2000);
            UserPageObj.SelectSearchedUser();
            Thread.sleep(2000);
            UserPageObj.ClickCancelBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//UserCreation//OpenUserCreated.jpg");
            Thread.sleep(2000);
            UserPageObj.SelectSearchedUser();
            Thread.sleep(2000);
            UserPageObj.ClickUpdateUser();
            Thread.sleep(2000);



            driver.close();
        }
        catch (Exception e)
        {
            test.log(status.FAIL, e);
        }
    }
}


