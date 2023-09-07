package testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotExample5 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.actitime.com");
Robot c=new Robot();
c.keyPress(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(3000);
c.keyPress(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(3000);
c.keyPress(KeyEvent.VK_PAGE_UP);
Thread.sleep(3000);
c.keyRelease(KeyEvent.VK_PAGE_UP);
	}

}
