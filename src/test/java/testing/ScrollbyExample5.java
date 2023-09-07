package testing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollbyExample5 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.discovery.com");
JavascriptExecutor abc=(JavascriptExecutor)driver;
abc.executeScript("window.scrollBy(0,3000);");
Thread.sleep(3000);
abc.executeScript("window.scrollBy(0,-2000);");
	}

}
