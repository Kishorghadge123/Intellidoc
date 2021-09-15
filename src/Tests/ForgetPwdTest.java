package Tests;


        import Base.BasePage;
        import Pages.ForgetPwdPage;
        import Pages.LoginPage;
        import Utilities.ReadProps;
        import Utilities.TakesScreen;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.testng.Assert;
        import org.testng.annotations.Test;

        import java.io.IOException;

public class ForgetPwdTest extends BasePage {

    @Test
    public void ForgotPwdFlow() throws InterruptedException, IOException {
        try {
            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectPath + ".\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            ForgetPwdPage FwdPwdObj = new ForgetPwdPage(driver);
            driver.get(ReadProps.readAttr("URL"));

            //Tc2.1 Click Cancel of ForgotPWD Directly
            Thread.sleep(6000);
            driver.manage().window().maximize();
            Thread.sleep(4000);
            FwdPwdObj.ClickForgetPwdBtn();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//ForgetPwdScreen.jpg");
            Thread.sleep(2000);
            FwdPwdObj.ClickCancelBtn();
            Thread.sleep(3000);


            //TC 2.2 First Login is not Done By the User
            FwdPwdObj.ClickForgetPwdBtn();
            Thread.sleep(4000);
            FwdPwdObj.ClickemailBtn(ReadProps.readAttr("Email"));
            Thread.sleep(4000);
            FwdPwdObj.ClickSubmitBtn();
            Thread.sleep(950);
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//FirstLoginNotDone!.jpg");
            Thread.sleep(3000);
            System.out.println("First login is not done the user id");

            //TC 2.3 Invalid EmailID

            FwdPwdObj.ClickForgetPwdBtn();
            Thread.sleep(4000);
            FwdPwdObj.ClickemailBtn(ReadProps.readAttr("Invalid1"));
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//InvalidEmailID.jpg");
            FwdPwdObj.VerifyAssertEmailID();
            FwdPwdObj.ClickCancelBtn();
            Thread.sleep(2000);
            System.out.println("*Please Check Email Id ");


            //2.4 User Does not Exist
            FwdPwdObj.ClickForgetPwdBtn();
            Thread.sleep(4000);
            FwdPwdObj.ClickemailBtn(ReadProps.readAttr("Invalid2"));
            Thread.sleep(3000);
            FwdPwdObj.ClickSubmitBtn();
            Thread.sleep(1000);
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//UserDoesn'tExist.jpg");
            FwdPwdObj.ClickCancelBtn();
            Thread.sleep(2000);
            System.out.println("User Does not Exist ");
            //TC 2.5 Something went wrong(The User without any Permission)

            //TC 2.6 Disable user
            FwdPwdObj.ClickForgetPwdBtn();
            Thread.sleep(4000);
            FwdPwdObj.ClickemailBtn(ReadProps.readAttr("DisabledUser"));
            Thread.sleep(2000);
            FwdPwdObj.ClickSubmitBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//ForgotPassword//DisableUser.jpg");
            Thread.sleep(2000);
            FwdPwdObj.ClickCancelBtn();
            Thread.sleep(2000);
            System.out.println("User is inactive. Please contact Administration");
            Thread.sleep(2000);
            driver.close();




        } catch (Exception e) {
        }

    }
}
