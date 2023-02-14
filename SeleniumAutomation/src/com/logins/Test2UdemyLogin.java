package com.logins;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2UdemyLogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.udemy.com/join/login-popup/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	//	Thread.sleep(3000);

		driver.findElement(By.name("email")).sendKeys("admin@gmail.com");
		driver.findElement(By.name("password")).sendKeys("manager123");
		driver.findElement(By.id("submit-id-submit")).click();

		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		// verification
		if (actTitle.contains("Login")) {
			System.out.println("verication passed");
		} else {
			System.out.println("Failed");
		}
		driver.close();
		// driver.manage().window().minimize();

	}

}
