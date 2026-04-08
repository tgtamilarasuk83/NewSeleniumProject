package seleniumjava1;



import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopup {

    public static void main(String[] args) throws InterruptedException {

        
        WebDriver driver = new ChromeDriver();

        
        driver.get("https://blog.hubspot.com/website/website-pop-up-examples"); 
        driver.manage().window().maximize();

       

        
        String mainWindow = driver.getWindowHandle();

       
        Set<String> allWindows = driver.getWindowHandles();

      
        if (allWindows.size() > 1) {

            for (String window : allWindows) {

                if (!window.equals(mainWindow)) {

                    driver.switchTo().window(window);

                  
                    driver.close();
                }
            }
            driver.switchTo().window(mainWindow);
        }

     
        driver.navigate().to("");

        System.out.println("Home Page");

       

        driver.quit();
    }
}

