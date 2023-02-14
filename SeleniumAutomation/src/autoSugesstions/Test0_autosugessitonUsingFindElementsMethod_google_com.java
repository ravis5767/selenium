package autoSugesstions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0_autosugessitonUsingFindElementsMethod_google_com {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("seleni");

		Thread.sleep(3000);
		List<WebElement> ele = driver.findElements(By.xpath("//li[@class='sbct']"));
		System.out.println(ele.size());

		for (WebElement text : ele) {
			System.out.println(text.getText());
		}
		driver.close();
	}

}
