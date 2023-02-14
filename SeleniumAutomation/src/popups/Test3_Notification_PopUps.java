package popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test3_Notification_PopUps {

	public static void main(String[] args) {
		ChromeOptions browser = new ChromeOptions();
	//	browser.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
		browser.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(browser);
		driver.manage().window().maximize();
		driver.get("https://www.olx.in/");

	}

}
