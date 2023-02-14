package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class T0FacebookLogIn {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/"); // enter the url
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // impilicitly wait statement.
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.findElement(By.id("email")).sendKeys("username"); // enter username
		driver.findElement(By.id("pass")).sendKeys("password"); // enter the password
		driver.findElement(By.name("login")).click(); // click on login button
		driver.findElement(By.xpath("(//div[contains(@class,'qmqpeqxj ')])[4]")).click();
		driver.findElement(By.xpath("//span[text()='Log Out']")).click();
		String act_title = driver.getTitle(); // get title of the application.
		System.out.println(act_title);

		String url = driver.getCurrentUrl(); // get url of the application.
		System.out.println(url);

		String exp_title = "Facebook";
		w.until(ExpectedConditions.titleContains("Facebook"));

		if (exp_title.contains(act_title) == true) // verifying the application page titles
		{
			System.out.println("test is passed");
		} else {
			System.out.println("test failed");
		}

	}

}
