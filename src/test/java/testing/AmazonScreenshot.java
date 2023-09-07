package testing;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class AmazonScreenshot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		TakesScreenshot am=(TakesScreenshot)driver;
		File src=am.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\HP\\Desktop\\examples\\amazon.png");
		Thread.sleep(3000);
		Files.copy(src, dest);

	}

}
