package seleniumjava;
import java.sql.Driver;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
public class Seleniumtools {
	
	public static void main(String args[]) {
		//input[@id='adder'])[1]
		
		WebDriver driver =  new EdgeDriver();
		driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
		
		driver.findElement(By.xpath("(//input[@id='adder'])[1]")).click();
		
		//div[@id='box0'])[1]
				
		driver.findElement(By.xpath("(//input[@id='adder'])[1]")).click();
	}

}
