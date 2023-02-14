package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0_FramesSwitching_Snapdeal {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement ele = driver.findElement(By.xpath("//span[text()='Sign In']"));
		// mouse hovering to element
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();

		driver.findElement(By.xpath("//a[text()='login']")).click();
		// switching the frame
		driver.switchTo().frame(0);
		driver.findElement(By.id("userName")).sendKeys("98745631");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//i[contains(@class,'sd-icon sd-icon-delete-sign fn')]")).click();

		// switching back to default frame
		driver.switchTo().defaultContent();
		driver.findElement(By.id("inputValEnter")).sendKeys("Phone");

	}
}
