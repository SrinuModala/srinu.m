package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ankush {

	public static void main(String[] args) throws Throwable{
		WebDriver driver=new EdgeDriver();
		driver.navigate().to("https://www.meesho.com");
		Thread.sleep(1000);
		driver.navigate().to("https://www.tsrtc.com");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
driver.navigate().to("https://www.instagram.com");
	}

}
