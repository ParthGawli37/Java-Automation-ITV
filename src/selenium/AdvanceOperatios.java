package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvanceOperatios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Setting the chrome driver path for Java project to locate
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parth\\Browser_WebDrivers\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		WebElement rbMale = driver.findElement(By.id("male"));
//		rbMale.click();
//		if(rbMale.isSelected()) {
//			System.out.println("Male is selected");
//		} else {
//			System.out.println("Male is not selected");
//		}
		
//		WebElement chkSunday = driver.findElement(By.id("sunday"));
//		if(chkSunday.isSelected()) {
//			System.out.println("Sunday is already selected");
//		} else {
//			chkSunday.click();
//			System.out.println("Sunday is now selected");
//		}
	
		Actions act = new Actions(driver);
		WebElement btnPointMe = driver.findElement(By.className("dropbtn"));
		WebElement btnCopyText = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		WebElement srcDrag = driver.findElement(By.id("draggable"));
		WebElement dstDrop = driver.findElement(By.id("Droppable"));
		
		act.dragAndDrop(srcDrag, dstDrop).perform();
		act.moveToElement(btnPointMe).perform();
		act.contextClick(btnPointMe).perform();
		act.doubleClick(btnCopyText).perform();
		
		
		
		

	}

}
