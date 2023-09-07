package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class one{
	public static void main(String args[]) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.findElement(By.id("twotabsearchtextbox ")).sendKeys("mobiles under 20000");
		driver.findElement(By.id("uttonnav-search-submit-b ")).click();

}
}
