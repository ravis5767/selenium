package navigationApi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		// NAVIGATE
		Thread.sleep(2000);
		driver.navigate().to("https://en-gb.facebook.com/");
		
		//back
		Thread.sleep(3000);
		driver.navigate().back();
		
		//forward
		Thread.sleep(3000);
		driver.navigate().forward();
		
		//refresh
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		driver.close();
		
		}

}
