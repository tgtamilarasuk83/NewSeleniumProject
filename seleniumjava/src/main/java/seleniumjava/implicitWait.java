package seleniumjava;

import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class implicitWait {
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://omayo.blogspot.com/");
		
		
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		
		
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
	}
}
