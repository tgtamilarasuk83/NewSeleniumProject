package seleniumjava;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;



public class FluentWaitExample {

    public static void main(String args[]) {

        WebDriver driver = new EdgeDriver();

       driver.get("https://omayo.blogspot.com/");
       
      
        
        Wait<WebDriver> wait =
                new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(2))
                    .pollingEvery(Duration.ofMillis(300))
                    .ignoring(ElementNotInteractableException.class);

           
            
            WebElement timer2 = wait.until(d ->
            d.findElement(By.xpath("//button[normalize-space()='Dropdown']")));
            
            WebElement timer3 = wait.until(d ->
            d.findElement(By.xpath("//a[normalize-space()='Flipkart']")));
            

      
         timer2.click();
         timer3.click();
       driver.quit();
    }
}
