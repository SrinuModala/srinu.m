package testing;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotExample3 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
Robot d=new Robot();
d.keyPress(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(3000);
d.keyRelease(KeyEvent.VK_PAGE_DOWN);
Thread.sleep(3000);
d.keyPress(KeyEvent.VK_PAGE_UP);
Thread.sleep(3000);
d.keyRelease(KeyEvent.VK_PAGE_UP);

	}

}
