package seleniumjava;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

public class Linkedinlogin {
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.linkedin.com/login/");

		
		driver.findElement(By.cssSelector("input#username")).sendKeys("jeevapranesh.vrp@gmail.com");

		
		driver.findElement(By.cssSelector("input#password")).sendKeys("Jeeva@1101 	");

		
		driver.findElement(By.cssSelector("button[type='submit']")) .click();
		
		String S = driver.getTitle();
		String S1 = "https://www.linkedin.com/feed/";
		
		if(s.eq  )
		
	}
}
