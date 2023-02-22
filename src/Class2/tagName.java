package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagName {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        //maximize
        driver.manage().window().maximize();
        //go to amazon
        driver.get("https://www.amazon.com/");
        // print all the links in the amazon.com
        driver.findElement(By.tagName("a"));



    }
}
