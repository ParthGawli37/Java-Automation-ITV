package SeleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();//window  maximized
		//open google 
		driver.get("https://www.google.com");
		//navigate to wikipedia site
		driver.navigate().to("https://www.wikipedia.org/");
		//navigate back to google
		driver.navigate().back();
		driver.navigate().refresh();//refresh google
		//navigate to wiki
		driver.navigate().forward();
		// close wiki
		driver.close();
		
		// quit all
		driver.quit();
	}

}
