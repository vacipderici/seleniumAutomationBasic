package tests;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.http.HttpResponse;

public class brokenLinksImages {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        // Open
        driver.get("https://demoqa.com/broken");

        // Maximize browser
        driver.manage().window().maximize();




        //BROKEN LINKS
       // HttpClient client = HttpClientBuilder.create().build();
       // HttpResponse response = client.execute(new HttpGet("http://the-internet.herokuapp.com/status_codes/500"));
       // int statusCode = response.getStatusLine().getStatusCode();
       // System.out.println(statusCode);

        //Broken Images
        WebElement brokenImage = driver.findElement(By.xpath("//div/img[2]"));
        String brokenImageUrl= brokenImage.getAttribute("src");
        System.out.println(brokenImageUrl);






}
}
