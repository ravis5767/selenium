package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	// Declaration
	@FindBy(xpath = "//a[@class='close_cookies']")
	private WebElement cookies; 

	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsbutton;

	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;

	// initialisation
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilisation
	public void popupCookie() {
		cookies.click();
	}

	public void gearsButton() {
		gearsbutton.click();
	}

	public void skillraryDemoApp() {
		demoapp.click();
	}

}
