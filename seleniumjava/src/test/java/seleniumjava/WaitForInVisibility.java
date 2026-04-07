package seleniumjava;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForInVisibility {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://leafground.com/waits.xhtml");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        
        driver.findElement(By.id("j_idt87:j_idt92")).click();

        WebElement element = driver.findElement(By.id("j_idt87:j_idt93"));        
        wait.until(ExpectedConditions.invisibilityOf(element));
        System.out.println("Button Disabled");
        driver.quit();
    }
}
