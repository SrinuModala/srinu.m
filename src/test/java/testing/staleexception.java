package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class staleexception {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in");
		WebElement srinu=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Thread.sleep(3000);
		driver.navigate().refresh();
		srinu.sendKeys("mobiles");
		Thread.sleep(3000);
		WebElement srinu1=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		srinu1.click();

	}

}
