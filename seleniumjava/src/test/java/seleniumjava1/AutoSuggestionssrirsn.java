package seleniumjava1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggestionssrirsn {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0khs8ik5xi9in1odb14p9ym3lm14556593.node0");
		
		
		WebElement drop = driver.findElement(By.id("j_idt87:auto-complete_input"));
		drop.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		List<WebElement> element =  wait.until(ExpectedConditions.visibilityOfAllElements(By.xpath("//*")));
		
		
		for()
		
	}

}
