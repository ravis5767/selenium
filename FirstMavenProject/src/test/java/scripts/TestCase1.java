package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddToCart;
import pomPages.SkillraryDemoLogin;
import pomPages.SkillraryLoginPage;

public class TestCase1 extends BaseClass {
	@Test
	public void tC1() {
		SkillraryLoginPage s = new SkillraryLoginPage(driver); // object for home page
		s.popupCookie(); // closing cookie pop up
		s.gearsButton(); // clicking on gears
		s.skillraryDemoApp(); // from drop-down selecting/ clicking on demo app

		SkillraryDemoLogin sd = new SkillraryDemoLogin(driver); // object of new page demo apps
		driverutilities.switchTabs(driver); // switching to new tab
		driverutilities.mouseHover(driver, sd.getCourseTab()); // mouse hover to course tab
		sd.selenium(); // click on selenium training

		AddToCart ad = new AddToCart(driver); // object of new page
		driverutilities.doubleClick(driver, ad.getAddBtn()); // double clicking on + button
		ad.addToCartButton(); // click on add to cart button
		driverutilities.alertPopUpAccept(driver); // alert pop up accept.
	}

}
