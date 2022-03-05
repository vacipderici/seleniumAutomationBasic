package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.sound.midi.MidiFileFormat;

public class dynamicProperties {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // Open
        driver.get("https://demoqa.com/dynamic-properties");

        // Maximize browser

        driver.manage().window().maximize();


        WebElement textElement = driver.findElement(By.xpath("//div/p"));
        String text = textElement.getText();
        System.out.println(text);

        //firstButton wait Five Seconds
        WebElement firstButton = driver.findElement(By.id("enableAfter"));
        WebDriverWait wait =  new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(firstButton));
        firstButton.click();

        //ColorChangeButton
        WebElement colorChangeButton = driver.findElement(By.id("colorChange"));
        String className =  colorChangeButton.getAttribute("class");
        System.out.println("before change :" + className);

        WebDriverWait waitColorChange = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.attributeToBe(colorChangeButton,"class","mt-4 text-danger btn btn-primary"));
        className=  colorChangeButton.getAttribute("class");
        System.out.println("After Change :" + className);

        //LastButtonAfter visibleAfter5Seconds
        WebDriverWait waitVisible = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("visibleAfter")));
        driver.findElement(By.id("visibleAfter")).click();


    }

}
