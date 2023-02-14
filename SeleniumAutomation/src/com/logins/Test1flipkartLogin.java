package com.logins;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1flipkartLogin {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();

		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		// enter the URL
		driver.get("https://www.flipkart.com/");
		// enter user name
		// driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("username");
		// enter password
		driver.findElement(By.xpath("(//input[@type='password'])")).sendKeys("password");
		// click on login
		driver.findElement(By.xpath("(//span[text()='Login'])[2]")).click();

		// ge4t url
		String act_Tilte = driver.getTitle();  //returns the title of the page
		System.out.println(act_Tilte);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		// verification
		if (act_Tilte.contains("Online Shopping Site for Mobiles,")) {
			System.out.println("Verification Pass");
		} else {
			System.out.println("Fail");
		}
		driver.close();

	}

}
