package HomeWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        *navigate to fb.com
        * click to great new account
        * fill up all the textboxes
        * click on sign up of button
        * close the pop up
        * close the browser

        * just fill in text boxes or button, no need to deal with other webElements
        * also u will need a Thread.sleep after clcikng on create new account
        * we will discuss "WHY" in future
 */

       System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe") ;
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        //click on create new account
        driver.findElement(By.linkText("Create new account")).click();
            Thread.sleep(3000);


        //fill up all textboxes
        driver.findElement(By.name("firstname")).sendKeys("Ivan");
        driver.findElement(By.name("lastname")).sendKeys("Petrov");
        driver.findElement(By.name("reg_email_")).sendKeys("IvanPetrov@gmail.com");
        driver.findElement(By.name("reg_email_confirmation")).sendKeys("IvanPetrov@gmail.com");
        driver.findElement(By.name("reg_password_")).sendKeys("987654@");

        //click on sign up button
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(3000);

        //close the pop up
        driver.findElement(By.xpath("//img[@class = '_8idr img']")).click();
        Thread.sleep(3000);


    }
}
