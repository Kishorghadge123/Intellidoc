package Tests;

import Base.BasePage;
import Pages.CreateUserPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;

public class UpdateUserAdminTest extends BasePage {
    @Test
    public void UpdateUserAdminFlow() throws InterruptedException, IOException {
        try {
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");
            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectPath + ".\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            CreateUserPage UserPageObj1 = new CreateUserPage(driver);
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();


            //Admin Login

            UserPageObj1.setUsername(ReadProps.readAttr("AdminUser"));
            Thread.sleep(2000);
            UserPageObj1.setPassword(ReadProps.readAttr("AdminPwd"));
            Thread.sleep(2000);
            UserPageObj1.clickLoginButton();
            Thread.sleep(10000);
            TakesScreen.takeSnapShot(driver, "test-output//AdminUpdateUser//AdminValid.jpg");
            Thread.sleep(2000);
            UserPageObj1.ClickUserBtn();
            Thread.sleep(3000);
            UserPageObj1.SearchCreatedUser(ReadProps.readAttr("AdminUserNm"));
            Thread.sleep(2000);
            UserPageObj1.SelectSearchedAdminUser();
            Thread.sleep(2000);
            System.out.println("Clicked edit button");
            UserPageObj1.ClickDisableUser();
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(2000);
            System.out.println("User updated");
            TakesScreen.takeSnapShot(driver, "test-output//AdminUpdateUser//AdminDisableUserFile.jpg");
            Thread.sleep(6000);


            UserPageObj1.SelectSearchedAdminUser();
            Thread.sleep(1000);
            System.out.println("Clicked edit button");
            UserPageObj1.ClickEnableUser();
            Thread.sleep(2000);
            System.out.println("Enable User");
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(2000);
            System.out.println("User updated");
            TakesScreen.takeSnapShot(driver, "test-output//AdminUpdateUser//AdminEnableUser.jpg");
            Thread.sleep(6000);

            //Update with Blank name
            UserPageObj1.SelectSearchedAdminUser();
            Thread.sleep(1000);
            UserPageObj1.ClicktoClearName();
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//AdminUpdateUser//AdminBlankName.jpg");
            UserPageObj1.UserBlankAssert();
            Thread.sleep(4000);
            UserPageObj1.ClickCancelBtn();
            Thread.sleep(6000);

            //Update with Invalid UserName
            UserPageObj1.SelectSearchedAdminUser();
            Thread.sleep(1000);
            UserPageObj1.ClicktoClearName();
            Thread.sleep(2000);
            UserPageObj1.EnterUserName(ReadProps.readAttr("EnterName"));
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            TakesScreen.takeSnapShot(driver, "test-output//AdminUpdateUser//AdminInvalidCredentials.jpg");
            UserPageObj1.UserBlankAssert();
            Thread.sleep(6000);
            UserPageObj1.ClickCancelBtn();
            Thread.sleep(4000);


            // Update with Valid Name
            UserPageObj1.SelectSearchedAdminUser();
            Thread.sleep(3000);
            UserPageObj1.ClicktoClearName();
            Thread.sleep(3000);
            UserPageObj1.EnterUserName(ReadProps.readAttr("ValidNameUP"));
            Thread.sleep(2000);
            UserPageObj1.ClickUpdateUser();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//AdminUpdateUser//UpdatewithValid.jpg");
            Thread.sleep(4000);

            // Remove updation for script maintainace only
            UserPageObj1.SearchCreatedUser(ReadProps.readAttr("ValidNameUP"));
            Thread.sleep(2000);
            UserPageObj1.SelectUpdatedUser();
            Thread.sleep(1000);
            UserPageObj1.ClicktoClearName();
            Thread.sleep(2000);
            UserPageObj1.EnterUserName(ReadProps.readAttr("AdminUserNm"));
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
