package screenschot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0_TakingScreenShot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		// step1 Type casting
		TakesScreenshot ts = (TakesScreenshot) driver;

		// step2 access the method and photo will be stored in the RAM
		File ram = ts.getScreenshotAs(OutputType.FILE);

		// Step3 Specify the location photo should be stored
		File destination = new File("./photo/apacheCOmmon.png");

		// Step4 Copy and paste from ram to specific location
		FileUtils.copyFile(ram, destination);
		driver.close();
	}

}
