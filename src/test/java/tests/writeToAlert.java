package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class writeToAlert {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open
        driver.get("https://demoqa.com/alerts");

        // Maximize browser
        driver.manage().window().maximize();

        driver.findElement(By.id("promtButton")).click();

        WebDriverWait wait = new WebDriverWait(driver,5);

        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert =     driver.switchTo().alert();

        alert.sendKeys("Vcp");

        alert.dismiss();
        alert.accept();
}
}
