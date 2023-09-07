package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.linkText("gmail")).click();
		driver.findElement(By.partialLinkText("Images")).click();
	//	driver.sendKeys("alluarjun");

	}

}