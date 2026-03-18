package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		//
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> headers = driver.findElements(By.xpath("//table[@id='taskTable']/thead/tr/th"));
		int col = 0;
		
		for(WebElement h : headers) {
			col++;
			if(h.getText().equals("Memory (MB)")) {
				break;
			}
		}
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='taskTable']/tbody/tr"));
		
		int row = 1;
		for(WebElement r: rows) {
			String name = driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr[" + row + "]/td[1]")).getText();
			if(name.equals("System")) {
				break;
			}
			row++;
		}
		WebElement memoryValue = driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr[" + row + "]/td["+ col +"]"));
		String memory = memoryValue.getText();
		System.out.println("Memory of 'System' is - " + memory );
		
		
		
		
		driver.quit();
		

	}

}
