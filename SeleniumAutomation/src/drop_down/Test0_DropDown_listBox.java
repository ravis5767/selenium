package drop_down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test0_DropDown_listBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();

		WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));

		Select s = new Select(dropDown);
		Thread.sleep(1000);
		s.selectByIndex(3); // baby
		Thread.sleep(1000);
		s.selectByValue("search-alias=automotive-intl-ship");
		Thread.sleep(1000);
		s.selectByVisibleText("Books");
		List<WebElement> all_OPtions = s.getOptions();
		System.out.println(all_OPtions.size());
		Thread.sleep(1000);
		for (WebElement b : all_OPtions) {
			System.out.println(b.getText());
		}
		Thread.sleep(2000);
		driver.close();
	}

}
