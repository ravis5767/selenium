package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test0_Drag_And_Drop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement block1 = driver.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement block2= driver.findElement(By.xpath("//h1[text()='Block 3']"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(block1, block2).perform();
	}

}
