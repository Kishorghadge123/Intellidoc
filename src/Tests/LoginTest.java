package Tests;

import Base.BasePage;
import Pages.LoginPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BasePage {
    WebDriver driver ;
    @Test
    public static void LoginTestFlow() throws Exception {
        try {

            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");
            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectPath + ".\\Drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            LoginPage loginPageObjects = new LoginPage(driver);
            driver.get(ReadProps.readAttr("URL"));
            String actualTitle = driver.getTitle();
            String expectedTitle = "IntelliDoc";
            assertEquals(expectedTitle, actualTitle);
            System.out.println("Title Match");
            driver.manage().window().maximize();
            Thread.sleep(2000);


            // Identify logo
            WebElement i = driver.findElement(By.xpath("//img[contains(@class,'img-fluid login-logo')]"));
            Boolean p = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);

            //verify if status is true
            if (p) {
                System.out.println("Logo validation completed successfully");
            } else {
                System.out.println("Logo validation failed");
            }

            Thread.sleep(2000);
            driver.manage().deleteAllCookies();


            //TC 1.1 - Login with blank user id and blank password
            loginPageObjects.clickLoginButton();
            loginPageObjects.VerifyAssertError();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//BlankUserNamePWD.jpg");
            System.out.println("Please Enter Valid Data !");
            Thread.sleep(2000);


            //TC 1.2 - Login with invalid user-id and blank password
            loginPageObjects.setUsername(ReadProps.readAttr("Username2"));
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//InvalidIDBlankPWD.jpg");
            System.out.println("Login failed - Invalid UserID and Blank PWD !");
            Thread.sleep(2000);

            //TC 1.3 - Login with blank user-id and valid password
            loginPageObjects.ClearUserID();
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("Password"));
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//BlankIDValidPWD.jpg");
            System.out.println("Login failed - Blank UserID and Valid PWD !");
            Thread.sleep(2000);

            //TC 1.4 - Login with blank user-id and invalid password
            loginPageObjects.ClearPWD();
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("Password1"));
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//BlankIDInvalidPWD.jpg");
            System.out.println("Login failed - Blank UserID and invalid PWD !");
            Thread.sleep(2000);


            //TC 1.5 - Login with valid user-id and blank password
            loginPageObjects.setUsername(ReadProps.readAttr("Username"));
            Thread.sleep(2000);
            loginPageObjects.ClearPWD();
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//ValidIDBlankPWD.jpg");
            System.out.println("Login failed - Valid UserID and Blank PWD");
            Thread.sleep(2000);
            driver.navigate().refresh();
            Thread.sleep(3000);

            //TC 1.6 - Login with invalid userID and invalid password
            loginPageObjects.setUsername(ReadProps.readAttr("Username2"));
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("Password1"));
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//InvalidIDInvalidPWD.jpg");
            Thread.sleep(2000);
            System.out.println("Login failed - Invalid UserID and Invalid PWD");

            //TC 1.7 - Login with invalid user-id and valid password
            loginPageObjects.ClearPWD();
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("Password"));
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//InvalidIDValidPWD.jpg");
            Thread.sleep(2000);
            System.out.println("Login failed - Invalid UserID and Valid PWD");

            //TC 1.8 - Login with valid user-id and invalid password
            loginPageObjects.ClearUserID();
            Thread.sleep(2000);
            loginPageObjects.setUsername(ReadProps.readAttr("Username"));
            Thread.sleep(2000);
            loginPageObjects.ClearPWD();
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("Password1"));
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//ValidIDInvalidPWD.jpg");
            Thread.sleep(2000);
            System.out.println("Login failed - Valid UserID and invalid PWD");
            driver.navigate().refresh();
            Thread.sleep(3000);
            System.out.println("Page refreshed successfully");
            Thread.sleep(2000);

            //TC 1.9 Login with valid userID and valid PWD
            loginPageObjects.setUsername(ReadProps.readAttr("Username"));
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("Password"));
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(10000);
            loginPageObjects.VerifyHomePage();
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//LoginSuccessful.jpg");
            System.out.println("Login Successfully - Valid UserID and Valid PWD");
            Thread.sleep(2000);


            //TC 1.10 - Navigate to backward and forward
            driver.navigate().back();
            // Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//NavigateBackward.jpg");
            Thread.sleep(4000);
            System.out.println("Navigated to backward successfully");
            driver.navigate().forward();
            Thread.sleep(6000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//NavigateForward.jpg");
            System.out.println("Navigated to forward successfully");


            //TC 1.11 - Logout
            loginPageObjects.ClickLogoutBtn();
            Thread.sleep(6000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//Logout.jpg");
            System.out.println("Logging out successfully");
            Thread.sleep(2000);

            //TC 1 - Admin Login with invalid userID and invalid password
            loginPageObjects.setUsername(ReadProps.readAttr("AdminInvalidUser"));
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("AdminInvalidPwd"));
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            TakesScreen.takeSnapShot(driver,"test-output//LoginPage//AdminInvalidIDInvalidPWD.jpg");
            Thread.sleep(2000);
            loginPageObjects.ClearUserID();
            Thread.sleep(2000);
            loginPageObjects.ClearPWD();
            Thread.sleep(2000);
            System.out.println("Login failed - Invalid UserID and Invalid PWD");

            //TC 1.2 - Admin Login with invalid user-id and valid password
            loginPageObjects.setUsername(ReadProps.readAttr("AdminInvalidUser"));
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("AdminPwd"));
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//LoginPage//AdminInvalidIDValidPWD.jpg");
            Thread.sleep(2000);
            loginPageObjects.ClearUserID();
            Thread.sleep(2000);
            loginPageObjects.ClearPWD();
            Thread.sleep(2000);
            System.out.println("Login failed - Invalid UserID and Valid PWD");

            //TC 1.3 - Admin Login with valid user-id and invalid password
            loginPageObjects.setUsername(ReadProps.readAttr("AdminUser"));
            Thread.sleep(2000);
            loginPageObjects.ClearPWD();
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("AdminInvalidPwd"));
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//LoginPage//AdminValidIDInvalidPWD.jpg");
            Thread.sleep(2000);
            System.out.println("Login failed - Valid UserID and invalid PWD");
            driver.navigate().refresh();
            Thread.sleep(3000);



            //TC 11.1 Admin Role Login with valid user-id and valid password
            loginPageObjects.setUsername(ReadProps.readAttr("AdminUser"));
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("AdminPwd"));
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//AdminValid.jpg");
            Thread.sleep(2000);
            loginPageObjects.ClickLogoutBtn();
            Thread.sleep(4000);

            //TC 11.1 Supervisor Role Login with In valid user-id and In valid password

            loginPageObjects.setUsername(ReadProps.readAttr("SupervisorInvalidUser"));
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("SupervisorInvalidPwd"));
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            TakesScreen.takeSnapShot(driver,"test-output//LoginPage//SupervisorInvalidIDInvalidPWD.jpg");
            Thread.sleep(2000);
            loginPageObjects.ClearUserID();
            Thread.sleep(2000);
            loginPageObjects.ClearPWD();
            Thread.sleep(2000);
            System.out.println("Login failed - Invalid UserID and Invalid PWD");

            //TC 1.7 - Supervisor ROle  Login with invalid user-id and valid password
            loginPageObjects.setUsername(ReadProps.readAttr("SupervisorInvalidUser"));
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("SupervisorPwd"));
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//LoginPage//SupervisorInvalidIDValidPWD.jpg");
            Thread.sleep(2000);
            loginPageObjects.ClearUserID();
            Thread.sleep(2000);
            loginPageObjects.ClearPWD();
            Thread.sleep(2000);
            System.out.println("Login failed - Invalid UserID and Valid PWD");

            //TC 1.8 - Supervisor ROle  Login with valid user-id and invalid password
            loginPageObjects.setUsername(ReadProps.readAttr("SupervisorUser"));
            Thread.sleep(2000);
            loginPageObjects.ClearPWD();
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("SupervisorInvalidPwd"));
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//LoginPage//SupervisorValidIDInvalidPWD.jpg");
            Thread.sleep(2000);
            System.out.println("Login failed - Valid UserID and invalid PWD");
            driver.navigate().refresh();
            Thread.sleep(3000);

            //TC 11.8 Supervisor ROle Valid User Valid PWD
            loginPageObjects.setUsername(ReadProps.readAttr("SupervisorUser"));
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("SupervisorPwd"));
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//SupervisorValid.jpg");
            loginPageObjects.ClickLogoutBtn();
            Thread.sleep(4000);


            //TC 1 - Operator ROle  Login with invalid userID and invalid password
            loginPageObjects.setUsername(ReadProps.readAttr("OperatorInvaliduser"));
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("OperatorInvalidPwd"));
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            TakesScreen.takeSnapShot(driver,"test-output//LoginPage//OperatorInvalidIDInvalidPWD.jpg");
            Thread.sleep(2000);
            loginPageObjects.ClearUserID();
            Thread.sleep(2000);
            loginPageObjects.ClearPWD();
            Thread.sleep(2000);
            System.out.println("Login failed - Invalid UserID and Invalid PWD");

            //TC 1.7 - Operator ROle  Login with invalid user-id and valid password
            loginPageObjects.setUsername(ReadProps.readAttr("OperatorInvaliduser"));
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("OperatorPwd"));
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//LoginPage//OperatorInvalidIDValidPWD.jpg");
            Thread.sleep(2000);
            loginPageObjects.ClearUserID();
            Thread.sleep(2000);
            loginPageObjects.ClearPWD();
            Thread.sleep(2000);
            System.out.println("Login failed - Invalid UserID and Valid PWD");

            //TC 1.8 - Operator ROle  Login with valid user-id and invalid password
            loginPageObjects.setUsername(ReadProps.readAttr("Operatoruser"));
            Thread.sleep(2000);
            loginPageObjects.ClearPWD();
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("OperatorInvalidPwd"));
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//LoginPage//OperatorValidIDInvalidPWD.jpg");
            Thread.sleep(2000);
            System.out.println("Login failed - Valid UserID and invalid PWD");
            driver.navigate().refresh();
            Thread.sleep(3000);



            //TC 11.13 Operator ROle Login with Valid ID and PWD

            loginPageObjects.setUsername(ReadProps.readAttr("Operatoruser"));
            Thread.sleep(2000);
            loginPageObjects.setPassword(ReadProps.readAttr("OperatorPwd"));
            Thread.sleep(2000);
            loginPageObjects.clickLoginButton();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//LoginPage//OperatorValid.jpg");
            loginPageObjects.ClickLogoutBtn();
            Thread.sleep(4000);

            driver.close();




        }
        catch (Exception e)
        {
            test.log(status.FAIL, e);
        }
    }
}