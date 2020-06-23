package tools;

import instPages.DriverPage;
import org.openqa.selenium.JavascriptExecutor;

public class Scroll extends DriverPage {
    private void scroll() {
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
