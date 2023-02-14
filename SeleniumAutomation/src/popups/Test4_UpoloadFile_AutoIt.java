package popups;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4_UpoloadFile_AutoIt {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));

		 WebElement uploadsec = driver.findElement(By.xpath("//button[text()='Upload Resume']"));
		 uploadsec.click();
		 Runtime.getRuntime().exec("E:\\AutoIT\\naukriTest1.exe");
		
		
		  Point p=uploadsec.getLocation(); 
		  int x= p.getX(); 
		  int y=p.getY();
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  
		  // giving the coordinates to scroll the window to the desired element
		  js.executeScript("window.scrollBy(" + x + "," + y + ")");
		//  Thread.sleep(2000);
		  //js.executeScript("arguments[0].click();", uploadsec);
		  
		 
	}

}
