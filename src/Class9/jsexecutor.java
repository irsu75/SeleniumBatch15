package Class9;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsexecutor {
    public static void main(String[] args) {
        //        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
//        goto website
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
  // find the webElement username
        WebElement username=driver.findElement(By.id("txtUsername")) ;
        username.sendKeys("Admin");
  // to highlight the username box
  //  1. declare instance
        JavascriptExecutor js=(JavascriptExecutor) driver;
  // 2. execute script
        //"arguments[0].style.border='10px dotted pink'"  draw a box
  js.executeScript("arguments[0].style.border='10px dotted red'",username);

  //find the Webelement
        WebElement loginBtn =driver.findElement(By.xpath("//input[@id='btnLogin']"));

  //click the login button
        js.executeScript("arguments[0].click();",loginBtn);


    }
}
