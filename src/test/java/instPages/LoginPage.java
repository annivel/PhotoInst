package instPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends DriverPage {
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;

	@FindBy(xpath="//input[@name='password']")
	private WebElement password;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;

	public void typeUsername (String login){
	    username.sendKeys(login);
    }

    public void typePassword (String pass){
	    password.sendKeys(pass);
    }

    public void clickEnter (){
	    submit.click();
    }





}
