package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open
        driver.get("https://demoqa.com/alerts");

        // Maximize browser
        driver.manage().window().maximize();

        driver.findElement(By.id("alertButton")).click();

        WebDriverWait wait = new WebDriverWait(driver,2);

        wait.until(ExpectedConditions.alertIsPresent());


        driver.switchTo().alert().accept();


    }
}
