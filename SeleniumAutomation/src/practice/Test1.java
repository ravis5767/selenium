package practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://automationpractice.com/index.php");
		
	    System.out.println(driver.getCurrentUrl());
	    Thread.sleep(3000);
	    System.out.println(driver.getTitle());
	   // System.out.println(driver.getPageSource());
	    driver.navigate().to("https://www.facebook.com/");
	    System.out.println(driver.getTitle());
	    driver.navigate().refresh();
	    driver.navigate().back();
	    driver.navigate().back();
	    Thread.sleep(3000);
	    System.out.println(driver.getCurrentUrl());
	    driver.close();
	}

}
