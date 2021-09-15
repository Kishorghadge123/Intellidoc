package Tests;

import Base.BasePage;
import Pages.AnalyticsPage;
//import Pages.PageDocument;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.io.IOException;

public class AnalyticsTest extends BasePage {

    @Test
    public void AnalyticsFlow() throws InterruptedException, IOException {
        try {
         BasePage.LoginTest();
            //Robot r = new Robot();
            Thread.sleep(4000);
            AnalyticsPage AnalyticsPageObj = new AnalyticsPage(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");

            AnalyticsPageObj.ClickAnalyticsBtn();
            Thread.sleep(3000);


            //Organization Statistics
          AnalyticsPageObj.ClickOrganizationArrow();
            Thread.sleep(2000);
            AnalyticsPageObj.ClickOrganizationArrow();
            Thread.sleep(2000);
            AnalyticsPageObj.HoverTotalUser();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver,"test-output//Analytics//HoverTotalUser.jpg");
            AnalyticsPageObj.HoverStructureProcess();
            Thread.sleep(2000);
            AnalyticsPageObj.HoverStructureReady();
            Thread.sleep(2000);
            AnalyticsPageObj.HoverStructureRejected();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//Analytics//HoverProgressbar.jpg");
            AnalyticsPageObj.ClickOrganizationArrow();
            Thread.sleep(2000);

            //Project Statistics
            AnalyticsPageObj.ClickSearchProject();
            Thread.sleep(2000);
            AnalyticsPageObj.ClickSelectProject();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver,"test-output//Analytics//ProjectSelect.jpg");
            AnalyticsPageObj.ClickSelectDropDown();
            Thread.sleep(2000);
            AnalyticsPageObj.ClickSelectOverall();
            Thread.sleep(2000);
            AnalyticsPageObj.ClickSelectDropDown();
            Thread.sleep(2000);
            AnalyticsPageObj.ClickSelectMonthly();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//Analytics//MonthlyStatus.jpg");
            AnalyticsPageObj.ClickSelectDropDown();
            Thread.sleep(2000);
            AnalyticsPageObj.ClickSelectWeekly();
            Thread.sleep(2000);
            AnalyticsPageObj.ClickSelectDropDown();
            Thread.sleep(2000);
            AnalyticsPageObj.ClickSelectDaily();
            Thread.sleep(2000);
            AnalyticsPageObj.HoverTotalDocument();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver,"test-output//Analytics//HoverTotalDocument.jpg");
            AnalyticsPageObj.ClickDocument();
            Thread.sleep(5000);
            AnalyticsPageObj.ClickReceived();
            Thread.sleep(5000);
            TakesScreen.takeSnapShot(driver,"test-output//Analytics//SortReceived.jpg");
            AnalyticsPageObj.ClickLastPage();
            Thread.sleep(2000);
            AnalyticsPageObj.ClickFirstPage();
            Thread.sleep(2000);
            AnalyticsPageObj.ClickNextPage();
            Thread.sleep(2000);
            AnalyticsPageObj.ClickPreviousPage();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver,"test-output//Analytics//PreviousPage.jpg");
            AnalyticsPageObj.ClickDocumentManual();
            Thread.sleep(3000);
            AnalyticsPageObj.ClickReceivedManual();
            Thread.sleep(3000);
            AnalyticsPageObj.ClickProjectArrow();
            Thread.sleep(3000);
            driver.close();

        } catch (Exception e) {
            test.log(status.FAIL, e);
        }
    }
}
