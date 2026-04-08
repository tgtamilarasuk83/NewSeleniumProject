package seleniumjava1;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class draganddrop {
	
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/drag.xhtml;jsessionid=node0lhs2r0ftusfaa5bedck3payq14534181.node0");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		
		WebElement element1 = driver.findElement(By.xpath("//div[@id='form:drag_content']"));
		WebElement element2 = driver.findElement(By.xpath("//div[@id='form:drop_header']"));
		
		act.dragAndDrop(element1, element2).perform();
		
		
	}

}
