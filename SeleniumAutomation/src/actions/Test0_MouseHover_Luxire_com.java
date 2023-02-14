package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0_MouseHover_Luxire_com {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://luxire.com/ ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement ele = driver.findElement(By.xpath("//button[@class='drawerbtn']"));
		Actions hover = new Actions(driver);
		Thread.sleep(3000); // not required
		hover.moveToElement(ele).perform();
		Thread.sleep(3000); // not required
		driver.findElement(By.linkText("Jeans")).click();

		driver.close();

	}

}
