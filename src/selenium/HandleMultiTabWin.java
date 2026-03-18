package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleMultiTabWin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//
		driver.get("https://testautomationpractice.blogspot.com/");
		
		String parentWin = driver.getWindowHandle();
		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
		
//		Set<String> winHandles = driver.getWindowHandles();
//		
//		for(String s: winHandles) {
//			if(!s.equals(parentWin)) {
//				driver.switchTo().window(s);//switch to the new tab/window
//				break;
//			}
//		}
//		
//		driver.findElement(By.linkText("Manual Testing Materials")).click();
//		
//		driver.switchTo().window(parentWin);//switch to the original / Parent window
//		
		//Handling multiple browser windows
		driver.findElement(By.id("PopUp")).click();
		Set<String> broHandles = driver.getWindowHandles();
		
		for(String s: broHandles) {
			if(!s.equals(parentWin)) {
				driver.switchTo().window(s);//switch to the new tab/window
				System.out.println("Switch to the new window with title - " + driver.getTitle());
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
