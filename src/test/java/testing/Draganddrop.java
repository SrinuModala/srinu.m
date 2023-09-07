package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

class Draganddrop{
public static void main(String[] args) throws Throwable {
	WebDriver driver=new EdgeDriver();
	driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
WebElement images=driver.findElement(By.xpath("//div[@id='draggable']"));
Thread.sleep(3000);
WebElement images2=driver.findElement(By.xpath("//div[@id='droppable']"));
Thread.sleep(3000);
Actions act=new Actions(driver);
act.dragAndDrop(images, images2).perform(); 
	
}
}