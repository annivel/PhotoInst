package tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.HashSet;
import java.util.Set;

public class Download extends SaveStep{
    public void searchAndSave() {
        Set<WebElement> photos = new HashSet<>();
        driver.findElements(By.xpath("//img[@class='FFVAD']"))
                .forEach(element -> savePhoto(element.getAttribute("src")));
    }
}
