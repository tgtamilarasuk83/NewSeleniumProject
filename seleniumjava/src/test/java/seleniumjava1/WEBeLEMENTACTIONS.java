package seleniumjava1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class WEBeLEMENTACTIONS {
	
	public static void main(String args[]) {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		Actions act = new Actions(driver);
		
		WebElement compedium = driver.findElement(By.linkText("compendiumdev"));
		
		act.keyDown(Keys.CONTROL)
		   .click(compedium)
		   .keyUp(Keys.CONTROL)
		   .build()
		   .perform();
	}
}
