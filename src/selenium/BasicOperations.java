package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperations {

	public static void main(String[] args) {
		//Setting the chrome driver path for Java project to locate
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\parth\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				//
				driver.get("https://testautomationpractice.blogspot.com/");
				
				WebElement edtName = driver.findElement(By.id("name"));
				
				edtName.sendKeys("Parth");

	}

}
