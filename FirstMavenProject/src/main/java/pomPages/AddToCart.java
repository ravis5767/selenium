package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart {
	@FindBy(id = "add")
	public WebElement addBtn;

	@FindBy(xpath = "//button[text()=' Add to Cart']")
	public WebElement addToCartBtn;

	public AddToCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddBtn() {
		return addBtn;
	}

	public void addToCartButton() {
		addToCartBtn.click();

	}

}
