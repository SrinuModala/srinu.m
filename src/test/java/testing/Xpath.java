package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("manager");
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	driver.manage().window().maximize();
	}
	

}
