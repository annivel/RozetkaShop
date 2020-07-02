package tools;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class DriverPage {
    public static WebDriver driver;
    public static  WebDriverWait wait;

    static {
        System.setProperty("webdriver.chrome.driver", "C:\\projects\\DownloadImage\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.navigate().to("https://rozetka.com.ua/");
       wait= new WebDriverWait(driver,15);
    }

 /*   @BeforeClass
    public void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://rozetka.com.ua/");
    }


  */

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

    public DriverPage() {
        PageFactory.initElements(driver, this);
    }

}
