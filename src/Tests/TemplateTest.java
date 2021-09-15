package Tests;

import Base.BasePage;
import Pages.CreateUserPage;
import Pages.CreateRolePage;
import Pages.TemplatePage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import com.relevantcodes.extentreports.ExtentReports;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class TemplateTest extends BasePage {



    @Test
    public void TemplateFlow() throws InterruptedException, IOException {


        try {


            BasePage.LoginTest();
            Robot r = new Robot();
            Thread.sleep(8000);

            TemplatePage TemplatePageObj = new TemplatePage(driver);
            driver.manage().deleteAllCookies();


            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");
            System.out.println("Successfully logged in");
            Thread.sleep(8000);


            TemplatePageObj.ClickTemplateBtn();
            Thread.sleep(4000);
            System.out.println("Clicked template icon");
            Thread.sleep(4000);

            // TC 1.1 - Create template with invalid name
            TemplatePageObj.ClickOnUploadTemplateBtn();
            Thread.sleep(4000);
            TemplatePageObj.ClickOnTemplateName(ReadProps.readAttr("TInvalidName"));
            System.out.println("Template name entered");
            Thread.sleep(3000);
            WebElement upload_file = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-new-training[1]/div[3]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"));
            upload_file.sendKeys("C:\\Users\\juee.ningshetti\\OneDrive\\Desktop\\Template format\\Template1.jpg");
            System.out.println("File choosen");
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//InvalidName.jpg");
            TemplatePageObj.ClickCancelCreateTemplate();
            Thread.sleep(3000);


            // TC 1.2 - Create template with valid name and no choosen file
            TemplatePageObj.ClickOnUploadTemplateBtn();
            Thread.sleep(4000);
            TemplatePageObj.ClickOnTemplateName(ReadProps.readAttr("TNameUnique"));
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//NoFileChoose.jpg");
            System.out.println("Template with valid name and no choosen file");
            TemplatePageObj.ClickCancelCreateTemplate();
            Thread.sleep(3000);

            // TC 1.3 - Create template with Already exist name and choosen file
            TemplatePageObj.ClickOnUploadTemplateBtn();
            Thread.sleep(4000);
            TemplatePageObj.ClickOnTemplateName(ReadProps.readAttr("TExistName"));
            System.out.println("Template name entered");
            Thread.sleep(6000);
            upload_file.sendKeys("C:\\Users\\juee.ningshetti\\OneDrive\\Desktop\\Template format\\Template1.jpg");
            System.out.println("File choosen");
            Thread.sleep(3000);
            TemplatePageObj.ClickCreateTemplate();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//AlreadyExistFileName.jpg");
            TemplatePageObj.ClickCancelCreateTemplate();
            Thread.sleep(3000);



            // TC 1.4 - Create template with Unique name and choosen file
            TemplatePageObj.ClickOnUploadTemplateBtn();
            Thread.sleep(4000);
            TemplatePageObj.ClickOnTemplateName(ReadProps.readAttr("TNameUnique"));
            System.out.println("Template name entered");
            Thread.sleep(6000);
            upload_file.sendKeys("C:\\Users\\juee.ningshetti\\OneDrive\\Desktop\\Template format\\Template1.jpg");
            System.out.println("File choosen");
            Thread.sleep(3000);
            // TakesScreen.takeSnapShot(driver, "test-output//Templates//CreateTemplateDetails.jpg");
            TemplatePageObj.ClickCreateTemplate();
            Thread.sleep(6000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//TemplateCreated.jpg");
            System.out.println("Template created");
            TemplatePageObj.AssertCreatTemplate();
            Thread.sleep(4000);
            System.out.println("Template created successfully");
            TemplatePageObj.AssertTrainingStatus();
            Thread.sleep(4000);



            // // TC 1.5- Search template
            TemplatePageObj.ClickOnSearchTemplate(ReadProps.readAttr("TNameUnique"));
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//SearchTemplate.jpg");
            Thread.sleep(3000);
            System.out.println("Search template");
            TemplatePageObj.ClickOnExpandTemplate();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//ExpandTemplate.jpg");
            Thread.sleep(3000);
            System.out.println("Template expanded");
            TemplatePageObj.ClickOnTemplateDataInfo();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//OpenTemplateFile.jpg");
            Thread.sleep(3000);
            System.out.println("Template open");
            TemplatePageObj.ClickOnZoomIn();
            Thread.sleep(2000);
            TemplatePageObj.ClickOnZoomIn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates/ZoomIn.jpg");
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,10000)", "");
            Thread.sleep(3000);
            TemplatePageObj.ClickOnZoomOut();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates/ZoomOut.jpg");
            TemplatePageObj.ClickOnZoomOut();
            Thread.sleep(3000);
            js.executeScript("window.scrollBy(0,-10000)", "");


            TemplatePageObj.ClickClassificationBox();
            Thread.sleep(2000);
            TemplatePageObj.SelectClassification();
            Thread.sleep(2000);
            TemplatePageObj.EnterFieldName();
            Thread.sleep(2000);
            TemplatePageObj.ClickValidation();
            Thread.sleep(2000);
            TemplatePageObj.SelectValidation();
            Thread.sleep(2000);
            TemplatePageObj.ClickMap();
            Thread.sleep(2000);
            TemplatePageObj.AssertMap();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates/MapError.jpg");

            TemplatePageObj.ClickCancelTraining();
            Thread.sleep(3000);


            // TC 1.5- Delete created template

            TemplatePageObj.ClickOnExpandTemplate();
            Thread.sleep(4000);
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//DeleteTemplateWindw.jpg");
            TemplatePageObj.ConfirmDeleteTemplate();
            Thread.sleep(6000);

            //Create Template with more page
            driver.navigate().refresh();
            Thread.sleep(6000);
            TemplatePageObj.ClickTemplateBtn();
            Thread.sleep(5000);
            TemplatePageObj.ClickOnUploadTemplateBtn();
            Thread.sleep(4000);
            TemplatePageObj.ClickOnTemplateName(ReadProps.readAttr("TNameMorepages"));
            Thread.sleep(6000);
            System.out.println("Template name entered");
            WebElement upload_file1 = driver.findElement(By.xpath("//input[@class='ng-tns-c200-2']"));
            upload_file1.sendKeys("C:\\Users\\juee.ningshetti\\OneDrive\\Desktop\\Template format\\Sample.pdf");
            System.out.println("File choosen");
            Thread.sleep(6000);
            // TakesScreen.takeSnapShot(driver, "test-output//Templates//CreateTemplateDetails.jpg");
            TemplatePageObj.ClickCreateTemplate();
            Thread.sleep(10000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//TemplateCreated.jpg");
            System.out.println("Template created successfully");
            TemplatePageObj.ClickOnSearchTemplate(ReadProps.readAttr("TNameMorepages"));
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//SearchTemplate.jpg");
            Thread.sleep(3000);
            System.out.println("Search template");
            TemplatePageObj.ClickOnExpandTemplate();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//ExpandTemplate.jpg");
            System.out.println("Template expanded");
            TemplatePageObj.ClickOnTemplatemorepagesInfo();
            Thread.sleep(10000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//OpenTemplateFile.jpg");
            //Thread.sleep(3000);
            System.out.println("Template open");
            TemplatePageObj.ClickOnZoomIn();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates/ZoomInPages.jpg");
            TemplatePageObj.ClickOnZoomOut();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates/ZoomOutPages.jpg");

            TemplatePageObj.ClickNavigateNext();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates/NextPage.jpg");
            TemplatePageObj.ClickNavigateBack();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates/BackPage.jpg");
            TemplatePageObj.ClickCancelTraining();
            Thread.sleep(5000);
            TemplatePageObj.ClickOnExpandTemplate();
            Thread.sleep(4000);
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//DeleteTemplateWindw.jpg");
            TemplatePageObj.ConfirmDeleteTemplate();
            Thread.sleep(6000);
            TemplatePageObj.ClickOnExpandTemplate();
            Thread.sleep(4000);
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//DeleteTemplateWindw.jpg");
            TemplatePageObj.ConfirmDeleteTemplate();
            Thread.sleep(6000);
            TemplatePageObj.ClickOnExpandTemplate();
            Thread.sleep(4000);
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//DeleteTemplateWindw.jpg");
            TemplatePageObj.ConfirmDeleteTemplate();
            Thread.sleep(6000);
            TemplatePageObj.ClickOnExpandTemplate();
            Thread.sleep(4000);
            TemplatePageObj.DeleteTemplate();
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Templates//DeleteTemplateWindw.jpg");
            TemplatePageObj.ConfirmDeleteTemplate();
            Thread.sleep(6000);
            driver.close();

        } catch (Exception e) {
            //test.log(status.FAIL, e);
            test.log(status.FAIL, e);
        }

    }

    }

