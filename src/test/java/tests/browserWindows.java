package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class browserWindows {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // Open
        driver.get("https://demoqa.com/browser-windows");

        // Maximize browser

        driver.manage().window().maximize();

        WebElement tabButton =driver.findElement(By.id("tabButton")); //WindowButton
        tabButton.click();

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());

        System.out.println(tabs.size());

        driver.switchTo().window(tabs.get(1));

        System.out.println(driver.getCurrentUrl());

        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }


        driver.close(); //close opened page

        // driver.quit(); close the driver




}
}
