package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // Open
        driver.get("https://demoqa.com/automation-practice-form");

        // Maximize browser

        driver.manage().window().maximize();
        JavascriptExecutor jsx = (JavascriptExecutor)driver;
        jsx.executeScript("window.scrollBy(0,500)", "");

        WebElement sportCheckbox = driver.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnabled = sportCheckbox.isEnabled();
        System.out.println((isEnabled));

        WebElement sportCheckBoxLabel = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));

        if (isEnabled){
            try {
                sportCheckbox.click();
            }
            catch (ElementClickInterceptedException e){
                sportCheckBoxLabel.click();
                System.out.println("Entered the catch block");
            }
        }
           boolean isSelected =  sportCheckbox.isSelected();
           System.out.println(isSelected);
    }
}
