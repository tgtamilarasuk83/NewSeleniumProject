package seleniumjava;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class explicit_wait {
    public static void main(String args[]) {

        WebDriver driver = new EdgeDriver();

        driver.get("https://omayo.blogspot.com/");

       
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        
        //WebElement timer = wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
      //input[@id='']
        
        WebElement timer2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("alert2")));
        WebElement timer3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("alert2")));
        
        String timer2.gettext();
      
        //timer.click();
        timer2.click();
        timer3.click();
    }
}
