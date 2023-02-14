package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test5_DataProvider {
	@DataProvider
	public Object getData() {
		Object[][] obj = new Object[3][2];
		obj[0][0] = "1225495";
		obj[0][1] = "qwerty";

		obj[1][0] = "qewwdd";
		obj[1][1] = "123654789";

		obj[2][0] = "admin";
		obj[2][1] = "manager";
		return obj;
	}

	@Test(dataProvider = "getData")
	public void tcl(String username, String password) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);

		Thread.sleep(1000);
		driver.close();
	}

}
