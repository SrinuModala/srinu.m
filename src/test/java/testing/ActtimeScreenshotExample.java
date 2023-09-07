package testing;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ActtimeScreenshotExample {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/login.do");
Thread.sleep(3000);
TakesScreenshot at=(TakesScreenshot)driver;
File src=at.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\HP\\Desktop\\acttime\\acttime.png");
Thread.sleep(3000);
Files.copy(src, dest);
	}

}
