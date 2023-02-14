package scroll_bar;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0_Scroll_bar {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jssc.nic.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//type casting  
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//scrolling down
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(2000);
		//scroll up
		js.executeScript("window.scrollBy(0,-900)");

	}

}
