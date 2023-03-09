package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
    public static void main(String[] args) throws InterruptedException {
        //tell your project where the webdriver is located
        //for mac user please do not use.exe with chromedriver

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //create an instance of Webdriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // go to syntaxprojects. com
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        // locate the WebElement
        WebElement dropDown =driver.findElement(By.xpath("//select[@id='select-demo']"));
        //use select class because this drop down has a select tag
        Select sel = new Select(dropDown);
        //using select class we have different methods to select the desired option
        //select by index
        sel.deselectByIndex(2);
        Thread.sleep(2000);
// select by value
        sel.deselectByValue("Tuesday");
        Thread.sleep(2000);
        //select by visible text
        sel.deselectByVisibleText("Friday");
        Thread.sleep(2000);
    }
}
