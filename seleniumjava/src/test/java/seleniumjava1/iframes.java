package seleniumjava1;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class iframes {
	public static void main(String args[]) {
		 WebDriver driver = new EdgeDriver();
			
			driver.get("https://demoqa.com/frames");
			
			
			WebElement frame1 = driver.findElement(By.id("frame1"));
			driver.switchTo().frame(frame1);
			
			
		
	}

}
