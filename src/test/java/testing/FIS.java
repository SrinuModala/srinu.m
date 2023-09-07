package testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FIS {

	public static void main(String[] args) throws Exception {
		FileInputStream jse=new FileInputStream("C:\\Users\\HP\\Documents\\fis.properties");
 Properties p=new Properties();
 p.load(jse);
 String s= p.getProperty("URL");
 System.out.println(s);
 
	}
	

}
