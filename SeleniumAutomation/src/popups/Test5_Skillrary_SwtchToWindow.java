package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5_Skillrary_SwtchToWindow {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//	String parent=driver.getWindowHandle();
		driver.findElement(By.linkText("X")).click();
		driver.findElement(By.xpath("(//a[text()=' GEARS '])")).click();
		driver.findElement(By.xpath("(//a[text()=' SkillRary Essay'])[2]")).click();
		
		//switching the control
		Set<String> child= driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
			
		}
		driver.findElement(By.id("mytext")).sendKeys("Ravi");
	}

}
