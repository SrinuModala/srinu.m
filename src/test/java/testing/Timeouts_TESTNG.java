package testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Timeouts_TESTNG {
	@Test(timeOut = 4000)
	public void login() {
		Reporter.log("i am login",true);
	}

}
