package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5amazonSignin {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Hello")).click();  
		driver.findElement(By.id("ap_email")).sendKeys("7209744026");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
