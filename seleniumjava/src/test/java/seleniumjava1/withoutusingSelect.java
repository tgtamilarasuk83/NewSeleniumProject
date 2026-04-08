package seleniumjava1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class withoutusingSelect {
    public static void main(String args[]) {
        
        WebDriver driver = new EdgeDriver();
        
        driver.get("https://leafground.com/select.xhtml");
        
        
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class = 'col-12']"));
        
        String element1 ="Cypress";
        
        System.out.println(elements.size());
        
        for(int i=0; i<elements.size(); i++) {
            
            if(elements.get(i).getText().equals(element1)) {
                
                elements.get(i).click();
                break;
            }
        }
    }
}
