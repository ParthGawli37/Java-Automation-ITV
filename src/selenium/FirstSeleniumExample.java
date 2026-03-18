package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumExample {

	public static void main(String[] args) {
		
		//Setting the chrome driver path for Java project to locate
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parth\\Browser_WebDrivers\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.navigate().to("https://www.google.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	
		
		
//		driver.quit();
		
		
	}

}
