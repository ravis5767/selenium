package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test0 {
	@Test
	public void demo()
	{
		Reporter.log("Hello selenium", true);
		Reporter.log("hello java", false);
	}

}
