package seleniumjava1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class handlingAutosuggestions {
	public static void main(String[] a) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0khs8ik5xi9in1odb14p9ym3lm14556593.node0");
		
		
		WebElement drop = driver.findElement(By.id("j_idt87:auto-complete_input"));
		drop.click();
		//Actions act = new Actions(drop);
		  drop.sendKeys("Selenium WebDriver" , Keys.ENTER + "Tamil" , Keys.ENTER);
		

		
		
		
		List<WebElement> op = driver.findElements(By.cssSelector(".ui-autocomplete-items.ui-autocomplete-list.ui-widget-content.ui-widget.ui-corner-all.ui-helper-reset li"));
		System.out.println(op.size());
		
		
		for(WebElement is : op) {
			System.out.println("Options are :" +is.getText());
		}
		
	}
}