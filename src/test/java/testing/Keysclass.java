package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keysclass {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);

	}

}
