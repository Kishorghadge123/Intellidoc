package Pages;
import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class CreateUserPage extends BasePage
{

    By UserBtn = By.xpath("//i[@class='mat-tooltip-trigger fa fa-users m-0 side-icon ng-star-inserted']");
    By CreateUserBtn = By.xpath("//button[@class='mat-focus-indicator font-17 float-right btn-xs-block mat-raised-button mat-button-base mat-primary ng-star-inserted']");
    By CreateBtn = By.xpath("//button[@class='mat-focus-indicator float-right button-cls mat-raised-button mat-button-base mat-primary']");
    By EnterUserName = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-edit-user[1]/div[1]/form[1]/mat-card[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]");
    By EnterEmail  = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-edit-user[1]/div[1]/form[1]/mat-card[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]");
    By ActiveUser = By.xpath("//div[@class='mat-slide-toggle-thumb']");
    By CancelBtn = By.xpath("//span[contains(text(),'Cancel')]");
    By SearchBtn  = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-user-management[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]");
    //By SelectUser = By.xpath("//td[contains(text(),' Auto SampleAA ')]");
    By DisableUser = By.xpath("//div[@class='mat-slide-toggle-thumb']");
    By UpdateUser  = By.xpath("//button[@class='mat-focus-indicator float-right button-cls mat-raised-button mat-button-base mat-primary']");
    By Password  = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-edit-user[1]/div[1]/form[1]/mat-card[1]/div[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]");
    By UserName = By.xpath("//td[contains(text(),' AutoSampleBB ')]");
    By UpdatedTime = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[3]");
    By CreatedTime = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[4]");



    public CreateUserPage(WebDriver driver) {
        this.driver = driver;
    }
    public  void ClickUserBtn(){driver.findElement(UserBtn).click();}
    public void ClickCreateUserBtn(){driver.findElement(CreateUserBtn).click();}
    public void ClickCreateBtn(){driver.findElement(CreateBtn).click();}
    public void EnterUserName(String text) {driver.findElement(EnterUserName).sendKeys(text);}
    public void EnterEmail(String text){driver.findElement(EnterEmail).sendKeys(text);}
    public void ClickActiveUser(){driver.findElement(ActiveUser).click();}
    public void ClickCancelBtn(){driver.findElement(CancelBtn).click();}
    public  void SearchCreatedUser(String text){driver.findElement(SearchBtn).sendKeys(text);}
    public  void SelectSearchedUser(){driver.findElement(UserName).click();}
    public void ClickDisableUser(){driver.findElement(DisableUser).click();}
    public void ClickEnableUser(){driver.findElement(DisableUser).click();}
    public void ClickUpdateUser(){driver.findElement(UpdateUser).click();}
    public void ClicktoClearName(){driver.findElement(EnterUserName).clear();}
    public  void ClearPassword(){driver.findElement(Password).clear();}
    public void EnterPassword(String text){driver.findElement(Password).sendKeys(text);}
    public void CreateUserAssert() {
        String User[] = driver.findElement(UserName).getText().split(" ");
        String ActualUser = User[1].trim();
        String ExpectedUser = "AutoSampleBB";
        Assert.assertEquals(ActualUser, ExpectedUser);
    }


    public void TimeAssert()
    {
        String UpdateTime=driver.findElement(UpdatedTime).getText();
        String CreateTime=driver.findElement(CreatedTime).getText();
        Assert.assertEquals(UpdateTime, CreateTime);

    }

    public void UpdateTimeAssert()
    {
        String UpdateTime=driver.findElement(UpdatedTime).getText();
        String CreateTime=driver.findElement(CreatedTime).getText();
        Assert.assertNotEquals(UpdateTime,CreateTime);

    }


}


