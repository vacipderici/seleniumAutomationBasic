package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class DownloadButton {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // Open
        driver.get("https://demoqa.com/upload-download");

        // Maximize browser

        driver.manage().window().maximize();

        WebElement downloadButton = driver.findElement(By.id("downloadButton"));
        downloadButton.click();

        String path ="/Users/Vcp/Downloads";
        String fileName ="sampleFile.jpeg";
        Thread.sleep(5000);
        boolean isDownloaded = isFileDownloaded(path,fileName);

        public static boolean isFileDownloaded(String downloadPath, String fileName){
            File file = new File(downloadPath);
            File [] files = file.listFiles();

             for(int i =0 ;i< files.length ; i++)
                if (files[i].getName().equals(fileName)) {
                    files[i].delete();
                    return true;
                }
            return  false;
        }


    }


}
}
