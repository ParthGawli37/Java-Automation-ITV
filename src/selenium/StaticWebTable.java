package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement priceMasterInSelenium = driver.findElement(By.xpath("//table[@name='BookTable']/tbody/tr[5]/td[4]"));
		String price = priceMasterInSelenium.getText();
		System.out.println("Price of the book 'Master In Selenium' is - " + price);

	}

}
