package webelements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5_IsEnabledScenarioFbButton {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/");

		WebElement ele = driver.findElement(By.linkText("Create New Account"));
		ele.click();

		WebElement button = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
		if (button.isEnabled()) {
			System.out.println("Button is enabled");
		} else {
			System.out.println("Button is not enabled");
		}
		driver.close();

	}

}
