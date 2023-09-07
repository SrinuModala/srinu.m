package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notificationpopup {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable -notifications");
		c.addArguments("start-maximized");
		WebDriver driver=new ChromeDriver(c);
		Thread.sleep(3000);
		driver.get("https://www.hdfc.com");

	}

}
