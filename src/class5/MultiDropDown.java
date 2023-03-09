package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropDown {
    public static void main(String[] args) throws InterruptedException {
        //tell your project where the webdriver is located
        //for mac user please do not use.exe with chromedriver

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //create an instance of Webdriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // go to syntaxprojects. com
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");

        WebElement DD = driver.findElement(By.xpath("//select[@id='multi-select']"));
       // use the select class
        Select sel = new Select(DD);

        sel.deselectByValue("New Jersey");

        sel.deselectByVisibleText("Ohio");

        Thread.sleep(2000);

        sel.deselectByValue("New Jersey");

        sel.deselectByVisibleText("Ohio");
    }
}
