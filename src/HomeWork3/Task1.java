package HomeWork3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
public class Task1 {
    public static void main(String[] args) {
        /*
      1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/dynamic_loading/1
2.Click on the "Start" button to initiate the loading of a hidden element
3.Without using Thread.sleep(), write a code that waits for the hidden element to appear using Implicit Wait
4.Click the "Finish" button to reveal the hidden element
5.Verify that the text "Hello World!" is now displayed on the page
         */
        //tell your project where the webdriver is located
        //for mac user please do not use.exe with chromedriver

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //create an instance of Webdriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // go to webside
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//button[text()='Start']")).click();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
        WebElement finish=driver.findElement(By.id("finish"));
        finish.click();
        boolean isDisplayed=finish.isDisplayed();
        System.out.println(isDisplayed);
        driver.close();
    }
}


