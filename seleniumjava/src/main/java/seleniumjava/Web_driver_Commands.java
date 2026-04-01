package seleniumjava;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Web_driver_Commands {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		String title = driver.getTitle();
		System.out.println(title);

		int length = title.length();
		System.out.println("Title Length: " + length);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String pageSource = driver.getPageSource();
		System.out.println("Length: " + pageSource.length());


		

		String expectedUrl = "https://www.flipkart.com/";

		if (currentUrl.equals(expectedUrl)) {
			System.out.println("Valid URL");
		} else {
			System.out.println("Invalid URL");
		}

		driver.close();
	}
}
