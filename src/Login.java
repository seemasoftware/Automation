import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {
    protected static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver.exe");
        //Enter the browser
        driver = new ChromeDriver();
        //Maximise the browser window screen
        driver.manage().window().fullscreen();
        //set implicitly wait for driver driver object
        driver.manage().timeouts().implicitlyWait(59, TimeUnit.SECONDS);
        //Open the website
        driver.get("https://opensource-demo.orangehrmlive.com/");
        //Enter Username
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        //Enter Password
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
        //Click on login
        driver.findElement(By.id("btnLogin")).click();
        //Click on Admin
        driver.findElement(By.xpath("//a[@class='panelTrigger']")).click();
        //Click on logout
        driver.findElement(By.xpath("//a[@href=\"/index.php/auth/logout\"]")).click();
    }
}
