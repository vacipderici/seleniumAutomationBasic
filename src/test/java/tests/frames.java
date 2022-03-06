package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class frames {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open
        driver.get("https://demoqa.com/frames");

        // Maximize browser
        driver.manage().window().maximize();

        driver.switchTo().frame(0); // you can use with id

        WebElement heading = driver.findElement(By.id("sampleHeading"));
        String text = heading.getText();
        System.out.println(text);

        //ustteki Frame'e geciyorum
        driver.switchTo().parentFrame();

        List<WebElement> elementList = driver.findElements(By.cssSelector("div[id='framesWrapper'] div"));
        String paragraph  =elementList.get(0).getText();
        System.out.println(paragraph);

    }
}
