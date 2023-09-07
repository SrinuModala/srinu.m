package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathbyContains {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("manager");
		driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();

	}

}
 // FORMULA:-//Tagname[contains(@AN='AV')]-----USING ATTRIBUTES
  //-- Using text>>> //Tagname[contains(text(),'text')]