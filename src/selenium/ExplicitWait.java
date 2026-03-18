package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//
		driver.get("https://www.webdriveruniversity.com/Ajax-Loader/index.html");
		
		WebElement loader = driver.findElement(By.xpath("//div[@id='loader']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		boolean loaderState = (boolean) wait.until(ExpectedConditions.invisibilityOf(loader));
		
		if(loaderState) {
			WebElement btnClickMe = driver.findElement(By.id("button1"));
			btnClickMe.click();
			
		} else {
			System.out.println("Loader still visible");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
