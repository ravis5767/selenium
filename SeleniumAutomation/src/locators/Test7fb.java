package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7fb {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("72097426");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("I don't know,,..!!");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("login")).click();
		
	}

}