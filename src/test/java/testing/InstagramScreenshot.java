package testing;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class InstagramScreenshot {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.instagram.com");
Thread.sleep(4000);
TakesScreenshot in=(TakesScreenshot)driver;
File src=in.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\HP\\Desktop\\instagram\\instagram.jpg");
Files.copy(src, dest);
	}

}
