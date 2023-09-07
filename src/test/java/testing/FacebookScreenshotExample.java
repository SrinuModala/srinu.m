package testing;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class FacebookScreenshotExample {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(3000);
		TakesScreenshot fb=(TakesScreenshot)driver;
		File src=fb.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\HP\\Desktop\\facebook\\facebook.jpg");
		Files.copy(src, dest);

	}

}
