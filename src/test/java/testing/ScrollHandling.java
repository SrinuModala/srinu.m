package testing;

import java.sql.Driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollHandling {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		Thread.sleep(4000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,3000);");
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,-2000);");
		

	}

}
