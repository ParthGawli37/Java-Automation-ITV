package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting the chrome driver path for Java project to locate
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parth\\Browser_WebDrivers\\chromedriver-win64\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
				
				//
		driver.get("https://qaplayground.dev/apps/iframe/");
		
		
		driver.switchTo().frame("frame1");
		driver.switchTo().frame("frame2");
		
		WebElement btnClickMe = driver.findElement(By.xpath("//a[text()='Click Me']"));
		btnClickMe.click();
		
		driver.switchTo().defaultContent();
	}

}
