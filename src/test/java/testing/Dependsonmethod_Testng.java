package testing;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Dependsonmethod_Testng {
	@Test
	public void login() {
		Reporter.log("i am login",true);
		Assert.fail();
	}
	@Test(dependsOnMethods = {"login"})
	
	
	public void logout() {
		Reporter.log("i am logout");
	}

}
