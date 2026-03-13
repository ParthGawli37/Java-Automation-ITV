package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class BasicOperations {

	public static void main(String[] args) {
				//Setting the chrome driver path for Java project to locate
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\parth\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				//
				driver.get("https://testautomationpractice.blogspot.com/");
				
//				WebElement edtName = driver.findElement(By.id("name"));
//				edtName.clear();
//				edtName.sendKeys("Parth");
//
//				WebElement edtName = driver.findElement(By.cssSelector("#name"));
//				WebElement edtName = driver.findElement(By.xpath(""));
				
//				WebElement parentEdtName = driver.findElement(By.xpath("//input[@id='name']/parent::div"));
				
//				WebElement btnStart = driver.findElement(By.name("start")) //basic
//				WebElement btnStart = driver.findElement(By.cssSelector("button[name='start']")); //Css
//				//check if button is displayed
//				if(btnStart.isDisplayed()) {
//					if
//					btnStart.click();
//					System.out.println("Clicked on Start button");
//				} else {
//					System.out.println("Start button is not enable");
//				}
				
//				btnStart.click();
				
//				WebElement edtEmail = driver.findElement(By.id("email"));
//				System.out.println("The Email place holder " + edtEmail.getAttribute("placeholder"));
				
				
//				WebElement edtPhone = driver.findElement(By.tagName("input"));
//				
//				WebElement InkHome = driver.findElement(By.linkText("Home"));
//				InkHome.click();
				
//				WebElement InkOnline = driver.findElement(By.partialLinkText("Online"));
//				InkOnline.click();
				
				
//				WebElement lblPageHeader = driver.findElement(By.xpath("//h1[@class='title']"));
//				System.out.println("the page header is - " + lblPageHeader.getText());
//						
				
//				driver.quit();
				
//				Select drpCountry = new Select(driver.findElement(By.id("country")));
//				drpCountry.selectByIndex(4);
//				drpCountry.selectByValue("usa");
//				drpCountry.selectByContainsVisibleText("India");
				
//				Select drpColors = new Select(driver.findElement(By.id("colors")));
//				drpColors.selectByIndex(0);
//				drpColors.selectByIndex(1);
//				
//				drpColors.deselectAll();
				
				
				
	}

}
