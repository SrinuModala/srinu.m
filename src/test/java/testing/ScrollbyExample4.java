package testing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollbyExample4 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.timesindia.in");
JavascriptExecutor aaa=(JavascriptExecutor)driver;
aaa.executeScript("window.scrollBy(0,4000);");
Thread.sleep(3000);
aaa.executeScript("window.scrollBy(0,-2000);");
	}

}
