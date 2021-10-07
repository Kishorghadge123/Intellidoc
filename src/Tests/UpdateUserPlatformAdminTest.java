package Tests;

import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.testng.annotations.Test;

import java.io.IOException;

public class UpdateUserPlatformAdminTest extends BasePage {
    @Test
    public void PlatformAdminUpdateUserFlow() throws InterruptedException, IOException {
        try {
            BasePage.LoginTest();
            //Robot robot = new Robot();
            Thread.sleep(12000);
            CreateUserPage UserPageObj1 = new CreateUserPage(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");

            UserPageObj1.ClickUserBtn();
            Thread.sleep(5000);
            System.out.println("Clicked user button");

            //Update user enable , disable user

            UserPageObj1.SearchCreatedUser(ReadProps.readAttr("Username4"));
            Thread.sleep(2000);
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            System.out.println("Clicked edit button");
            UserPageObj1.ClickDisableUser();
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(2000);
            System.out.println("User updated");
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUpdateUser//EditUserFile.jpg");
            Thread.sleep(5000);

            UserPageObj1.SearchCreatedUser(ReadProps.readAttr("Username4"));
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            System.out.println("Clicked edit button");
            UserPageObj1.ClickEnableUser();
            Thread.sleep(2000);
            System.out.println("Enable User");
            UserPageObj1.ClickUpdateUser();
            System.out.println("User updated");
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUpdateUser//EnableUser.jpg");
            Thread.sleep(6000);

            //Blank name and Valid password
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClicktoClearName();
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUpdateUser//BlankName.jpg");
            UserPageObj1.UserBlankAssert();
            Thread.sleep(5000);
            UserPageObj1.ClickCancelBtn();
            Thread.sleep(5000);

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
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUpdateUser//InvalidPassword.jpg");
            UserPageObj1.UserBlankAssert();
            Thread.sleep(5000);
            UserPageObj1.ClickCancelBtn();
            Thread.sleep(5000);

            //Invalid Name Blank Password
            UserPageObj1.SearchCreatedUser(ReadProps.readAttr("Username4"));
            Thread.sleep(2000);
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClicktoClearName();
            Thread.sleep(2000);
            UserPageObj1.EnterUserName(ReadProps.readAttr("EnterName"));
            Thread.sleep(2000);
            UserPageObj1.ClearPassword();
            Thread.sleep(3000);
            UserPageObj1.ClickUpdateUser();
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUpdateUser//InvalidName.jpg");
            UserPageObj1.UserBlankAssert();
            Thread.sleep(5000);
            System.out.println("Username Updated");
            UserPageObj1.ClickCancelBtn();
            Thread.sleep(5000);

            //Blank UserName Blank Password
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClicktoClearName();
            Thread.sleep(2000);
            UserPageObj1.ClearPassword();
            Thread.sleep(3000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUpdateUser//BlankCredentials.jpg");
            UserPageObj1.UserBlankAssert();
            Thread.sleep(5000);
            UserPageObj1.ClickCancelBtn();
            Thread.sleep(5000);

            //Invalid UserName Invalid Password
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClicktoClearName();
            Thread.sleep(2000);
            UserPageObj1.EnterUserName(ReadProps.readAttr("EnterName"));
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUpdateUser//InvalidCredentialsErrMsg.jpg");
            Thread.sleep(2000);
            UserPageObj1.ClearPassword();
            Thread.sleep(2000);
            UserPageObj1.EnterPassword(ReadProps.readAttr("pwd"));
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUpdateUser//InvalidCredentials.jpg");
            UserPageObj1.UserBlankAssert();
            Thread.sleep(5000);
            UserPageObj1.ClickCancelBtn();
            Thread.sleep(5000);

            //Valid name and Blank password
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClearPassword();
            Thread.sleep(3000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUpdateUser//BlankPwd.jpg");
            //UserPageObj1.UserBlankAssert();
            Thread.sleep(5000);
            UserPageObj1.UpdateTimeAssert();
            Thread.sleep(2000);


            //Valid Update scenario required
            UserPageObj1.SelectSearchedUser();
            Thread.sleep(1000);
            UserPageObj1.ClicktoClearName();
            Thread.sleep(3000);
            UserPageObj1.EnterUserName(ReadProps.readAttr("ValidNameUP"));
            Thread.sleep(2000);
            UserPageObj1.ClearPassword();
            Thread.sleep(2000);
            UserPageObj1.EnterPassword(ReadProps.readAttr("ValidPWDUP"));
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//PlatformAdminUpdateUser//UpdatewithValid.jpg");
            Thread.sleep(4000);


            //Remove updation for script maintainace only
            UserPageObj1.SearchCreatedUser(ReadProps.readAttr("ValidNameUP"));
            Thread.sleep(2000);
            UserPageObj1.SelectUpdatedUser();
            Thread.sleep(1000);
            UserPageObj1.ClicktoClearName();
            Thread.sleep(2000);
            UserPageObj1.EnterUserName(ReadProps.readAttr("Username4"));
            Thread.sleep(2000);
            UserPageObj1.ClearPassword();
            Thread.sleep(2000);
            UserPageObj1.EnterPassword(ReadProps.readAttr("ValidPWD"));
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(4000);
            UserPageObj1.LogOut();
            Thread.sleep(3000);


            driver.close();
        } catch (Exception e) {
            test.log(status.FAIL, e);
        }
    }
}
