package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2_MouseHover_Click {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://swayam.gov.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("closebtn")).click();

		driver.findElement(By.linkText("All Courses")).click();
		
		Thread.sleep(6000);
		driver.findElement(By.linkText("National Coordinators")).click();

		driver.findElement(By.xpath("//div[text()='UGC']")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Catalog')]")).click();
	}

}
