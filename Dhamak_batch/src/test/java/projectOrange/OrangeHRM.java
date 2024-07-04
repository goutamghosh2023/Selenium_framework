package projectOrange;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrangeHRM extends Base_class {
	@Test
	 public void hrm() throws InterruptedException
	 {     
		
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			Pom p = new Pom(driver);
			p.username().sendKeys("Admin");
			p.pass().sendKeys("admin123");
			p.submit().click();	
			String actual = driver.getTitle();
			String title = "OrangeHRM";
			//String title2 = "google";
			Assert.assertEquals(actual, title,"checking testcase is matched");
			Thread.sleep(2000);
			//Assert.assertEquals(actual,title2,"checking testcase is fail");
			p.PimModule().click();
			Thread.sleep(2000);
			p.Addemployee().click();
			Thread.sleep(2000);
			p.Firstname().sendKeys(UserData.ddt("OrangeHrm", 0, 1));
			Thread.sleep(2000);
			p.Lastemployee().sendKeys(UserData.ddt("OrangeHrm", 0, 2));
			Thread.sleep(2000);
			p.Submit().click();
			Thread.sleep(2000);
			boolean dis = p.alert().isDisplayed();
			Thread.sleep(2000);
			Assert.assertTrue(dis);
			Thread.sleep(2000);
			System.out.println("Employee has been successfully added");
			
			
	 }

}
