package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7_fb_create_FemaleButton_isSelectedorNot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/");

		WebElement ele = driver.findElement(By.linkText("Create New Account"));
		ele.click();
		WebElement femaleChekbox = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
		// femaleChekbox.click();
		if (femaleChekbox.isSelected()) {
			System.out.println("Passed : it is Selected");
		} else {
			System.out.println("Fail :");
			//femaleChekbox.click();

		}
		Thread.sleep(3000);
		driver.close();

	}

}
