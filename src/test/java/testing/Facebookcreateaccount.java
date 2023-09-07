package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookcreateaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com");
 driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
 driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("modala");
 driver.findElement(By.xpath("//input[contains(@text(),'inputtext _58mg _5dba _2ph-')]")).sendKeys("modala");
	}
}
//input[@type='text']