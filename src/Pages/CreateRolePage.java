package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateRolePage {




        WebDriver driver = null;
        //TC 6.1 element locators
        By roleManagementBtn = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/app-sidebar[1]/mat-sidenav-container[1]/mat-sidenav[1]/div[1]/mat-nav-list[1]/mat-list-item[2]/div[1]/i[1]");
        By createRoleBtn = By.xpath("//span[contains(text(),'Create Role')]");
        By rollName= By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-edit-role[1]/div[1]/mat-card[1]/form[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]");
        By ActiveRole = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-edit-role[1]/div[1]/mat-card[1]/form[1]/div[1]/div[2]/section[1]/mat-slide-toggle[1]/label[1]/div[1]/div[1]/div[1]");
        By addPermission =By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-edit-role[1]/div[1]/mat-card[1]/form[1]/div[1]/div[4]/span[1]/button[1]/span[1]");
        By SelectPermissionBtn = By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]");
        By PermissionText = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-edit-role[1]/div[1]/mat-card[1]/form[1]/div[1]/div[3]/div[1]");
        By ClickCancel = By.xpath("//span[contains(text(),'Cancel')]");
        By ClickCreate = By.xpath("//span[contains(text(),'Create')]");
        By searchRole=By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-role-management[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]");
        By EditRole = By.xpath("//body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-role-management[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/button[1]/span[1]/mat-icon[1]");
        By EditAddPermission = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-edit-role[1]/div[1]/mat-card[1]/form[1]/div[1]/div[6]/span[1]/button[1]/span[1]");

        By RemovePermission1 = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-edit-role[1]/div[1]/mat-card[1]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/mat-chip-list[1]/div[1]/mat-chip[1]/mat-icon[1]"); //view document
        By RemovePermission3 = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-edit-role[1]/div[1]/mat-card[1]/form[1]/div[1]/div[5]/div[1]/div[1]/div[1]/mat-chip-list[1]/div[1]/mat-chip[2]/mat-icon[1]"); //create user

        By UpdateRole = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-edit-role[1]/div[1]/h5[1]/button[2]");

        By Permission1 = By.xpath("//span[contains(text(),'View Document')]");
        By Permission2 = By.xpath("//span[contains(text(),'View Project')]");
        By Permission3 = By.xpath("//span[contains(text(),'Create Project')]");
        By Permission4 = By.xpath("//span[contains(text(),'Update Role')]");
        By DisableUser = By.xpath("//body/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-edit-role[1]/div[1]/mat-card[1]/form[1]/div[1]/div[4]/section[1]/mat-slide-toggle[1]/label[1]/div[1]/div[1]/div[1]");

        public CreateRolePage(WebDriver driver) {
            this.driver = driver;
        }

        public void ClickRoleManagementBtn(){ driver.findElement(roleManagementBtn).click();}
        public void ClickCreateRollBtn(){ driver.findElement(createRoleBtn).click();}
        public void EnterRollName(String text) { driver.findElement(rollName).sendKeys(text); }
        public void AddPermissionPlusBtn(){ driver.findElement(addPermission).click();}
        public void SelectPermission(){ driver.findElement(SelectPermissionBtn).click();}
        public void ClickOnPermissionText(){ driver.findElement(PermissionText).click();}
        public void ClickActiveRole(){driver.findElement(ActiveRole).click();}
        public void ClickCancelButton(){driver.findElement((ClickCancel)).click();}
        public void ClickCreateButton(){driver.findElement((ClickCreate)).click();}
        public void SearchCreatedRole(String text) { driver.findElement(searchRole).sendKeys(text); }
        public void ClickEditRole (){ driver.findElement(EditRole).click();}
        public void ClickEditAddPermission(){driver.findElement(EditAddPermission).click();}

        public void CLickRemovePermission1(){driver.findElement(RemovePermission1).click();}
        public void ClickRemovePermission3(){driver.findElement(RemovePermission3).click();}
        public void ClickUpdateRole(){driver.findElement(UpdateRole).click();}

        public void ClickPermission1(){driver.findElement(Permission1).click();}
        public void ClickPermission2(){driver.findElement(Permission2).click();}
        public void ClickPermission3(){driver.findElement(Permission3).click();}
        public void ClickPermission4(){driver.findElement(Permission4).click();}
        public void ClickDisableUser(){driver.findElement(DisableUser).click();}

    }


