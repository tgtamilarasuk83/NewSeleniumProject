package seleniumjava;



import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Relative_locator {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);

       
        actions.moveToElement(
                driver.findElement(By.xpath("//a[text()='Selenium Practice']"))
        ).perform();

       
        driver.findElement(By.xpath("//a[text()='XPath Practice']")).click();
        

        
        driver.findElement(
                By.xpath("//label[text()='First Name ']/following::input[1][@type='text']")
        ).sendKeys("Tamilarasu");
        driver.quit();
    }
}
