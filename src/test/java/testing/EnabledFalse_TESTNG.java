package testing;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledFalse_TESTNG {
	@Test
	public void login() {
		Reporter.log("i am login",true);
		Assert.fail();
	}
	@Test(enabled=false)
	public void logout() {
		Reporter.log("i am logout",true);
	}

}
