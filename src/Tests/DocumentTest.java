package Tests;

        import Base.BasePage;
        import Pages.DocumentPage;
        import Utilities.ReadProps;
        import Utilities.TakesScreen;
        import org.openqa.selenium.JavascriptExecutor;
        import org.testng.annotations.Test;

        import java.awt.*;
        import java.awt.event.KeyEvent;
        import java.io.IOException;

public class DocumentTest extends BasePage {

    @Test
    public void DocumentFlow() throws InterruptedException, IOException {
        try {
            BasePage.LoginTest();
            Thread.sleep(15000);
            Robot r = new Robot();
            DocumentPage DocPageObj = new DocumentPage(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");

            DocPageObj.ClickDocumentBtn();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//DocumentTab.jpg");
            Thread.sleep(3000);

            //Arrow Right and Left
            DocPageObj.ClickArrowRight();
            Thread.sleep(3000);
            DocPageObj.ClickArrowLeft();
            Thread.sleep(3000);


            //Search Project
            DocPageObj.ClickDropDownBtn();
            Thread.sleep(4000);
            DocPageObj.ClickSearchProject(ReadProps.readAttr("SearchProject"));
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//ProjectListDropDown.jpg");
            Thread.sleep(3000);
            DocPageObj.ClickFirstDocument();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//ProjectSelected.jpg");
            Thread.sleep(3000);

            //Searchbox Document
            DocPageObj.ClickSearchBox(ReadProps.readAttr("SearchDocument"));
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//DocumentSearched.jpg");
            Thread.sleep(3000);
            DocPageObj.ClickSearchDocument();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//OpenDocument.jpg");

            //Update document and cancel it
            DocPageObj.ClickViewDocIcon();
            Thread.sleep(4000);
            DocPageObj.ClickExpansionPanel();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//PanelExpanded.jpg");
            Thread.sleep(3000);
            DocPageObj.ClickClearEmail();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//EmailCleared.jpg");
            Thread.sleep(3000);
            DocPageObj.ChangeChangeEmail(ReadProps.readAttr("ChangeEmail"));
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//NewEmailEntered.jpg");
            Thread.sleep(3000);

            DocPageObj.ClickCancelDoc2();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//CancelUpdate.jpg");
            Thread.sleep(3000);
            DocPageObj.ClickDiscardUpdate();
            Thread.sleep(4000);
            DocPageObj.ClickClearSearch();
            Thread.sleep(4000);

            //Document refresh
            DocPageObj.ClickRefreshDocument();
            Thread.sleep(3000);

            //Hide Unhide Analytics
            DocPageObj.ClickHideAnalytics();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//HideAnalytics.jpg");
            Thread.sleep(4000);
            DocPageObj.ClickUnhideAnalytics();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//UnhideAnalytics.jpg");


            // TC - Documents - filter
            DocPageObj.ClickFilterDoc();
            Thread.sleep(3000);
            DocPageObj.ClickSearchFilterDoc(ReadProps.readAttr("SearchFilterDoc"));
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//FilterDocSearch.jpg");
            Thread.sleep(4000);
            DocPageObj.ClickFilterSearchIcon();
            Thread.sleep(3000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(3000);
            DocPageObj.ClickFilterDoc();
            Thread.sleep(3000);
            DocPageObj.ClickCancelFilterSearch();
            Thread.sleep(3000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(3000);

            //sorting
            DocPageObj.ClickDocSort();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//DocumentSort.jpg");
            Thread.sleep(4000);
            DocPageObj.ClickAssigneeSort();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//AssigneeSort.jpg");
            Thread.sleep(4000);
            DocPageObj.ClickStatusSort();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//StatusSort.jpg");
            Thread.sleep(4000);
            DocPageObj.ClickTypeSort();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//TypeSort.jpg");
            Thread.sleep(4000);
            DocPageObj.ClickScoreSort();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//ScoreSort.jpg");
            Thread.sleep(4000);
            DocPageObj.ClickSizeSort();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//SizeSort.jpg");
            Thread.sleep(4000);
            DocPageObj.ClickUpdateSort();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//UpdateSort.jpg");
            Thread.sleep(4000);
            DocPageObj.ClickReceivedSort();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//ReceivedSort.jpg");


            // TC - Status Filter
            DocPageObj.ClickStatusFilter();
            Thread.sleep(3000);
            DocPageObj.ClickCheckProcessed();
            Thread.sleep(3000);
            System.out.println("Status filter updated");
            TakesScreen.takeSnapShot(driver, "test-output//Document//StatusFilter.jpg");
            Thread.sleep(2000);
            r.keyPress(KeyEvent.VK_ESCAPE);
            Thread.sleep(3000);

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,10000)", "");
            Thread.sleep(3000);

            //Items Per Page
            DocPageObj.ClickItemsPerPage();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//ItemsPerPage.jpg");
            DocPageObj.SelectItemsPerPage();
            Thread.sleep(3000);

            //Next, Last, Previous and First Page


            DocPageObj.ClickNextPage();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//NextItemPerPage.jpg");
            Thread.sleep(4000);
            DocPageObj.ClickPreviousPage();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//PreviousItemPerPage.jpg");
            Thread.sleep(4000);
            DocPageObj.ClickLastPage();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//LastItemPerPage.jpg");
            Thread.sleep(4000);
            DocPageObj.ClickFirstPage();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//FirstItemPerPage.jpg");
            Thread.sleep(4000);



            // Anticlockwise , clockwise , Next Page , Previous Page
            DocPageObj.ClickSearchBox(ReadProps.readAttr("SearchDocumentForMorePages"));
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//DocumentMorePage.jpg");
            Thread.sleep(3000);
            DocPageObj.ClickSearchDocument();
            Thread.sleep(4000);
            DocPageObj.ClickViewDocIcon();
            Thread.sleep(60000);


            //WebElement element = driver.findElement(By.xpath("//*[@id='canvas']"));
          //  Actions act = new Actions(driver);
          //  act.moveToElement(element).perform();
          //  System.out.println("Mouse hover worked for document icon");

            //AntiClockwise
           // WebDriverWait wait = new WebDriverWait(driver,60);
          //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='rotate_left']/span[1]/i")));
            TakesScreen.takeSnapShot(driver, "test-output//Document//OpenDocument.jpg");
            DocPageObj.ClickAntiWiseIcon();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//AntiClockWiseIcon.jpg");


            //Clockwise
            DocPageObj.ClickClockWiseIcon();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//ClockWiseIcon.jpg");



            //Zoom In
            DocPageObj.ClickZoomIn();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//ZoomIn.jpg");

            //ZoomOut
            DocPageObj.ClickZoomOut();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//ZoomOut.jpg");


            //Navigate Right
            DocPageObj.ClickNvgtRt();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//NextPage.jpg");

            //Navigate Back
            DocPageObj.ClickNvgtLft();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Document//PreviousPage.jpg");

            driver.close();

        } catch (Exception e) {
            test.log(status.FAIL, e);
        }
    }
}

