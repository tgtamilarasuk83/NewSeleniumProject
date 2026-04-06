package seleniumjava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Seleniumtest {

	public static void main(String args[]) {
		WebDriver drriver = new EdgeDriver();
		drriver.navigate().to("https://www.google.com/?authuser=0");
		drriver.findElement(By.xpath("//a[text()='Gmail']")).click();
		drriver.findElement(By.xpath("//span[text()='Sign in']")).click();
		drriver.findElement(By.xpath("//input[@type='email' ]")).click();
		drriver.findElement(By.xpath("//input[@type='email']"))
	       .sendKeys("tgtamilarasuk83@gmail.com");
				

	}
}
