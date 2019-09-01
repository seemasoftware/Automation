import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SendEmail {
    protected static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
        //Open Website
        driver.get("https://demo.nopcommerce.com/");
        //click on login button
        driver.findElement(By.xpath("//a[@class=\"ico-login\"]")).click();
        //Enter Email address
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("testtest1@test.com");
        //Enter Password
        driver.findElement(By.xpath("//input[@class='password']")).sendKeys("abcd1234");
        //Click on Login
        driver.findElement(By.xpath("//input[@class=\'button-1 login-button\']")).click();
        //Click on Mac Product
        driver.findElement(By.xpath("//h2//a[@href=\"/apple-macbook-pro-13-inch\"]")).click();
        //Send Email to friend
        driver.findElement(By.xpath("//input[@value='Email a friend']")).click();
        //Enter friend's email Address
        driver.findElement(By.xpath("//input[@class='friend-email']")).sendKeys("seemasoftware19@gmail.com");
        //Enter Your Email
        driver.findElement(By.xpath("//input[@id='YourEmailAddress']")).click();
        //Enter your message
        driver.findElement(By.id("PersonalMessage")).sendKeys("please check this out");
        // click on send email button
        driver.findElement(By.xpath("//input[@class=\"button-1 send-email-a-friend-button\"]")).click();
    }
}