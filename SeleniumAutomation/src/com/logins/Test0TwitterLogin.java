package com.logins;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0TwitterLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// enter the URL
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://twitter.com/i/flow/login");
	//	 Thread.sleep(5000);
		// entering username
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("user");
		// clicking on next
	//	Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		// entering the password
	//	Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("user007");

		// click login
	//	Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		System.out.println(driver.getTitle());

	}

}
