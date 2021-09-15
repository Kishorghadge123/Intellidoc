package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class AnalyticsPage {


    WebDriver driver = null;

    By AnalyticsBtn = By.xpath("//i[@class='mat-tooltip-trigger fa fa-cubes m-0 side-icon ng-star-inserted']");
    By OrganizationDownarrow =By.xpath("//span[@class='mat-expansion-indicator ng-tns-c157-6 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']");
    By TotalUser = By.xpath("//div[@class='white_bg rounded_5px px-3 py-2 h-100']");
    By Structure_Process = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-analytics[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]");
    By Structure_Ready=By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-analytics[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[2]");
    By Structure_Rejected=By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-analytics[1]/div[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[3]");
    By ProjectDownarrow=By.xpath("//span[@class='mat-expansion-indicator ng-tns-c157-8 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']");
    By SearchProject=By.xpath("//input[@placeholder='Search By Project']");
    By SelectProject=By.xpath("//span[contains(text(),'aws s-3')]");
    By SelectDropDown= By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-analytics[1]/div[2]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]");
    By SelectMonthly = By.xpath("//span[contains(text(),'Monthly')]");
    By SelectWeekly = By.xpath("//span[contains(text(),'Weekly')]");
    By SelectDaily = By.xpath("//span[contains(text(),'Daily')]");
    By SelectOverall = By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/mat-option[4]/span[1]");
    By TotalDocument = By.xpath("//div[@class='white_bg rounded_5px box_shadow px-2 py-2 h-100']");
    By Document = By.xpath("//div[@class='mat-sort-header-content ng-tns-c166-13']");
    By Received = By.xpath("//div[@class='mat-sort-header-content ng-tns-c166-14']");
    By LastPage = By.xpath("//button[@class='mat-focus-indicator mat-tooltip-trigger mat-paginator-navigation-last mat-icon-button mat-button-base ng-star-inserted']");
    By FirstPage = By.xpath("//button[@class='mat-focus-indicator mat-tooltip-trigger mat-paginator-navigation-first mat-icon-button mat-button-base ng-star-inserted']");
    By PreviousPage = By.xpath("//button[@class='mat-focus-indicator mat-tooltip-trigger mat-paginator-navigation-previous mat-icon-button mat-button-base']");
    By NextPage = By.xpath("//button[@class='mat-focus-indicator mat-tooltip-trigger mat-paginator-navigation-next mat-icon-button mat-button-base']");
    By Document_Manual = By.xpath("//div[@class='mat-sort-header-content ng-tns-c166-14']");
    By Received_Manual = By.xpath("//div[@class='mat-sort-header-content ng-tns-c166-15']");
    By ProjectStatisticArrow = By.xpath("//span[@class='mat-expansion-indicator ng-tns-c157-8 ng-trigger ng-trigger-indicatorRotate ng-star-inserted']");


    public AnalyticsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickAnalyticsBtn() {
        driver.findElement(AnalyticsBtn).click();
    }
    //Organization Statistic
   public  void ClickOrganizationArrow(){
        driver.findElement(OrganizationDownarrow).click();
    }

    public  void HoverTotalUser(){
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(TotalUser);
        action.moveToElement(element).build().perform();
        System.out.println("Mouse hover");
    }
    public void HoverStructureProcess(){
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(Structure_Process);
        action.moveToElement(element).build().perform();
        System.out.println("Mouse hover");

    }
    public void HoverStructureReady(){
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(Structure_Ready);
        action.moveToElement(element).build().perform();
        System.out.println("Mouse hover");

    }
    public void HoverStructureRejected(){
        Actions action = new Actions(driver);
        WebElement element= driver.findElement(Structure_Rejected);
        action.moveToElement(element).build().perform();
        System.out.println("Mouse hover");

    }
    //Project Statistics
    public  void ClickProjectArrow(){
        driver.findElement(ProjectDownarrow).click();
    }
    public void ClickSearchProject(){driver.findElement(SearchProject).click();}
    public void ClickSelectProject(){driver.findElement(SelectProject).click();}
    public void ClickSelectDropDown(){driver.findElement(SelectDropDown).click();}
    public void ClickSelectMonthly(){driver.findElement(SelectMonthly).click();}
    public void ClickSelectWeekly(){driver.findElement(SelectWeekly).click();}
    public void ClickSelectDaily(){driver.findElement(SelectDaily).click();}
    public void ClickSelectOverall(){driver.findElement(SelectOverall).click();}
    public  void HoverTotalDocument(){driver.findElement(TotalDocument).click();}
    public void ClickDocument(){driver.findElement(Document).click();}
    public void ClickReceived(){driver.findElement(Received).click();}
    public void ClickLastPage(){driver.findElement(LastPage).click();}
    public void ClickFirstPage(){driver.findElement(FirstPage).click();}
    public void ClickPreviousPage(){driver.findElement(PreviousPage).click();}
    public  void ClickNextPage(){driver.findElement(NextPage).click();}
    public void ClickDocumentManual(){driver.findElement(Document_Manual).click();}
    public  void ClickReceivedManual(){driver.findElement(Received_Manual).click();}
    public  void ClickProjectStatisticArrow(){driver.findElement(ProjectStatisticArrow).click();}

}



