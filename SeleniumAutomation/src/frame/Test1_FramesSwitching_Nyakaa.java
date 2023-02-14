package frame;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_FramesSwitching_Nyakaa {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// enter product name in search tab
		driver.findElement(By.name("search-suggestions-nykaa")).sendKeys("masks");
		// click on search
		Thread.sleep(2000);
		driver.findElement(By.name("search-suggestions-nykaa")).submit();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Nykaa Clay It Cool Clay Mask']")).click();
		// switching the window to new child window
		Set<String> child = driver.getWindowHandles();
		for (String b : child) {
			driver.switchTo().window(b);

		}
		// adding product to bag
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		// click on bag
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();

		// switching control to bag frame
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		// clicking on delete icon
		driver.findElement(By.xpath("//i[@class='remove-product']")).click();

		System.out.println("Test passed");

	}

}
