package testing;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quitmethod {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com");
	Point d=new Point(280, 320);
	driver.manage().window().setPosition(d);
	System.out.println(d);
	}

}
