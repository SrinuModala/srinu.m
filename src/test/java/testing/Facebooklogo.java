package testing;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Facebooklogo {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.instagram.com");
Thread.sleep(4000);
WebElement dd=driver.findElement(By.xpath("//i[@aria-label='Instagram']"));
Thread.sleep(4000);
File src=dd.getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\HP\\Desktop\\facebook\\instagramlogo.png");
Files.copy(src, dest);

	}

}
