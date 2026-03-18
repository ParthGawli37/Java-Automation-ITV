package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) {
		//Setting the chrome driver path for Java project to locate
		System.setProperty("webdriver.chrome.driver", "C:\\Browser_WebDrivers\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement btnSimpleAlert = driver.findElement(By.id("alertBtn"));
		WebElement btnConfirmAlert = driver.findElement(By.id("confirmBtn"));
		WebElement btnPromptAlert = driver.findElement(By.id("promptBtn"));
		
		btnSimpleAlert.click();
		
		Alert at = driver.switchTo().alert();
		System.out.println(at.getText());
		at.accept();
		
		btnConfirmAlert.click();
		System.out.println(at.getText());
		at.dismiss();
		
		btnPromptAlert.click();
		System.out.println(at.getText());
		at.sendKeys("Parth Gawli");
		at.accept();
		
		
		
		
		
		
		
		
		
		
	}

}
