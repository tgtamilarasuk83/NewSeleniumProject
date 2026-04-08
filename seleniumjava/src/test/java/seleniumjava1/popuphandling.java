package seleniumjava1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchElementException;

public class popuphandling {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.1tamilmv.gripe/");
        driver.manage().window().maximize();

        try {
           
            driver.findElement(By.xpath("//span[contains(text(),'Daredevil: Born Again (2026) S02 EP (04) TRUE WEB-')]")).click();
        } 
        catch (NoSuchElementException e) {

            System.out.println("redirecting to Home Page");

         
            driver.navigate().to("https://www.1tamilmv.gripe/");
        }

        Thread.sleep(3000); 

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

        driver.navigate().to("https://www.1tamilmv.gripe/");
        System.out.println("Returned to Home Page");

        driver.quit();
    }
}
