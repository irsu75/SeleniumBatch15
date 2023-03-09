package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class implicitWait {
    public static void main(String[] args) {
        //tell your project where the webdriver is located
        //for mac user please do not use.exe with chromedriver

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //create an instance of Webdriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        // go to webside
        driver.get("https://www.facebook.com");
        //click on the create new account
        driver.findElement(By.linkText("Create a new account")).click();
        //send your firstname
        driver.findElement(By.name("firstname")).sendKeys("abracadabra");
    }
}
