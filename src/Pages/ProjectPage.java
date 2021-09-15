package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProjectPage {


    WebDriver driver = null;


    By addRoleUser = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/mat-accordion[1]/mat-expansion-panel[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]");

    //Define Project
    By ProjectBtn = By.xpath("//i[@class='mat-tooltip-trigger fa fa-briefcase m-0 side-icon ng-star-inserted']");
    By CreateProject = By.xpath("//span[contains(text(),'Create Project')]");
    By ProjectName = By.xpath("//input[@formcontrolname='project']");
    By Lead = By.xpath("//*[@formcontrolname='lead']");
    By SelectLead = By.xpath("//span[contains(text(),'QA1@email.com')]");
    By ClickStartDate = By.cssSelector("button[aria-label='Open calendar'][tabindex='0']");
    // By ClickStartDate = By.xpath("//*[@id='cdk-step-content-1-0']/div/project-info-section/project-info/mat-card/form/div/div[3]/mat-form-field/div/div[1]/div[4]/mat-datepicker-toggle/button/span[1]/svg/path");
    By SelectStartDate = By.xpath("//div[contains(text(),'3')]");
    By ClickEndDate= By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/project-info-section[1]/project-info[1]/mat-card[1]/form[1]/div[1]/div[4]/mat-form-field[1]/div[1]/div[1]/div[4]/mat-datepicker-toggle[1]/button[1]/span[1]/*[1]");
    By SelectEndDate = By.xpath("//div[contains(text(),'25')]");
    By ClickDocumentStructure = By.xpath("//*[@formcontrolname='documentStructure']");
    By SelectDocumentStructure = By.xpath("//span[contains(text(),'Structured ')]");
    By ClickProcessingEngine = By.xpath("//*[@formcontrolname='processingEngine']/div[1]/div[2]");
    By SelectProcessingEngine = By.xpath("//span[contains(text(),'NN High')]");
    By StraightThroughProcess = By.xpath("//*[@formcontrolname='staightThroughProcessing']/label/div");
    By DocumentScore = By.xpath("//input[@formcontrolname='score']");
    By Status = By.xpath("//*[@formcontrolname='status']/label/div");
    By DocumentAutoAssign = By.xpath("//*[@formcontrolname='autoAssignment']/label/div");
    // By ClickTemplate = By.xpath("//span[contains(text(),'Templates')]");
    By ClickAddTemplate = By.xpath("//span[contains(text(),'Add Template')]");
    By SelectTemplate = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[5]");
    // By DeleteTemplate = By.xpath("//mat-icon[contains(text(),'delete')]");
    By ClickRoles = By.xpath("//span[contains(text(),'Roles')]");
    By AddRole = By.xpath("//span[contains(text(),'Add Role')]");
    By SelectRole = By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[7]");
    By AddUser = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/project-info-section[1]/mat-accordion[1]/project-roles[1]/mat-expansion-panel[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]");       //esc method
    By SelectUser = By.xpath("//body/div[1]/div[2]/div[1]/div[1]/div[1]/mat-option[166]/mat-pseudo-checkbox[1]");
    By ClickDataset = By.xpath("//span[contains(text(),'Datasets')]");
    By AddDataset = By.xpath("//span[contains(text(),'Add Dataset')]");
   // By SelectData = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[4]");
    By SelectDataSample = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/button[4]");
    By AddData = By.xpath("//*[@id='mat-menu-panel-6']/div/div[14]/button");//*[@id="mat-menu-panel-1"]/div/button[7]
    // By DeleteDataset = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/mat-horizontal-stepper[1]/div[2]/div[1]/div[1]/mat-accordion[1]/mat-expansion-panel[3]/div[1]/div[1]/div[1]/mat-table[1]/mat-row[1]/mat-cell[6]/button[1]/span[1]/mat-icon[1]");
    By DocumentChanel = By.xpath("//span[contains(text(),'Document Ingestion Channels')]");
    By ChannelType = By.xpath("//*[@id='testa1']/div/div[2]/div");
    By SelectChannelType = By.xpath("//*[@id='mat-option-9']/span");
    By ClickNext = By.xpath("//span[contains(text(),'Next')]");

    //Rules Workbench
    By CLickVariable = By.xpath("//span[contains(text(),'Variables')]");
    By AddVariable = By.xpath("//*[@id='cdk-accordion-child-3']/div/div/button/span[1]");
    By VariableName = By.xpath("//input[@id='variableName']");
    By ValidationType = By.xpath("//*[@id='mat-select-value-5']/span");
    By SelectValidationType = By.xpath("//span[contains(text(),'Boolean')]");
    By DefaultValue = By.xpath("//input[@id='VariableValue']");
    By ClickCancelonVariable = By.xpath("//*[@id='exampleModal']/div/div/div[2]/button[1]");
    By ClickRuleset = By.xpath("//span[contains(text(),'Ruleset')]");
    By AddRule = By.xpath("//*[@id='cdk-accordion-child-4']/div/div/div[3]/div/button/span[1]");
    By RuleName = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-project[1]/mat-horizontal-stepper[1]/div[2]/div[2]/form[1]/div[1]/div[2]/mat-accordion[1]/mat-expansion-panel[2]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]");
    By DeleteRule = By.xpath("//mat-icon[contains(text(),'delete')]");
    By ClickCancelOnRuleWorkbench = By.xpath("//*[@id='cdk-step-content-0-1']/form/div/div[2]/div/button[3]/span[1]");
    By CreateButton = By.xpath("//span[contains(text(),'Create')]");
    //Project Homepage
    By ClickTableStructure = By.xpath("//*[@class='main']/div/app-project-management/div/div/div/ul/li[2]");
    By ClickGridStructure = By.xpath("//mat-icon[contains(text(),'grid_on')]");
    By ClickEdit = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-project-management[1]/div[2]/div[1]/div[2]/mat-card[1]/div[1]/div[1]/div[2]/button[1]/span[1]/mat-icon[1]");
    //navigate back
    By ClickSearchBox = By.xpath("//input[@placeholder='Search']");
    By ClickSearchBox1 = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-project-management[1]/div[1]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]");

    By ArrowRight = By.xpath("//mat-icon[contains(text(),'keyboard_arrow_right')]");
    By ArrowLeft = By.xpath("//mat-icon[contains(text(),'keyboard_arrow_left')]");
    By ItemsPerPage = By.xpath("//*[@aria-label='Items per page:']");
    By SelectItems = By.xpath("//span[contains(text(),'50')]");
    By NextPage = By.xpath("//span[contains(text(),'Next')]");
    By LastPage = By.xpath("//*[@aria-label='Last page']");
    By PreviousPage = By.xpath("//*[@aria-label='Previous page']");
    By FirstPage = By.xpath("//*[@aria-label='First page']");
    By CancelOnProject = By.xpath("//*[contains(text(),'Cancel')]");

    By ErrorMsgDataRole = By.xpath("//span[contains(text(),'Please check form data and role(s) cannot be empty')]");
    By ErrorMsgRoleUser = By.xpath("//span[contains(text(),'Please add the attributes before creating the project.')]");
    By ErrorMsgTemplate = By.xpath("//span[contains(text(),'Please add the template before creating the project.')]");
    By ErrorMsgData = By.xpath("//span[contains(text(),'Please add the attributes before creating the project.')]");


    public ProjectPage(WebDriver driver) {
        this.driver = driver;
    }

    public void ClickOnProjectBtn() {
        driver.findElement(ProjectBtn).click();
    }

    public void ClickOnCreateProjectBtn() {
        driver.findElement(CreateProject).click();
    }

    public void ClickOnProjectNameBtn(String text) {
        driver.findElement(ProjectName).sendKeys(text);
    }

    public void ClickOnLeadBtn() {
        driver.findElement(Lead).click();
    }

    public void SelectOnLeadBtn() {
        driver.findElement(SelectLead).click();
    }

    public void ClickOnStartDateBtn() {
        driver.findElement(ClickStartDate).click();
    }

    public void SelectOnStartDateBtn() {
        driver.findElement(SelectStartDate).click();
    }

    public void ClickOnDocumentStructureBtn() {
        driver.findElement(ClickDocumentStructure).click();
    }

    public void SelectOnDocumentStructureBtn() {
        driver.findElement(SelectDocumentStructure).click();
    }

    public void ClickOnProcessingEngineBtn() {
        driver.findElement(ClickProcessingEngine).click();
    }

    public void SelectOnProcessingEngineBtn() {
        driver.findElement(SelectProcessingEngine).click();
    }

    public void ClickOnStraightThroughProcessBtn() {
        driver.findElement(StraightThroughProcess).click();
    }

    public void ClickOnDocumentScoreBtn(String text) {
        driver.findElement(DocumentScore).sendKeys(text);
    }

    public void ClickOnStatusBtn() {
        driver.findElement(Status).click();
    }

    public void ClickOnDocumentAutoAssignBtn() {
        driver.findElement(DocumentAutoAssign).click();
    }

    //    public void ClickOnClickTemplateBtn(){ driver.findElement(ClickTemplate).click(); }
    public void ClickOnAddTemplateBtn() {
        driver.findElement(ClickAddTemplate).click();
    }

    public void ClickOnTemplateBtn() {
        driver.findElement(SelectTemplate).click();
    }

    //    public void ClickOnDeleteTemplateBtn(){ driver.findElement(DeleteTemplate).click(); }
    public void ClickOnRolesBtn() {
        driver.findElement(ClickRoles).click();
    }

    public void ClickOnAddRoleBtn() {
        driver.findElement(AddRole).click();
    }

    public void ClickOnSelectRoleBtn() {
        driver.findElement(SelectRole).click();
    }

    public void ClickOnAddUserBtn() {
        driver.findElement(AddUser).click();
    }

    public void ClickOnSelectUserBtn() {
        driver.findElement(SelectUser).click();
    }       //esc method

    public void ClickOnDatasetBtn() {
        driver.findElement(ClickDataset).click();
    }

    public void ClickOnAddDatasetBtn() {
        driver.findElement(AddDataset).click();
    }

   /* public void ClickOnSelectDataBtn() {
        driver.findElement(SelectData).click();
    }*/

    public void ClickOnSampleDataBtn() {
        driver.findElement(SelectDataSample).click();
    }

    public void ClickOnSelectSampleDataBtn(){ driver.findElement(SelectDataSample).click(); }
    // public void ClickOnDeleteDatasetBtn(){ driver.findElement(DeleteDataset).click(); }
    public void ClickOnDocumentChannelBtn() {
        driver.findElement(DocumentChanel).click();
    }

    public void ClickOnChannelTypeBtn() {
        driver.findElement(ChannelType).click();
    }

    public void SelectChannelTypeBtn() {
        driver.findElement(SelectChannelType).click();
    }

    public void ClickOnClickNextBtn() {
        driver.findElement(ClickNext).click();
    }

    //Rule Workbench
    public void ClickOnVariableBtn() {
        driver.findElement(CLickVariable).click();
    }

    public void ClickOnAddVariableBtn() {
        driver.findElement(AddVariable).click();
    }

    public void ClickOnVariableNameBtn(String text) {
        driver.findElement(VariableName).sendKeys(text);
    }

    public void ClickOnValidationTypeBtn() {
        driver.findElement(ValidationType).click();
    }

    public void SelectValidationTypeBtn() {
        driver.findElement(SelectValidationType).click();
    }

    public void ClickOnDefaultValueBtn(String text) {
        driver.findElement(DefaultValue).sendKeys(text);
    }

    public void ClickOnCancelVariable() {
        driver.findElement(ClickCancelonVariable).click();
    }

    public void ClickOnRulesetBtn() {
        driver.findElement(ClickRuleset).click();
    }

    public void ClickOnAddRuleBtn() {
        driver.findElement(AddRule).click();
    }

    public void ClickOnRuleNameBtn(String text) {
        driver.findElement(RuleName).sendKeys(text);
    }

    //public void ClickOnDeleteRuleBtn(){ driver.findElement(DeleteRule).click(); }
    public void ClickOnCancelRuleWorkbench() {
        driver.findElement(ClickCancelOnRuleWorkbench).click();
    }

    //Project Homepage
    public void ClickOnTableStructure() {
        driver.findElement(ClickTableStructure).click();
    }

    public void ClickOnGridStructure() {
        driver.findElement(ClickGridStructure).click();
    }

    public void ClickOnEditBtn() {
        driver.findElement(ClickEdit).click();
    }

    public void ClickOnSearchBox(String text) {
        driver.findElement(ClickSearchBox).sendKeys(text);
    }

    public void ClickOnSearchBox1() {
        driver.findElement(ClickSearchBox1).clear();
    }

    //script enhancement
    public void ClickArrowRight() {
        driver.findElement(ArrowRight).click();
    }

    public void ClickArrowLeft() {
        driver.findElement(ArrowLeft).click();
    }

    public void ClickItemsPerPage() {
        driver.findElement(ItemsPerPage).click();
    }

    public void SelectItemsPerPage() {
        driver.findElement(SelectItems).click();
    }

    public void ClickNextPage() {
        driver.findElement(NextPage).click();
    }

    public void ClickLastPage() {
        driver.findElement(LastPage).click();
    }

    public void ClickPreviousPage() {
        driver.findElement(PreviousPage).click();
    }

    public void ClickFirstPage() {
        driver.findElement(FirstPage).click();
    }

    public void ClickonDataset() {
        driver.findElement(AddData).click();
    }

    public void ClickonCreate() {
        driver.findElement(CreateButton).click();
    } //Method for createbutton on Project page

    public void ClickonCancelOnProject() {
        driver.findElement(CancelOnProject).click();
    }

    public void addUserInRole() {
        driver.findElement(addRoleUser).click();
    }

    public void VerifyAssertForError() {

        String actual_msg = driver.findElement(ErrorMsgDataRole).getText();
        String expect = "Please check form data and role(s) cannot be empty";
        Assert.assertEquals(actual_msg, expect);
    }

    public void VerifyAsertForUser() {
        String actual_msg = driver.findElement(ErrorMsgRoleUser).getText();
        String expect = "Please add the attributes before creating the project.";
        Assert.assertEquals(actual_msg, expect);
    }

    public void VerifyAsserForTemplate() {
        String actual_msg = driver.findElement(ErrorMsgTemplate).getText();
        String expect = "Please add the template before creating the project.";
        Assert.assertEquals(actual_msg, expect);
    }

    public void VerifyAssertForData() {
        String actual_msg = driver.findElement(ErrorMsgData).getText();
        String expect = "Please check form data";
        Assert.assertEquals(actual_msg, expect);
    }

    public void ClickOnEndDate()
    {
        driver.findElement(ClickEndDate).click();
    }

    public void SelectEndDate()
    {
        driver.findElement(SelectEndDate).click();
    }


}
