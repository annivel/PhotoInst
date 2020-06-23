package tools;

import instPages.DriverPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends DriverPage {
    @FindBy(xpath = "//input[@placeholder='Search']")
    private WebElement searchField;

    @FindBy(xpath = "//span[contains(text(),'Valentyn Kvasov')]")
    private WebElement account;

    public void search(String text) {
        searchField.sendKeys(text);
    }

    public void findAccount() {
        account.click();

    }
}
