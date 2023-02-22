package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationElements {

        public static void main(String[] args) {
            //tell your project where webdriver is located
            //for mac user please do not use .exe with chromedriver
            System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        //create an instance of Webdriver
            WebDriver driver=new ChromeDriver();

          //  open up fb.com
            driver.get("https://www.facebook.com/");

          // send in the username

            driver.findElement(By.id("email")).sendKeys("moazzam");

            //send the password
            driver.findElement(By.name("pass")).sendKeys("abracadabra");

            //click on the button create new account
            driver.findElement(By.linkText("Create a new account")).click();

            //click on forgotten password
            driver.findElement(By.partialLinkText("password")).click();

            driver.quit();
    }
}
