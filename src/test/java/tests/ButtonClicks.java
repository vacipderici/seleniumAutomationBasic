package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.sound.midi.MidiFileFormat;

public class ButtonClicks {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // Open
        driver.get("https://demoqa.com/buttons");

        // Maximize browser

        driver.manage().window().maximize();

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

        Actions actions =new Actions(driver);
        actions.doubleClick(doubleClickButton).perform();

        WebElement message = driver.findElement(By.id("doubleClickMessage"));
        String messageText =message.getText();
        System.out.println(messageText);

        //rightClick
        Actions actionRightclick = new Actions(driver);
        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
        actionRightclick.contextClick(rightClickButton).perform();

        WebElement rightClickMessage = driver.findElement(By.id("rightClickMessage"));
        String messageText1 =rightClickMessage.getText();
        System.out.println(messageText1);

        //DynamicElements
        ////div/button[,contains(text()),"Click Me"] you can use stars with\last
        //div/[last()]/button

    }

}
