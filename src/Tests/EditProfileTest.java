package Tests;

        import Base.BasePage;
        import Pages.EditProfilePage;
        import Pages.LoginPage;
        import Utilities.ReadProps;
        import Utilities.TakesScreen;
        import com.relevantcodes.extentreports.ExtentReports;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.testng.annotations.AfterClass;
        import org.testng.annotations.BeforeClass;
        import org.testng.annotations.Test;

        import java.io.IOException;
        import java.util.concurrent.TimeUnit;



public class EditProfileTest extends BasePage{


    @Test
    public void EditProfileFlow() throws InterruptedException, IOException {
        try {

            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectPath + ".\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            EditProfilePage EditProfileObj =new EditProfilePage(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");

            LoginPage loginPageObjects = new LoginPage(driver);
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            Thread.sleep(2000);

            //TC 12.1 Login
            loginPageObjects.setUsername(ReadProps.readAttr("Username"));
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("Password"));
            Thread.sleep(2000);

            //TC 12.2 Visible PWD On

            EditProfileObj.clickVisible();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//EditProfileTest//VisiblePWD.jpg");
            Thread.sleep(3000);

            //TC 12.3 Visible PWD Off

            EditProfileObj.clickVisible();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver,"test-output//EditProfileTest//InVisiblePWD.jpg");
            loginPageObjects.clickLoginButton();
            Thread.sleep(8000);

            //TC 12.4 Profiel Icon

            EditProfileObj.ProfileButton();
            Thread.sleep(3000);

            //TC 12.5 Night Mode , Day Mode

            EditProfileObj.NightModeButton();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//EditProfileTest//NightMode.jpg");
            Thread.sleep(2000);
            EditProfileObj.DayModeButton();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//EditProfileTest//DayMode.jpg");

            //TC 12.6 Edit Profile

            EditProfileObj.EditProfileButton();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//EditProfileTest//EditProfileButton.jpg");
            Thread.sleep(2000);
            EditProfileObj.CancelButton();
            Thread.sleep(4000);


            driver.close();


        } catch (Exception e) {
            test.log(status.FAIL, e);

        }


    }

}

