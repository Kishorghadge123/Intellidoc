package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FunctionalTab {




        WebDriver driver = null;

        By Nicon = By.xpath("//*[@id='sidenav']/div/ul/li/img");
        By HorizontalUser = By.xpath("//span[contains(text(),'Users')]");
        By HorizontalRoles = By.xpath("//span[contains(text(),'Roles')]");
        By HorzintalTemplates = By.xpath("//span[contains(text(),'Templates')]");
        By HorizontalDataset = By.xpath("//span[contains(text(),'Data Sets')]");
        By HorizontalProjects = By.xpath("//span[contains(text(),'Projects')]");
        By HorizontalDcuments = By.xpath("//span[contains(text(),'Documents')]");
        By HorizontalAnalytics = By.xpath("//span[contains(text(),'Analytics')]");

        By VerticalUser = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[1]/div/i");
        By VerticalRoles = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[2]/div/i");
        By VerticalTemplates = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[3]/div/i");
        By VerticalDataset = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[4]/div/i");
        By VerticalProjects = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[5]/div/i");
        By VerticalDocuments = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[6]/div/i");
        By VerticalAnalytics = By.xpath("//*[@id='sidenav']/div/mat-nav-list/mat-list-item[7]/div/i");
        By ArrowRight = By.xpath("//mat-icon[contains(text(),'keyboard_arrow_right')]");
        By ArrowLeft = By.xpath("//mat-icon[contains(text(),'keyboard_arrow_left')]");

        public FunctionalTab(WebDriver driver) { this.driver = driver;}

        public void ClickNicon(){ driver.findElement(Nicon).click();}
        public void ClickHorizontalUser(){ driver.findElement(HorizontalUser).click();}
        public void ClickHorizontalRoles(){ driver.findElement(HorizontalRoles).click();}
        public void ClickHorzintalTemplates(){ driver.findElement(HorzintalTemplates).click();}
        public void ClickHorizontalDataset(){ driver.findElement(HorizontalDataset).click();}
        public void ClickHorizontalProjects(){ driver.findElement(HorizontalProjects).click();}
        public void ClickHorizontalDcuments(){ driver.findElement(HorizontalDcuments).click();}
        public void ClickHorizontalAnalytics(){ driver.findElement(HorizontalAnalytics).click();}
        public void ClickVerticalUser(){ driver.findElement(VerticalUser).click();}
        public void ClickVerticalRoles(){ driver.findElement(VerticalRoles).click();}
        public void ClickVerticalTemplates(){ driver.findElement(VerticalTemplates).click();}
        public void ClickVerticalDataset(){ driver.findElement(VerticalDataset).click();}
        public void ClickVerticalProjects(){ driver.findElement(VerticalProjects).click();}
        public void ClickVerticalDocuments(){ driver.findElement(VerticalDocuments).click();}
        public void ClickVerticalAnalytics(){ driver.findElement(VerticalAnalytics).click();}
        public void ClickArrowRight(){driver.findElement(ArrowRight).click();}
        public void ClickArrowLeft(){driver.findElement(ArrowLeft).click();}

    }


