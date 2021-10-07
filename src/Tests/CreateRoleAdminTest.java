package Tests;

import Base.BasePage;
import Pages.CreateRolePage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;


public class CreateRoleAdminTest extends BasePage {
    @Test
    public void CreateRoleAdminFlow() throws InterruptedException, IOException {
        try {
            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectPath + ".\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            CreateRolePage CreateRolePageObj = new CreateRolePage(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();


            //Admin ROle

            CreateRolePageObj.EnterUsername(ReadProps.readAttr("AdminUser"));
            Thread.sleep(2000);
            CreateRolePageObj.EnterPassword(ReadProps.readAttr("AdminPwd"));
            Thread.sleep(2000);
            CreateRolePageObj.ClickLoginButton();
            Thread.sleep(12000);

            CreateRolePageObj.ClickRoleManagementBtn();
            Thread.sleep(4000);
            CreateRolePageObj.ClickCreateRoleBtn();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//Role button clicked.jpg");
            Thread.sleep(3000);
            System.out.println("Role button clicked");


            // Blank RoleName and blank permission

            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(2000);
            CreateRolePageObj.VerifyError();
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//BlankRoleNameCreated.jpg");
            System.out.println("Assert Verified Please check form data and permission cannot be empty");
            Thread.sleep(3000);
            driver.navigate().refresh();
            Thread.sleep(4000);

            // Valid Rolename and blank permission
            CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleName"));
            Thread.sleep(4000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(4000);
            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(2000);
            CreateRolePageObj.BlankPermission();
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//ValidName_BLankPermissionRole.jpg");
            System.out.println("Assert Verified Permissions cannot be blank");
            Thread.sleep(3000);
            driver.navigate().refresh();
            Thread.sleep(4000);

            Robot r = new Robot();
            //  Blank Rolename and Valid Permission
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(4000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(4000);
            CreateRolePageObj.SelectViewDocumentPermission();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(7000);
            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(2000);
            CreateRolePageObj.BlankName();
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//BlankName_ValidPermission.jpg");
            System.out.println(" Assert verified Please check form data");
            Thread.sleep(3000);
            CreateRolePageObj.ClickCancelButton();
            Thread.sleep(2000);


            //Valid Rolename Valid Permission
           /*
            CreateRolePageObj.ClickCreateRoleBtn();
            Thread.sleep(4000);
            CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleName"));
            Thread.sleep(4000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(4000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(4000);
            CreateRolePageObj.SelectPermission();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(6000);
            TakesScreen.takeSnapShot(driver,"test-output//Roles//RoleDetails.jpg");
            Thread.sleep(3000);
            System.out.println("Role with valid rolename valid permission");
            CreateRolePageObj.ClickCreateRoleBtn();
            Thread.sleep(4000);*/
            CreateRolePageObj.CreateRoleAssert();
            Thread.sleep(2000);
            System.out.println("Role Created");

            // Repeated Role..Doesnt allow repeat
            CreateRolePageObj.ClickCreateRoleBtn();
            Thread.sleep(4000);
            CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleName"));
            Thread.sleep(4000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(4000);
            CreateRolePageObj.ClickProcessDocPermission();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(7000);
            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(2000);
            CreateRolePageObj.RoleNameExist();
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//RepeatedRole.jpg");
            System.out.println(" Assertion verified Role exist with name AE Admin");
            Thread.sleep(4000);
            CreateRolePageObj.ClickCancelButton();
            Thread.sleep(2000);


            // TC 1.5 - Search role
            CreateRolePageObj.SearchCreatedRole(ReadProps.readAttr("RoleName"));
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//SearchRole.jpg");
            Thread.sleep(3000);
            System.out.println("Role searched");

            //update Role with Valid Data
            CreateRolePageObj.ClickEditRole();
            Thread.sleep(5000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(4000);
            CreateRolePageObj.ClickProcessDocPermission();
            Thread.sleep(5000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(6000);
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//UpdateRole.jpg");
            Thread.sleep(3000);
            CreateRolePageObj.ClickUpdateRole();
            Thread.sleep(3000);
            CreateRolePageObj.UpdateTimeAssert();
            Thread.sleep(2000);

            //Update Role removing permission
            CreateRolePageObj.ClickEditRole();
            Thread.sleep(4000);
            CreateRolePageObj.RemoveProcessPermission();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//RemoveProcessDocpermission.jpg");
            Thread.sleep(3000);
            CreateRolePageObj.ClickUpdateRole();
            Thread.sleep(3000);

            //Remove all premission and disable active status
            CreateRolePageObj.ClickEditRole();
            Thread.sleep(5000);
            CreateRolePageObj.ClickRemovePermission();
            Thread.sleep(2000);
            CreateRolePageObj.ClickRemovePermission();
            Thread.sleep(2000);

            CreateRolePageObj.ClickUpdateRole();
            CreateRolePageObj.BlankPermission();
            System.out.println("Assert Verified Permissions cannot be blank");
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//BlankPermission.jpg");
            Thread.sleep(3000);
            CreateRolePageObj.ClickCancelButton();
            Thread.sleep(2000);


            //Disable the Status of role and update
            CreateRolePageObj.ClickEditRole();
            Thread.sleep(5000);
            CreateRolePageObj.ClickActiveRole();
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//ActiveRole.jpg");
            Thread.sleep(3000);
            CreateRolePageObj.ClickUpdateRole();
            Thread.sleep(4000);

            //Enable the Status of role and update
            CreateRolePageObj.ClickEditRole();
            Thread.sleep(5000);
            CreateRolePageObj.ClickActiveRole();
            TakesScreen.takeSnapShot(driver, "test-output//AdminRoles//InacvtiveRole.jpg");
            Thread.sleep(3000);
            CreateRolePageObj.ClickUpdateRole();
            Thread.sleep(3000);
            CreateRolePageObj.ClickLogout();
            Thread.sleep(2000);
            driver.close();
            CreateRolePageObj.AssertAll();


        } catch (Exception e) {
            test.log(status.FAIL, e);
        }
    }
}
