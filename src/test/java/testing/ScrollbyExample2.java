package testing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollbyExample2 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.meesho.com");
	JavascriptExecutor srinu=(JavascriptExecutor)driver;
	srinu.executeScript("window.scrollBy(0,4000);");
	Thread.sleep(3000);
	srinu.executeScript("window.scrollBy(0,-3000);");
	}
	

}
