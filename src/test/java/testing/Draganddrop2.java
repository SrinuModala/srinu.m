package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class Draganddrop{
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
WebElement image1=driver.findElement(By.xpath("//div[@id='droppable']"));

WebElement images2=driver.findElement(By.xpath("//div[@id='draggable']"));
Actions act=new Actions(driver);
act.dragAndDrop(image1, images2).perform(); 
	
}
}