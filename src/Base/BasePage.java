package Base;
import Pages.LoginPage;
import Utilities.ReadProps;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BasePage {



        public static WebDriver driver;
        public static LogStatus status;
        public static ExtentTest test;
        public static ExtentReports report;


        @BeforeClass
        public static void startTest()
        {
            report = new ExtentReports("ExtentReportResults.html");
            test = report.startTest("ExtentDemo");
        }

        public static void LoginTest() throws InterruptedException, IOException, Exception {
            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectPath + ".\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
            LoginPage loginPageObjects = new LoginPage(driver);
           // Thread.sleep(10000);
            driver.get(ReadProps.readAttr("URL"));
            driver.manage().window().maximize();
            //TC 1.1 method calling
            loginPageObjects.setUsername(ReadProps.readAttr("Username"));
            loginPageObjects.setPassword(ReadProps.readAttr("Password"));
            loginPageObjects.clickLoginButton();
           Thread.sleep(8000);

        }

        @AfterClass
        public static void endTest()
        {
            report.endTest(test);
            report.flush();
        }

    }


