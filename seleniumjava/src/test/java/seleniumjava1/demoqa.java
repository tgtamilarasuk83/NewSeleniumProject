package seleniumjava1;

import java.util.*;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class demoqa {
	public static void main(String args[]) {
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		String parentWindow = driver.getWindowHandle();
		
		System.out.println(parentWindow);
		Set<String> windows = driver.getWindowHandles();
		
		driver.findElement(By.xpath("//button[@id='tabButton']")).click();
		
		String Child = driver.getWindowHandle();

		 windows = driver.getWindowHandles();
		
		System.out.println(windows);
		
		System.out.println(windows.size());
		
		 windows = driver.getWindowHandles();
		 
		 
		 driver.switchTo().window(parentWindow);
		 driver.close( );
		 
	
	}

}
