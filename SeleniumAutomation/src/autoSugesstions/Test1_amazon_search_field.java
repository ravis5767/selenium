package autoSugesstions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_amazon_search_field {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.com/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("phone");

		Thread.sleep(3000);
		List<WebElement> a = driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		System.out.println(a.size());

		for (WebElement b : a) {
			System.out.println(b.getText());
		}
		driver.close();
	}

}
