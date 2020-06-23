package instPages;

import link.Links;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverPage {

    protected static WebDriver driver;

    static {
        System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to(Links.LINK);
    }
    public DriverPage() {
        PageFactory.initElements(driver, this);
    }

}

