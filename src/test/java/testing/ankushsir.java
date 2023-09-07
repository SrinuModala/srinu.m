package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ankushsir {
	public static void main(String args[]) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://www.instagram.com");
		Thread.sleep(1000);
		driver.navigate().to("http://www.tsicet.com");
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
	}
}