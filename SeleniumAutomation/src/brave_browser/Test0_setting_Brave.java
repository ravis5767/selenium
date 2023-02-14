package brave_browser;
// automating brave browser with selenium.
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test0_setting_Brave {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions browser = new ChromeOptions();
		//setting the path for brave .exe complete path to be pasted
		browser.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		WebDriver driver = new ChromeDriver(browser);
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/");

		WebElement ele = driver.findElement(By.linkText("Create New Account"));
		ele.click();
		WebElement femaleChekbox = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
		femaleChekbox.click();
		if (femaleChekbox.isSelected()) {
			System.out.println("Passed : it is Selected");
		} else {
			System.out.println("Fail : it was not selected");
			femaleChekbox.click();

		}
		Thread.sleep(3000);
		driver.close();
	}

}
