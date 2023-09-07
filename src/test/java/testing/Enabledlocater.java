package testing;

import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.agent.builder.AgentBuilder.Default.WarmupStrategy.Enabled;

public class Enabledlocater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement tn=driver.findElement(By.xpath("//button[@name='login']"));
		if(button.is Enabled()) {
			System.out.println("element is enabled");
		}
		else
		{
			System.out.println("element is disabled");
		}
	}

}
