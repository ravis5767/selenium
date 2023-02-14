package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryLoginPage;
import pomPages.SkillraryTesting;

public class TestCase2 extends BaseClass {
	@Test
	public void tC2() {
		SkillraryLoginPage s = new SkillraryLoginPage(driver); // object for home page
		s.popupCookie(); // closing cookie pop up
		s.gearsButton(); // clicking on gears
		s.skillraryDemoApp(); // from drop-down selecting/ clicking on demo app
		
		
		
		SkillraryTesting st=new SkillraryTesting(driver);
		driverutilities.switchTabs(driver);
		driverutilities.dropDown(st.getDropdown() );
		

}
}
