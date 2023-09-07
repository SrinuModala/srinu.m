package testing;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class GoogleScreenshotExample {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
Thread.sleep(3000);
TakesScreenshot gg=(TakesScreenshot)driver;
File src=gg.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\HP\\Desktop\\google\\google.png");
Thread.sleep(3000);
Files.copy(src, dest);

	}

}
