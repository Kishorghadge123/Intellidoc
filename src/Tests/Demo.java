package Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import java.time.Duration;
import java.time.Instant;
    public class Demo {
        WebDriver driver;
        @Test
        public void A() {

            String projectPath = System.getProperty("user.dir");
            System.setProperty("webdriver.chrome.driver", projectPath + ".\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            Instant StartTime = Instant.now();
            System.out.println(StartTime.toString());
            driver.get("https://alpha.neutrino-ai.com/#/login");
            Instant EndTime = Instant.now();
            System.out.println(EndTime.toString());
            Duration duration = Duration.between(StartTime, EndTime);
            System.out.println("PageLoadTime: " + duration.toMillis());
        }
    }

