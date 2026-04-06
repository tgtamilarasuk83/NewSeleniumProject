package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Seleniumtest {

	public static void main(String args[]) throws InterruptedException {
		//navigate 
		
		WebDriver drriver = new EdgeDriver();
		drriver.navigate().to("https://www.google.com/?authuser=0");
		Thread.sleep(5000);
		// nanigation
		drriver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(5000);
		
		drriver.findElements(By.)
		
		
		
		drriver.navigate().back();
		Thread.sleep(5000);
		
		
		// forward
		drriver.navigate().forward()	;
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		drriver.navigate().refresh();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		drriver.close();
		
	}
}
