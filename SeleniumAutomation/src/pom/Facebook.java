package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {
	@FindBy(id = "email")
	private WebElement usernametb;

	@FindBy(id = "pass")
	private WebElement passwordtb;

	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement loginbtn;

	public Facebook(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void username(String name) {
		usernametb.sendKeys(name);
	}

	public void password(String pwd) {
		passwordtb.sendKeys(pwd);
	}

	public void loginButton() {
		loginbtn.click();
	}

}
