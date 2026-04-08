package seleniumjava1;


import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Actiondemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement blogmenu = driver.findElement(By.id("blogsmenu"));
		
		
		act.moveToElement(blogmenu).perform();
		
//		WebElement option = driver.findElement(By.xpath("//a[@href='http://www.selenium-by-arun.blogspot.com']"));
//		act.moveToElement(option).click().build().perform();
		
		
		//button[normalize-space()='Double click Here']
		WebElement dclick = driver.findElement(By.xpath("//button[normalize-space()='Double click Here']"));
		act.doubleClick(dclick).perform();
		
	}

}