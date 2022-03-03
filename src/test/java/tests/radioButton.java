package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.MidiFileFormat;

public class radioButton {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // Open
        driver.get("https://demoqa.com/radio-button");

        // Maximize browser

        driver.manage().window().maximize();

        WebElement yesRadioButtonLabel = driver.findElement(new By.ByCssSelector("label[for='yesRadio']"));
       // is Button clickable control
        boolean isEnabled =   yesRadioButtonLabel.isEnabled();
        if (isEnabled){
            yesRadioButtonLabel.click();
            System.out.println("Clicked yesRadio button");
        }
        WebElement yesRadioButton = driver.findElement(By.id("yesRadio"));

        boolean isSelected = yesRadioButton.isSelected();
        if (isSelected){
            System.out.println("Yes Radio button is selected");
        }

        //Text
        WebElement output = driver.findElement(new By.ByCssSelector("p.mt-3"));
        System.out.println(output.getText());

        //NoRadio
        WebElement noRadioButton = driver.findElement(By.id("noRadio"));
        System.out.println(noRadioButton.isEnabled());

    }

}
