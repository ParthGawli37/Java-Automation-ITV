package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting the chrome driver path for Java project to locate
				System.setProperty("webdriver.chrome.driver", "C:\\Browser_WebDrivers\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				//
				driver.get("https://testautomationpractice.blogspot.com/");
				
				WebElement btnStart = driver.findElement(By.name("start"));
				WebElement txtAreaAddress = driver.findElement(By.id("textarea"));
				WebElement InkMerryMoon = driver.findElement(By.linkText("merrymoonmary"));
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
//				js.executeScript("arguments[0].click();", btnStart);
//				js.executeScript("arguments[0].value='Kandivali, Mumbai';", txtAreaAddress);
				js.executeScript("arguments[0].scrollIntoView(true);", InkMerryMoon);
				InkMerryMoon.click();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				driver.quit();
	}

}
