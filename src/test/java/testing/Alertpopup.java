package testing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stubb
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert alt=driver.switchTo().alert();
		String att=alt.getText();
		System.out.println(att);
	

	}

}
