package seleniumjava;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;



public class Omoyo {
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.className("//button[@class='dropbtn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("//a[text()='Facebook']")).click();
		
		
		
		
		
	}

	

}
