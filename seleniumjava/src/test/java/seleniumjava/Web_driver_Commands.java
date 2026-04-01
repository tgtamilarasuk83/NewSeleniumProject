package seleniumjava;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Web_driver_Commands {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();

		driver.get("https://www.flipkart.com/");

		String title = driver.getTitle();
		System.out.println(title);

		int length = title.length();
		System.out.println("Title Length: " + length);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String pageSource = driver.getPageSource();
		System.out.println("Length: " + pageSource.length());
		
		try {
			
			FileWriter writer = new FileWriter("FlipkartPageSource.txt");
			writer.write(pageSource);
			writer.close();

			System.out.println("Page source");

		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}

		String expectedUrl = "https://www.flipkart.com/";

		if (currentUrl.equals(expectedUrl)) {
			System.out.println("Valid URL");
		} else {
			System.out.println("Invalid URL");
		}

		driver.close();
	}
}
