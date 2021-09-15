package Tests;

import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.testng.annotations.Test;
import java.io.IOException;

public class UpdateUserTest extends BasePage {
    @Test
    public void UpdateUserFlow() throws InterruptedException, IOException {
        try {
            BasePage.LoginTest();
            //Robot robot = new Robot();
            Thread.sleep(5000);
            CreateUserPage UserPageObj1 = new CreateUserPage(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");

            UserPageObj1.ClickUserBtn();
            Thread.sleep(4000);
            System.out.println("Clicked user button");

           //Update user
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            System.out.println("Clicked edit button");
            UserPageObj1.ClickDisableUser();
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(4000);
            System.out.println("User updated");
            TakesScreen.takeSnapShot(driver,"test-output//User//EditUserFile.jpg");
            Thread.sleep(4000);


            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            System.out.println("Clicked edit button");
            UserPageObj1.ClickEnableUser();
            Thread.sleep(2000);
            System.out.println("Enable User");
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(4000);
            System.out.println("User updated");
            TakesScreen.takeSnapShot(driver,"test-output//User//EnableUser.jpg");
            Thread.sleep(4000);

            //Blank name and Valid password
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClicktoClearName();
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//User//BlankName.jpg");
            Thread.sleep(4000);
            UserPageObj1.ClickCancelBtn();
            Thread.sleep(2000);

            //Blank UserName and Invalid Password
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClicktoClearName();
            Thread.sleep(2000);
            UserPageObj1.ClearPassword();
            Thread.sleep(3000);
            UserPageObj1.EnterPassword(ReadProps.readAttr("pwd"));
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//User//InvalidPassword.jpg");
            Thread.sleep(4000);
            UserPageObj1.ClickCancelBtn();
            Thread.sleep(2000);

            //Invalid Name Blank Password
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClicktoClearName();
            Thread.sleep(2000);
            UserPageObj1.EnterUserName(ReadProps.readAttr("EnterName"));
            Thread.sleep(2000);
            UserPageObj1.ClearPassword();
            Thread.sleep(3000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//User//InvalidName.jpg");
            Thread.sleep(4000);
            System.out.println("Username Updated");
            UserPageObj1.ClickCancelBtn();
            Thread.sleep(2000);

            //Blank UserName Blank Password
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClicktoClearName();
            Thread.sleep(2000);
            UserPageObj1.ClearPassword();
            Thread.sleep(3000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//User//BlankCredentials.jpg");
            Thread.sleep(4000);
            UserPageObj1.ClickCancelBtn();
            Thread.sleep(2000);

            //Invalid UserName Invalid Password
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClicktoClearName();
            Thread.sleep(2000);
            UserPageObj1.EnterUserName(ReadProps.readAttr("EnterName"));
            Thread.sleep(2000);
            UserPageObj1.ClearPassword();
            Thread.sleep(2000);
            UserPageObj1.EnterPassword(ReadProps.readAttr("pwd"));
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//User//InvalidCredentials.jpg");
            Thread.sleep(4000);
            UserPageObj1.ClickCancelBtn();
            Thread.sleep(2000);

            //Valid name and Blank password
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClearPassword();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver,"test-output//User//BlankPwd.jpg");
            Thread.sleep(4000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(3000);
            UserPageObj1.UpdateTimeAssert();
            Thread.sleep(2000);

            driver.close();
        } catch (Exception e) {
            test.log(status.FAIL, e);
        }
    }
}
