package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		 driver.get("https://www.facebook.com");
		 driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		 Thread.sleep(2000);
		
		 
		 driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("modhala");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("srinu");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("srinumodala22@gmail");
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("8374116534");
		 Thread.sleep(4000);
		 WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		 Thread.sleep(2000);
		 Select d=new Select(day);
		 d.selectByVisibleText("25");
		 WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		 Thread.sleep(2000);
		 Select m=new Select(month);
		 m.selectByVisibleText("Oct");
		 WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		 Thread.sleep(2000);
		 Select y=new Select(year);
		 y.selectByVisibleText("2000");
		 
	
		
	 WebElement Male=driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
			driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		Thread.sleep(3000);
		Select x=new Select(Male);
		Thread.sleep(2000);
		x.selectByVisibleText("Male");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			
     	
		
		
	}
	}



//div[text()='First name

