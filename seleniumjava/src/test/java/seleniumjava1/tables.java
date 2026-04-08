package seleniumjava1;

import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class tables {

	public static void main(String args[]) {
		
		WebDriver drive = new EdgeDriver();
		
		drive.get("https://omayo.blogspot.com/");
		
     List  <WebElement> Element 	= 	drive.findElements(By.xpath("//table[@id = 'table1']//tr"));
//
//    for (WebElement e : Element) {
//		System.out.println(e.getText());
//	}
			
    
    Element.clear();
    
    Element 	= 	drive.findElements(By.xpath("//table[@id = 'table1']"``));
    for (WebElement e : Element) {
  		System.out.println(e.getText());
  	} 
   drive.close();
		
	}
}
