package drop_down;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1_skillrary_SelectAndDeselect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement drop_down = driver.findElement(By.id("cars"));
		Select s = new Select(drop_down);
		s.selectByIndex(2);
		s.selectByValue("299");
		// s.selectByVisibleText("More Than INR 500 ( 55 ) ");

		/*
		Thread.sleep(2000);
		 s.deselectByIndex(2);
		 Thread.sleep(2000);
		 s.deselectByValue("299");
		// Thread.sleep(2000);
		// s.deselectByVisibleText("More Than INR 500 ( 55 ) ");
		 */

		System.out.println(s.isMultiple());
		Thread.sleep(3000);
		if (s.isMultiple()) {
			s.deselectAll();
		} else {
			System.out.println("it is not multi select drop down");
		}
		driver.close();
	}

}
