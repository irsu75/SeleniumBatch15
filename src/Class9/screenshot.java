package Class9;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import static org.apache.commons.io.FileUtils.copyFile;

public class screenshot {

    public static void main(String[] args) throws IOException {
        //        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
//        goto website
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");

        //username Text box
        WebElement userName=driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userName.sendKeys("Tester");
  //password field
  WebElement pass = driver.findElement(By.xpath("//input='ctl00$MainContent$password']"))  ;
  pass.sendKeys("test");
  //password field
        TakesScreenshot ss= (TakesScreenshot) driver;
       File sourceFile =ss.getScreenshotAs(OutputType.FILE);

 //save the file in computer
       FileUtils. copyFile(sourceFile,new File("C:\\Users\\vladb\\IdeaProjects\\SeleniumBatch15"))   ;
    }
}
