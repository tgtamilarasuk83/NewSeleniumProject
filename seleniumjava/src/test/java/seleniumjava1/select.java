package seleniumjava1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class select {
    public static void main(String args[]) {
        
        WebDriver driver = new EdgeDriver();
        
       
        driver.get("https://leafground.com/select.xhtml");
        
        
        WebElement element = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        
        
        Select select = new Select(element);
        
       
        select.selectByVisibleText("Cypress");
        
        System.out.println("Option selected successfully");
       
     
    }
}
