package seleniumjava1;

import java.util.*;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;   
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class leaf {
	
	public static void main(String args[]){
        WebDriver driver = new EdgeDriver();
		
		driver.get("https://leafground.com/window.xhtml");
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		driver.findElement(By.xpath("//span[normalize-space()='Open']")).click();
		driver.findElement(By.xpath("//span[normalize-space()='Close Windows']")).click();
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows.size());
		
		Set<String> title = driver.getWindowHandles();
		
       
        for(String X : windows ) {
    	    driver.switchTo().window(X);
			String S = driver.getTitle();				
			System.out.println(S);  
		}
		
	       for(String X : title ) {
		    System.out.println(X);
		}
		
	   
	      for(String X : windows ) {
		    if(!parentWindow.equals(X)) {
			    driver.switchTo().window(X);
			    driver.close();
		    }
	    }	
	}
}
