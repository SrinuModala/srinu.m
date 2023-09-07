package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframe {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
driver.switchTo().frame(0);
String srinu=driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
	System.out.println(srinu);
	driver.switchTo().defaultContent();
	driver.switchTo().frame(1);
	Thread.sleep(3000);
	String srinutwo=driver.findElement(By.xpath("//a[text()='AbstractHttpCommandCodec.CommandSpec']")).getText();
	Thread.sleep(3000);
	System.out.println(srinutwo);
	driver.switchTo().defaultContent();
	driver.switchTo().frame(2);
	String srinuthree=driver.findElement(By.xpath("//a[text()='org.openqa.selenium.bidi.log']")).getText();
	System.out.println(srinuthree);
	}

}
