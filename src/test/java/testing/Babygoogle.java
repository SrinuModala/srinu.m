package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Babygoogle {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.findElement(By.xpath("//textarea[@jsname='yZiJbe']")).sendKeys("telugu baby movie");
Thread.sleep(3000);
//driver.findElement(By.xpath("//input[@value='Google Search']")).click();
driver.findElement(By.xpath("(//span[@class='REySof'])[5]")).click();
JavascriptExecutor jse=(JavascriptExecutor)driver;
jse.executeScript("window.scrollBy(0,2000)");
}

}
