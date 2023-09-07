package testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotExample4 {

	public static void main(String[] args) throws AWTException, Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
Robot a=new Robot();
driver.get("https://www.meesho.com");
a.keyPress(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(3000);
a.keyRelease(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(3000);
a.keyPress(KeyEvent.VK_PAGE_UP);
Thread.sleep(3000);
a.keyRelease(KeyEvent.VK_PAGE_UP);

	}

}
