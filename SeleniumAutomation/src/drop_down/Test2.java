package drop_down;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement drop_down = driver.findElement(By.id("cars"));
		Select s = new Select(drop_down);
		s.selectByIndex(2);
		s.selectByValue("299");
		
		List<WebElement> options = s.getAllSelectedOptions();
		System.out.println(options.size());
		System.out.println(s.getOptions());
		System.out.println(s.getFirstSelectedOption());
		
		for(WebElement a:options)
		{
			System.out.println(a.getText());
		}
		s.deselectAll();
		
		driver.close();

	}

}
