package test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Test
public class MainSteps {
    final static String LOGIN = "+380675977021";
    final static String PASSWORD = "annivelichko20";
    final static String ACCOUNT = "Valentyn Kvasov";
    private static int ID = 0;
    WebDriver driver;

    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.instagram.com/");

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(LOGIN);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(PASSWORD);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(ACCOUNT);
        driver.findElement(By.xpath("//span[contains(text(),'Valentyn Kvasov')]")).click();
        String sumOfPosts = driver.findElement(By.xpath("//li[contains(*,'posts')]")).getText();
        System.out.println(sumOfPosts);

        scroll();
        searchAndSave();
    }

    public void searchAndSave() {
        Set<WebElement> photos = new HashSet<>();
        driver.findElements(By.xpath("//img[@class='FFVAD']"))
                .forEach(element -> savePhoto(element.getAttribute("src")));
    }

    private void savePhoto(String urlPhoto) {
        InputStream inputStream = null;
        try {
            inputStream = new URL(urlPhoto).openStream();
            Files.copy(inputStream, Paths.get("img" + ID + ".png"), StandardCopyOption.REPLACE_EXISTING);
            ID++;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void scroll() {
        try {
            Object lastHeight = ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
            while (true) {
                ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
                Thread.sleep(2000);
                Object newHeight = ((JavascriptExecutor) driver).executeScript("return document.body.scrollHeight");
                if (newHeight.equals(lastHeight)) {
                    break;
                }
                lastHeight = newHeight;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

  /*      List<WebElement> photo = driver.findElements(By.xpath("//img[@class='FFVAD']"));
        for (WebElement element : photo) {
            savePhoto(element.getAttribute("src"));
        }*/

/*
         private void getPhotosOut() {
         posts = setPosts();
       Map<WebElement, String> photo = new LinkedHashMap<>();
    while (photo.size() < posts) {
    driver.findElements(By.xpath("//img[@class='FFVAD']"));
    for (WebElement element : photo) {
    savePhoto(element.getAttribute("src"));
            }
        }
*/



/*    private void scrollDown() {
        WebElement element = driver.findElement(By.xpath("(//*[@class='FFVAD'])[last()]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
    */


