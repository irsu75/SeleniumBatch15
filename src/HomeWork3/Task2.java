package HomeWork3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
    /*    1.Open the Chrome browser and navigate to https://the-internet.herokuapp.com/iframe
        2.Switch to the iframe on the page
        3.Clear the existing text in the  editor inside the iframe
        4.Enter the text "Hello World!" in the editor inside the iframe
        5.Switch back to the main page

     */
        //tell your project where the webdriver is located
        //for mac user please do not use.exe with chromedriver

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //create an instance of Webdriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // go to webside
        driver.get("https://the-internet.herokuapp.com/iframe");
    }
}
