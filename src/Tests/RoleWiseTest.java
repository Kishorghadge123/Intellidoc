package Tests;

import Base.BasePage;
import Pages.RoleWise;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.management.relation.Role;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RoleWiseTest extends BasePage {
    @Test
    public void RoleWiseFlow() throws InterruptedException, IOException {
        try {
            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectPath + ".\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            RoleWise RoleWiseObj = new RoleWise(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();


            //TC 11.1 Admin Role Login with valid user-id and valid password
            RoleWiseObj.setUsername(ReadProps.readAttr("AdminUser"));
            Thread.sleep(2000);
            RoleWiseObj.setPassword(ReadProps.readAttr("AdminPwd"));
            Thread.sleep(2000);
            RoleWiseObj.clickLoginButton();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//RoleWiseTest//AdminRoleAccess.jpg");
            Thread.sleep(2000);

            //TC 11.2 Admin Role Access User tab

            RoleWiseObj.clickAdminUser();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//RoleWiseTest//AdminRoleAccessUser.jpg");

            //TC 11.3 Admin Role Access Role tab

            RoleWiseObj.clickAdminRole();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//RoleWiseTest//AdminRoleAccessRoles.jpg");

            //TC 11.4 Admin Role Access Template tab

            RoleWiseObj.clickAdminTemplate();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//RoleWiseTest//AdminRoleAccessTemplate.jpg");

            //TC 11.5 Admin Role Access Project tab

            RoleWiseObj.clickAdminProject();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//RoleWiseTest//AdminRoleAccessProject.jpg");

            //TC 11.7 Admin Role Access Analytics tab

            RoleWiseObj.clickAdminAnalytic();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//RoleWiseTest//AdminRoleAccessAnalytics.jpg");
            RoleWiseObj.ClickLogout();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//RoleWiseTest//AdminRoleLogOut.jpg");

            driver.navigate().refresh();



            //TC 11.8 Supervisor ROle Valid User Valid PWD
            RoleWiseObj.setUsername(ReadProps.readAttr("SupervisorUser"));
            Thread.sleep(2000);
            RoleWiseObj.setPassword(ReadProps.readAttr("SupervisorPwd"));
            Thread.sleep(2000);
            RoleWiseObj.clickLoginButton();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//RoleWiseTest//SupervisorRoleAccess.jpg");
            Thread.sleep(2000);

            //TC 11.9 Supervisor ROle Access Template

            RoleWiseObj.clickSupervisorTemplate();
            Thread.sleep(7000);
            TakesScreen.takeSnapShot(driver, "test-output//RoleWiseTest//SupervisorRoleAccessTemplate.jpg");


            //TC 11.11 Supervisor ROle Access Document

            RoleWiseObj.clickSupervisorDocument();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//RoleWiseTest//SupervisorRoleAccessDocument.jpg");

            //TC 11.12 Supervisor ROle Access Analytics

            RoleWiseObj.ClickLogout();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//RoleWiseTest//SupervisorRolelogout.jpg");
            Thread.sleep(5000);
            driver.navigate().refresh();



            //TC 11.13 Operator ROle Login with Valid ID and PWD

            RoleWiseObj.setUsername(ReadProps.readAttr("Operatoruser"));
            Thread.sleep(2000);
            RoleWiseObj.setPassword(ReadProps.readAttr("OperatorPwd"));
            Thread.sleep(2000);
            RoleWiseObj.clickLoginButton();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//RoleWiseTest//OperatorRole.jpg");
            Thread.sleep(2000);

            //TC 11.15 Operator ROle Access Document

            RoleWiseObj.clickOperatorDocument();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//RoleWiseTest//OperatorRoleDocument.jpg");

            //TC 11.16 Operator ROle Access Analytics
            RoleWiseObj.ClickLogout();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//RoleWiseTest//OperatorRolelogout.jpg");

            driver.close();


        } catch (Exception e) {
            test.log(status.FAIL, e);
        }

    }
}

