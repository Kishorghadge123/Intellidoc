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

public class CreateRoleTest extends BasePage
{
    @Test
    public void Login() throws InterruptedException, IOException
    {
        try {
            BasePage.LoginTest();
            Robot r = new Robot();
            Thread.sleep(2000);
            CreateUserPage UserPageObj = new CreateUserPage(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");
            CreateRolePage createRolePageObj = new CreateRolePage(driver);

            //TC 6.1, 6.4 Method Calling Valid Data, Status Enable
            createRolePageObj.ClickRoleManagementBtn();
            Thread.sleep(4000);
            createRolePageObj.ClickCreateRollBtn();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver,"test-output//Roles//Role button clicked.jpg");
            Thread.sleep(3000);
            System.out.println("Role button clicked");

            // TC 1.1 - Blank RoleName and blank permission
            createRolePageObj.ClickCreateButton();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver,"test-output//Roles//BlankRoleNameCreated.jpg");
            Thread.sleep(3000);
            System.out.println("Role with blank name and blank permission");

            // TC 1.2 - Valid Rolename and blank permission
            createRolePageObj.EnterRollName(ReadProps.readAttr("RName"));
            Thread.sleep(4000);
            createRolePageObj.ClickCreateButton();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver,"test-output//Roles//ValidName_BLankPermissionRole.jpg");
            Thread.sleep(3000);
            System.out.println("Role created with valid name and blank permission");
            driver.navigate().refresh();
            Thread.sleep(4000);

            // TC 1.3 - Blank Rolename and Valid Permission
            createRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(4000);
            createRolePageObj.SelectPermission();
            Thread.sleep(4000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver,"test-output//Roles//BlankName_ValidPermission.jpg");
            Thread.sleep(3000);
            System.out.println("Role created with blank rolename and valid permission");

            // TC 1.4 - Valid Rolename and Valid Permission
            createRolePageObj.EnterRollName(ReadProps.readAttr("RName"));
            Thread.sleep(4000);
            createRolePageObj.ClickActiveRole();
            Thread.sleep(4000);
            createRolePageObj.AddPermissionPlusBtn();
            Thread.sleep(4000);
            createRolePageObj.SelectPermission();
            Thread.sleep(4000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver,"test-output//Roles//RoleDetails.jpg");
            Thread.sleep(3000);
            System.out.println("Role with valid rolename valid permission");
            createRolePageObj.ClickCancelButton();
            Thread.sleep(4000);

            // TC 1.5 - Search role
            createRolePageObj.SearchCreatedRole(ReadProps.readAttr("RName"));
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver,"test-output//Roles//SearchRole.jpg");
            Thread.sleep(3000);
            System.out.println("Role searched");

            // TC 1.6 - Edit Role and cancel it
            createRolePageObj.ClickEditRole();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver,"test-output//EditRole.jpg");
            Thread.sleep(4000);
            System.out.println("Click edit role and cancel it");
            createRolePageObj.ClickCancelButton();
            Thread.sleep(4000);

            // TC 1.7 - Update role with no changes
            createRolePageObj.ClickEditRole();
            Thread.sleep(4000);
            createRolePageObj.ClickUpdateRole();
            Thread.sleep(3000);
            System.out.println("Role with no updates");

            // TC 1.8 - Update role with blank permissions
            createRolePageObj.ClickEditRole();
            Thread.sleep(4000);
            createRolePageObj.CLickRemovePermission1();
            Thread.sleep(2000);
            createRolePageObj.ClickRemovePermission3();
            Thread.sleep(2000);
            createRolePageObj.ClickUpdateRole();
            Thread.sleep(3000);
            System.out.println("Update role with updated permission");

            // TC 1.9 - Update role with extra permissions (more than 2)
            createRolePageObj.ClickEditRole();
            Thread.sleep(4000);
            createRolePageObj.ClickEditAddPermission();
            Thread.sleep(4000);
            createRolePageObj.ClickPermission1();
            Thread.sleep(3000);
            createRolePageObj.ClickPermission2();
            Thread.sleep(3000);
            createRolePageObj.ClickPermission3();
            Thread.sleep(3000);
            createRolePageObj.ClickPermission4();
            Thread.sleep(3000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(4000);
            createRolePageObj.ClickUpdateRole();
            Thread.sleep(3000);
            System.out.println("Update role with extra permission");

            // TC 1.10 - Update role by disabling the "Active Role"
            createRolePageObj.ClickEditRole();
            Thread.sleep(4000);
            createRolePageObj.ClickDisableUser();
            Thread.sleep(3000);
            createRolePageObj.ClickUpdateRole();
            Thread.sleep(3000);
            System.out.println("Disable role");

            driver.close();

        }
        catch (Exception e)
        {
            test.log(status.FAIL, e);
        }
    }
}
