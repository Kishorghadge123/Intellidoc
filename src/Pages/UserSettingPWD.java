package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



    public class UserSettingPWD {
        WebDriver driver = null;

        By Password = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-landing[1]/div[1]/div[1]/main[1]/div[1]/app-create-edit-user[1]/div[1]/mat-card[1]/form[1]/div[1]/div[3]/mat-form-field[1]/div[1]/div[1]/div[3]/input[1]");
        By UpdateBtn = By.xpath("//span[contains(text(),'Update')]");
        By Textbox1 = By.xpath("//body/app-root[1]/div[1]/app-resetpassword[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]");
        By Textbox2 = By.xpath("//body/app-root[1]/div[1]/app-resetpassword[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]");
        By SubmitPWD = By.xpath("//span[contains(text(),'Submit')]");
        By username = By.xpath("//body/app-root[1]/div[1]/app-login[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/input[1]");
        By password = By.xpath("//body/app-root[1]/div[1]/app-login[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/form[1]/div[2]/input[1]");

        public UserSettingPWD(WebDriver driver) {
            this.driver = driver;
        }

        public void ClearPassword(){driver.findElement(Password).clear();}
        public void NewPassword(String text){driver.findElement(Password).sendKeys(text);}
        public void UpdatePWD(){driver.findElement(UpdateBtn).click();}
        public void NewPWD(String text){driver.findElement(Textbox1).sendKeys(text);}
        public void NewPWD1(){driver.findElement(Textbox1).clear();}
        public void ConfirmPWD(String text){driver.findElement(Textbox2).sendKeys(text);}
        public void ConfirmPWD1(){driver.findElement(Textbox2).clear();}
        public void ClickSubmitPWD(){driver.findElement(SubmitPWD).click();}

        public void NewUsername(String text) {
            driver.findElement(username).sendKeys(text);
        }
        public void NewPassword1(String text) {
            driver.findElement(password).sendKeys(text);
        }


}
