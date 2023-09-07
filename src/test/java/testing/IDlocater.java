package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 class IDlocater {

	public static void main(String[] args) throws Throwable {
		
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.amazon.in");
				Thread.sleep(1000);
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("infinix gt10 pro mobile");
				Thread.sleep(1000);
				driver.findElement(By.id("nav-search-submit-button")).click();

	}

}
