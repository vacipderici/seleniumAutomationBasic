package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFrames {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open
        driver.get("https://demoqa.com/nestedframes");

        // Maximize browser
        driver.manage().window().maximize();



      /*  WebElement adFrame =driver.findElement(By.cssSelector("iframe[title='3rd party ad content']"));

        driver.switchTo().frame(adFrame); // you can use with id

        WebElement closeButton = driver.findElement(By.id("cbb"));
        closeButton.click();
*/
        driver.switchTo().frame("frame1");

        WebElement parentBody =driver.findElement(By.tagName("body"));
        System.out.println(parentBody.getText());

        driver.switchTo().frame(0);
        WebElement p = driver.findElement(By.tagName("p"));
        System.out.println(p.getText());


    }
}
