package seleniumjava;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
public class Seleniumtool {
	public static void main(String args[]) {
		//input[@id='']
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        
	      
	        
	        WebElement timer2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("reveal")));
	        timer2.click();
		
	        WebElement timer3 = wait.until(ExpectedConditions.visibilityOf((WebElement) By.id("reveal")));
	}

}
