package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6_isDisplayed_SkillarySearchBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement search_box= driver.findElement(By.name("q"));
		if(search_box.isDisplayed())
		{
			System.out.println("Pass : element is displayed");
			search_box.sendKeys("books");
		}
		else
		{
			System.out.println("Failed");
		}
		
		Thread.sleep(3000);
		driver.close();
	}

}
