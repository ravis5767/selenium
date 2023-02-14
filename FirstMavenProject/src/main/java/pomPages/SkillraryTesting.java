package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryTesting {
	@FindBy(name="addresstype")
	private WebElement dropdown;
	
	
	public SkillraryTesting(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getDropdown() {
		return dropdown;
	}
	
	

}
