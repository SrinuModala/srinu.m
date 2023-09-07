package testing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollbyExample3 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.cricbuzz.com");
JavascriptExecutor kkk=(JavascriptExecutor)driver;
kkk.executeScript("window.scrollBy(0,4000);");
Thread.sleep(3000);
kkk.executeScript("window.scrollBy(0,-2000);");
	}

}
