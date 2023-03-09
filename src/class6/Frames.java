package class6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[] args) {
        //tell your project where the webdriver is located
        //for mac user please do not use.exe with chromedriver

        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");

        //create an instance of Webdriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // go to webside
        driver.get("http://www.uitestpractice.com/Students/Switchto");

        // switch to the iframe which contains the input box
        // method : by index
        driver.switchTo().frame(0);
        //this statement willshift the focus to the first frame
        WebElement textBox = driver.findElement(By.xpath("//input[@id='name']"));
        //send some text
        textBox.sendKeys("abracadabra");

        //get the text  click on from parent window
         driver.switchTo().defaultContent();

         //find the text
        WebElement text= driver.findElement(By.xpath("//h3"));
        System.out.println("the text is "+text.getText());

        //get the text
        driver.switchTo().frame("iframe_a");

       WebElement getLable =driver.findElement(By.xpath("//label"));
        System.out.println("the label is : "+getLable.getText());

        //switch focus to the main page
        driver.switchTo().defaultContent();
       //3 Method switch to an iframe using WebElement
        //clear what ever is written in the text box
       WebElement frame1 =driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
       driver.switchTo().frame(frame1);
       textBox.clear();


    }
}
