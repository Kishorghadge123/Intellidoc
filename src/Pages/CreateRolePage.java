package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class CreateRolePage {


    WebDriver driver = null;
    //TC 6.1 element locators
    By RoleManagementBtn = By.xpath("//i[@class='mat-tooltip-trigger fa fa-id-card m-0 side-icon ng-star-inserted']");
    By CreateRoleBtn = By.xpath("//span[contains(text(),'Create Role')]");
    By ClickCreate = By.xpath("//span[contains(text(),'Create')]");
    By RoleName = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-edit-role[1]/div[1]/form[1]/mat-card[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]");
    By ActiveRole = By.xpath("//div[@class='mat-slide-toggle-thumb']");
    By AddPermission = By.xpath(" //button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']");
    By ViewDocumentPremission = By.xpath("//span[contains(text(),'View Document')]");
    By ClickCancel = By.xpath("//span[contains(text(),'Cancel')]");
    By SearchRole = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-role-management[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]");
    By EditRole = By.xpath("//span[contains(text(),'Auto Admin')]");
    By ProcessDocumentPermission = By.xpath("//span[contains(text(),'Process Document')]");
    By CreateUserPermission = By.xpath("//span[contains(text(),'Create User')]");
    By RemoveProcessDocPermission = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-edit-role[1]/div[1]/form[1]/mat-card[1]/div[1]/div[5]/div[1]/div[1]/div[1]/mat-chip-list[1]/div[1]/mat-chip[3]/mat-icon[1]");
    By UpdateRole = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-edit-role[1]/div[1]/form[1]/h5[1]/button[2]");
    By RemovePermission = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-edit-role[1]/div[1]/form[1]/mat-card[1]/div[1]/div[5]/div[1]/div[1]/div[1]/mat-chip-list[1]/div[1]/mat-chip[1]/mat-icon[1]");
    By Logout = By.xpath("//i[@class='fa fa-power-off']");
    By LoginBtn = By.xpath("//button[@type='submit']");
    By Username = By.xpath("//input[@formcontrolname='userName']");
    By Password = By.xpath("//input[@formcontrolname='password']");
    By ErrorMsg = By.xpath("//simple-snack-bar[@class='mat-simple-snackbar ng-star-inserted']");
    By UpdatedTime = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[3]");
    By CreatedTime = By.xpath("//tbody[@role='rowgroup']/tr[1]/td[4]");

    public CreateRolePage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickRoleManagementBtn() {
        driver.findElement(RoleManagementBtn).click();
    }

    public void ClickCreateRoleBtn() {
        driver.findElement(CreateRoleBtn).click();
    }

    public void EnterRoleName(String text) {
        driver.findElement(RoleName).sendKeys(text);
    }

    public void AddPermissionPlusBtn() {
        driver.findElement(AddPermission).click();
    }

    public void SelectViewDocumentPermission() {
        driver.findElement(ViewDocumentPremission).click();
    }
    public void SelectCreateUserPermission(){
        driver.findElement(CreateUserPermission).click();
    }

    public void ClickActiveRole() {
        driver.findElement(ActiveRole).click();
    }

    public void ClickCancelButton() {
        driver.findElement((ClickCancel)).click();
    }

    public void ClickCreateButton() {
        driver.findElement((ClickCreate)).click();
    }

    public void SearchCreatedRole(String text) {
        driver.findElement(SearchRole).sendKeys(text);
    }

    public void ClickEditRole() {
        driver.findElement(EditRole).click();
    }

    public void ClickProcessDocPermission() {
        driver.findElement(ProcessDocumentPermission).click();
    }

    public void RemoveProcessPermission() {
        driver.findElement(RemoveProcessDocPermission).click();
    }

    public void ClickUpdateRole() {
        driver.findElement(UpdateRole).click();
    }

    public void ClickRemovePermission() {
        driver.findElement(RemovePermission).click();
    }

    public void ClickLogout() {
        driver.findElement(Logout).click();
    }

    public void EnterUsername(String text) {
        driver.findElement(Username).sendKeys(text);
    }

    public void EnterPassword(String text) {
        driver.findElement(Password).sendKeys(text);
    }

    public void ClickLoginButton() {
        driver.findElement(LoginBtn).click();
    }
    SoftAssert softAssert = new SoftAssert();



    public void CreateRoleAssert() {
        String ActualRole= driver.findElement(EditRole).getText();
        String ExpectedRole = "Auto Admin";
        softAssert.assertEquals(ActualRole, ExpectedRole);
    }
   public void VerifyError(){
       String Actual_Msg=driver.findElement(ErrorMsg).getText();
       String Expected_Msg="Please check form data and permission cannot be empty";
       softAssert.assertEquals(Actual_Msg, Expected_Msg);
   }

   public  void BlankName(){
       String Actual_Msg=driver.findElement(ErrorMsg).getText();
       String Expected_Msg="Please check form data";
       softAssert.assertEquals(Actual_Msg, Expected_Msg);

   }
   public void  BlankPermission(){
       String Actual_Msg=driver.findElement(ErrorMsg).getText();
       String Expected_Msg="Permission cannot be empty";
       softAssert.assertEquals(Actual_Msg, Expected_Msg);

   }

   public void RoleNameExist(){
       String Actual_Msg=driver.findElement(ErrorMsg).getText();
       String Expected_Msg="Role exist with name Auto Admin";
       softAssert.assertEquals(Actual_Msg, Expected_Msg);
    }

    public void CreateTimeAssert()
    {
        String UpdateTime=driver.findElement(UpdatedTime).getText();
        String CreateTime=driver.findElement(CreatedTime).getText();
        softAssert.assertEquals(UpdateTime, CreateTime);

    }
    public void UpdateTimeAssert()
    {
        String UpdateTime=driver.findElement(UpdatedTime).getText();
        String CreateTime=driver.findElement(CreatedTime).getText();
        softAssert.assertNotEquals(UpdateTime,CreateTime);

    }

    public void AssertAll()
    {
        softAssert.assertAll();
    }





}

