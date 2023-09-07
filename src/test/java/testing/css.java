package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class css {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.cssSelector("input[pacakage holder='username']")).sendKeys("admin");
	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manager");
	driver.findElement(By.id("loginButton")).click();
	}
}
