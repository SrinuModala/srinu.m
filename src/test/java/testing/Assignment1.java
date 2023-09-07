package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com");
		Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("srinu__333__");
	Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("8374116534_333");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[@aria-label='Try again']"));
driver.findElement(By.xpath("//div[@class='x9f619 xjbqb8w x78zum5 x168nmei x13lgxp2 x5pf9jr xo71vjh x1xmf6yo x1e56ztr x540dpk x1m39q7l x1n2onr6 x1plvlek xryxfnj x1c4vz4f x2lah0s xdt5ytf xqjyukv x1qjc9v5 x1oa3qoh x1nhvcw1']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//div[@role='button']")).click();
//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("prathapreddy8901@gmail.com");
driver.findElement(By.xpath("//button[@class='_a9-- _a9_1']")).click();
Thread.sleep(4000);

driver.findElement(By.xpath("(//span[@class='x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft'])[5]")).submit();
Thread.sleep(7000);
driver.findElement(By.xpath("//div[@class='x13v4lgv xmn1u35 x10l6tqk xn0lweg x1vjfegm']")).submit();
	}

}
//(//span[@class='x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft'])[5]