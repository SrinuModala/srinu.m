package testing;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotclassBYScrollDown {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(5000);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(5000);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(5000);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
	}

}
