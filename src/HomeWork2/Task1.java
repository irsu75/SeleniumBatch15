package HomeWork2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        /*
        *navigate to (https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22)
        * fill out the form
        * click on register
        * close the browser
 */
          //tell your project where the webdriver is located
        //for mac user please do not use.exe with chromedriver
        System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");

        //create an instance of Webdriver
        WebDriver driver=new ChromeDriver();


        //now navigate to
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");



    }
}
