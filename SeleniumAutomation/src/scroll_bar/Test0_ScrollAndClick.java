package scroll_bar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0_ScrollAndClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jssc.nic.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// find the element and storing
		WebElement ele = driver.findElement(By.linkText("Help"));

		// get location/coordinates
		Point location = ele.getLocation();
		int x = location.getX();
		int y = location.getY();

		// type casting now
		JavascriptExecutor js = (JavascriptExecutor) driver;

		// giving the coordinates to scroll the window to the desired element
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
		js.executeScript("arguments[0].click();", ele);

	}

}
