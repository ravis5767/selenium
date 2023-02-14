package data_Driven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0_Datadriver_From_PropetyFile {
	public static void main(String[] args) throws IOException {
		// object for properties class
		Properties pdata = new Properties();
		// path of .properties file
		FileInputStream datafile = new FileInputStream("./data.properties");
		// loading the properties file
		pdata.load(datafile);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("email")).sendKeys(pdata.getProperty("email"));
		driver.findElement(By.id("pass")).sendKeys(pdata.getProperty("password"));

	}

}
