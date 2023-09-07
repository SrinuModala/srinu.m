package testing;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartScreenshotEXAMPLE {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://wwww.flipkart.com");
 TakesScreenshot op=(TakesScreenshot)driver;
 File src=op.getScreenshotAs(OutputType.FILE);
 File dest=new File("C:\\Users\\HP\\Desktop\\desktop\\examples\flipkart.png");
 
	}

}
