import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class RegisterSuccessfully {
    protected static WebDriver driver;

    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");

        //Open the browser
        driver = new ChromeDriver();

        //maximise the browser window screen.
        driver.manage().window().fullscreen();

        //set implicitly for drover object.
        driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);

        //Open the website
        driver.get("https://demo.nopcommerce.com/");

        //click on register button
        driver.findElement(By.xpath("//a[@class='ico-register']")).click();

        //Enter First Name
        driver.findElement(By.id("FirstName")).sendKeys("seema");

        //Enter LastName
        driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("tanna");

        //Enter Email
        driver.findElement(By.name("Email")).sendKeys("seemasoftware19@gmail.com");

        //Enter password
        driver.findElement(By.name("Password")).sendKeys("abc123");

        //Enter Confirm password
        driver.findElement(By.name("ConfirmPassword")).sendKeys("abc123");

        //Click on register button
        driver.findElement(By.xpath("//input[@value=\"Register\"]")).click();

    }

}
