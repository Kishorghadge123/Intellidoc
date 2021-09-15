package Tests;

import Base.BasePage;
import Pages.DatasetPage;
import Utilities.ReadProps;
import Utilities.TakesScreen;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import java.io.IOException;

public class DatasetTest extends BasePage {

    @Test
    public void DataSetFlow() throws InterruptedException, IOException {

        try {
            BasePage.LoginTest();
            Thread.sleep(4000);
            DatasetPage DatasetPageObj = new DatasetPage(driver);
            test.log(status.INFO, "TestInformation");
            test.log(status.PASS, "TestPassed");

            DatasetPageObj.ClickDatasetBtn();
            Thread.sleep(4000);

            // TC 1.1 - Create category with blank name
            DatasetPageObj.ClickAddCategoryBtn();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Datasets//Category-BlankName.jpg");
            Thread.sleep(2000);

            // TC 1.2 - Create category with invalid name
            DatasetPageObj.ClickCategoryName(ReadProps.readAttr("Invalid_Name"));
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Datasets//Category-InvalidName.jpg");
            Thread.sleep(2000);
            DatasetPageObj.ClickCategoryCancelBtn();
            Thread.sleep(3000);

            // TC 1.3 - Create category with valid name
            DatasetPageObj.ClickAddCategoryBtn();
            Thread.sleep(2000);
            DatasetPageObj.ClickCategoryName(ReadProps.readAttr("DName"));
            Thread.sleep(2000);
            DatasetPageObj.ClickCreateCategory();
            Thread.sleep(2000);
            TakesScreen.takeSnapShot(driver, "test-output//Datasets//CategoryCreated.jpg");
            Thread.sleep(3000);

            // TC 1.4 - Perform action to add dataset with blank name and no choosen file
            DatasetPageObj.ClickActionBtn();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Datasets//Action-NoInput.jpg");
            Thread.sleep(4000);
            DatasetPageObj.ClickAddDatasetCancelBtn();
            Thread.sleep(4000);

            // TC 1.5 - Perform action to add dataset with name and no choosen file
            DatasetPageObj.ClickActionBtn();
            Thread.sleep(3000);
            DatasetPageObj.ClickDatasetName(ReadProps.readAttr("DName2"));
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Datasets//Action-Name+NoFile.jpg");
            Thread.sleep(3000);
            DatasetPageObj.ClickAddDatasetCancelBtn();
            Thread.sleep(4000);

            // TC 1.6 - Perform action to add dataset with name, choosen file (.csv) but no validation type
            DatasetPageObj.ClickActionBtn();
            Thread.sleep(3000);
            DatasetPageObj.ClickDatasetName(ReadProps.readAttr("DName2"));
            Thread.sleep(3000);
            WebElement upload_file = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-dataset-editor[1]/div[4]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]"));
            upload_file.sendKeys("C:\\Users\\juee.ningshetti\\Documents\\sampledata.csv");
            Thread.sleep(4000);
            TakesScreen.takeSnapShot(driver, "test-output//Datasets//Action-Name+File_NoValidation.jpg");
            Thread.sleep(4000);
            DatasetPageObj.ClickAddDatasetCancelBtn();
            Thread.sleep(4000);


            // TC 1.7 - Perform action to add dataset file in the created category with name, choosen file and validation type
            DatasetPageObj.ClickActionBtn();
            Thread.sleep(3000);
            DatasetPageObj.ClickDatasetName(ReadProps.readAttr("DName2"));
            Thread.sleep(4000);
            WebElement upload_file1 = driver.findElement(By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-dataset-editor[1]/div[4]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[1]/input[1]"));
            upload_file1.sendKeys("C:\\Users\\juee.ningshetti\\Documents\\sampledata.csv");
            Thread.sleep(4000);

            //validation type as "name" for dataset to create a new dataset
            DatasetPageObj.ClickValidationDropDown();
            Thread.sleep(3000);
            DatasetPageObj.ClickValidationName();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Datasets//DatasetDetails.jpg");
            Thread.sleep(4000);

            //validation type as "phone" for roles to create a new dataset
            DatasetPageObj.ClickValidationDropDown2();
            Thread.sleep(3000);
            DatasetPageObj.ClickValidationRoles();
            Thread.sleep(3000);
            TakesScreen.takeSnapShot(driver, "test-output//Datasets//DatasetDetails.jpg");
            Thread.sleep(4000);

//            DatasetPageObj.ClickCreateDataset();
//            Thread.sleep(4000);
//            DatasetPageObj.ClickExpand1();
//            Thread.sleep(4000);
//            TakesScreen.takeSnapShot(driver, "test-output//Datasets//DatasetAdded.jpg");
//            Thread.sleep(4000);
//
//            // TC 1.8 - Search created category and click to expand it
//            DatasetPageObj.ClickSearchBox(ReadProps.readAttr("DName"));
//            Thread.sleep(4000);
//
//            // TC 1.9 - Select file to open it and cancel
//            DatasetPageObj.ClickDatasetFileName();
//            Thread.sleep(4000);
//            TakesScreen.takeSnapShot(driver, "test-output//Datasets//OpenDatasetjpg");
//            Thread.sleep(4000);
//            DatasetPageObj.ClickCancelDatasetFileName();
//            Thread.sleep(4000);
//
//            // TC 1.10 - Disable Dataset
//            DatasetPageObj.ClickExpandDataset();
//            Thread.sleep(3000);
//            DatasetPageObj.ClickDisableUser();
//            Thread.sleep(3000);
//            TakesScreen.takeSnapShot(driver, "test-output//Datasets//DatasetDisabled.jpg");
//            Thread.sleep(4000);

            driver.quit();

        } catch (Exception e) {
            test.log(status.FAIL, e);
        }
    }

}

