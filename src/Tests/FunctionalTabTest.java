package Tests;

import Base.BasePage;
import Pages.FunctionalTab;
import Utilities.TakesScreen;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class FunctionalTabTest extends BasePage {


    @Test
    public void FunctionalFlow() throws InterruptedException, IOException {
        try {
            BasePage.LoginTest();
            Thread.sleep(8000);
            FunctionalTab FunctionalTabObj = new FunctionalTab(driver);
            //  driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS); // pageload timeout
            // driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");


            //TC 3.1 Horizontal Tab
            FunctionalTabObj.ClickNicon();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalPanel.jpg");

            //TC 3.2 HorizontalUser and Navigate Back
            FunctionalTabObj.ClickHorizontalUser();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalUser.jpg");
            driver.navigate().back();
            Thread.sleep(6000);

            //TC 3.3 HorizontalRoles and Navigate Back
            FunctionalTabObj.ClickHorizontalRoles();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalRoles.jpg");
            driver.navigate().back();
            Thread.sleep(6000);

            //TC 3.4 HorzintalTemplates and Navigate Back
            FunctionalTabObj.ClickHorzintalTemplates();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalTemplates.jpg");
            driver.navigate().back();
            Thread.sleep(6000);

            //TC 3.5 Horizontal Dataset and Navigate Back
            FunctionalTabObj.ClickHorizontalDataset();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalDataset.jpg");
            driver.navigate().back();
            Thread.sleep(6000);

            //TC 3.6 Horizontal Projects and Navigate Back
            FunctionalTabObj.ClickHorizontalProjects();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalProjects.jpg");
            driver.navigate().back();
            Thread.sleep(6000);

            //TC 3.7 Horizontal Dcuments and Navigate Back
            FunctionalTabObj.ClickHorizontalDcuments();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalDocuments.jpg");
            driver.navigate().back();
           Thread.sleep(6000);

            //TC 3.8 Horizontal Analytics and Navigate Back
            FunctionalTabObj.ClickHorizontalAnalytics();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//HorizontalAnalytics.jpg");
            driver.navigate().back();
            Thread.sleep(6000);

            //TC 3.9 VerticalUser and Navigate Back
            FunctionalTabObj.ClickVerticalUser();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalUser.jpg");
            driver.navigate().back();
            Thread.sleep(8000);

            //TC 3.10 Vertical Roles and Navigate Back
            FunctionalTabObj.ClickVerticalRoles();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalRoles.jpg");
            driver.navigate().back();
            Thread.sleep(8000);

            //TC 3.11 Vertical Templates and Navigate Back
            FunctionalTabObj.ClickVerticalTemplates();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalTemplates.jpg");
            driver.navigate().back();
            Thread.sleep(6000);

            //TC 3.12 Vertical Dataset and Navigate Back
            FunctionalTabObj.ClickVerticalDataset();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalDataset.jpg");
            driver.navigate().back();
            Thread.sleep(6000);

            //TC 3.13 Vertical Projects and Navigate Back
            FunctionalTabObj.ClickVerticalProjects();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalProjects.jpg");
            driver.navigate().back();
            Thread.sleep(6000);
            //driver.navigate().forward();
            Thread.sleep(6000);

            //TC 3.14 Vertical Documents and Navigate Back
            FunctionalTabObj.ClickVerticalDocuments();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalDocuments.jpg");
         //   driver.navigate().back();
            Thread.sleep(6000);

            //TC 3.15 Vertical Analytics and Navigate Back
            FunctionalTabObj.ClickVerticalAnalytics();
            Thread.sleep(8000);
            TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//VerticalAnalytics.jpg");
            driver.navigate().back();
            Thread.sleep(6000);

            //TC 3.16 Arrow Right and Left (Verify the switching tabs functionality of the Platform Admin to click Expand Button and Release.)
            FunctionalTabObj.ClickArrowRight();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//ArrowRight.jpg");
            Thread.sleep(3000);
            FunctionalTabObj.ClickArrowLeft();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//FunctionalTab//LeftArrow.jpg");
            driver.close();

        } catch (Exception e) {
            test.log(status.FAIL, e);
        }
    }

}
