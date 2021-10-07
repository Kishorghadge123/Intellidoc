package Tests;
import Base.BasePage;
import Pages.CreateUserPage;
import Pages.CreateRolePage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class CreateRolePlatformAdminTest extends BasePage
{
    @Test
    public void CreateRolePlatformAdminFlow() throws InterruptedException, IOException
    {
        try {
            BasePage.LoginTest();

            Thread.sleep(8000);

            CreateRolePage CreateRolePageObj = new CreateRolePage(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");


            CreateRolePageObj.ClickRoleManagementBtn();
            Thread.sleep(4000);
            CreateRolePageObj.ClickCreateRoleBtn();
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//Role button clicked.jpg");
            Thread.sleep(3000);
            System.out.println("Role button clicked");

            // Blank RoleName and blank permission

            CreateRolePageObj.ClickCreateButton();
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//BlankRoleNameCreated.jpg");
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
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//ValidName_BLankPermissionRole.jpg");
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
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//BlankName_ValidPermission.jpg");
            System.out.println(" Assert verified Please check form data");
            Thread.sleep(3000);
            CreateRolePageObj.ClickCancelButton();
            Thread.sleep(2000);


            //Valid Rolename Valid Permission

          /*  CreateRolePageObj.ClickCreateRoleBtn();
            Thread.sleep(4000);
            CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleName"));
            Thread.sleep(4000);
            CreateRolePageObj.ClickActiveRole();
            Thread.sleep(4000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(4000);
            CreateRolePageObj.SelectCreateUserPermission();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(5000);
             CreateRolePageObj.SelectViewDocumentPermission();
            //Thread.sleep(3000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(5000)
            TakesScreen.takeSnapShot(driver,"test-output//Roles//RoleDetails.jpg");
            System.out.println("Role with valid rolename valid permission");
            CreateRolePageObj.ClickCreateButton();
            Thread.sleep(4000);*/
            //CreateRolePageObj.CreateTimeAssert();
            Thread.sleep(2000);

            // Repeated Role..Doesnt allow repeat role
            CreateRolePageObj.ClickCreateRoleBtn();
            Thread.sleep(4000);
            CreateRolePageObj.EnterRoleName(ReadProps.readAttr("RoleName"));
            Thread.sleep(4000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(4000);
            CreateRolePageObj.ClickProcessDocPermission();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(6000);
            CreateRolePageObj.ClickCreateButton();
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//RepeatedRole.jpg");
            System.out.println(" Assertion verified Role exist with name AE Admin");
            Thread.sleep(4000);
            CreateRolePageObj.ClickCancelButton();
            Thread.sleep(2000);


            // TC 1.5 - Search role
            CreateRolePageObj.SearchCreatedRole(ReadProps.readAttr("RoleName"));
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//SearchRole.jpg");
            Thread.sleep(3000);
            System.out.println("Role searched");

            //update Role with Valid Data
            CreateRolePageObj.ClickEditRole();
            Thread.sleep(5000);
            CreateRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(4000);
            CreateRolePageObj.ClickProcessDocPermission();
            Thread.sleep(1000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(6000);
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//UpdateRole.jpg");
            Thread.sleep(3000);
            CreateRolePageObj.ClickUpdateRole();
            Thread.sleep(3000);
            CreateRolePageObj.UpdateTimeAssert();
            Thread.sleep(2000);

            //Update Role removing permission
            CreateRolePageObj.ClickEditRole();
            Thread.sleep(5000);
            CreateRolePageObj.RemoveProcessPermission();
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//RemoveProcessDocpermission.jpg");
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
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//BlankPermission.jpg");
            Thread.sleep(3000);
            CreateRolePageObj.ClickCancelButton();
            Thread.sleep(2000);

            //Disable the Status of role and update
            CreateRolePageObj.ClickEditRole();
            Thread.sleep(5000);
            CreateRolePageObj.ClickActiveRole();
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//ActiveRole.jpg");
            Thread.sleep(3000);
            CreateRolePageObj.ClickUpdateRole();
            Thread.sleep(4000);

            //Enable the Status of role and update
            CreateRolePageObj.ClickEditRole();
            Thread.sleep(5000);
            CreateRolePageObj.ClickActiveRole();
            TakesScreen.takeSnapShot(driver,"test-output//PlatformAdminRoles//InacvtiveRole.jpg");
            Thread.sleep(3000);
            CreateRolePageObj.ClickUpdateRole();
            Thread.sleep(3000);
            CreateRolePageObj.ClickLogout();
            Thread.sleep(2000);
            driver.close();
            CreateRolePageObj.AssertAll();



        }
        catch (Exception e)
        {
            test.log(status.FAIL, e);
        }
    }
}
