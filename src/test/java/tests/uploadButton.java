package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadButton {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // Open
        driver.get("https://demoqa.com/upload-download");

        // Maximize browser
        driver.manage().window().maximize();

        WebElement uploadButton =driver.findElement(By.id("uploadFile"));
        uploadButton.sendKeys("/Users/vcp/Destktop/seleniumicon.png");


    }
}