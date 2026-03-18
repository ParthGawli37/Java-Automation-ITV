package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//		Thread.sleep(30000); //java wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100)); //Implicit Wait
		
		WebElement edtUsername = driver.findElement(By.name("username"));
		WebElement edtPassword = driver.findElement(By.name("password"));
		WebElement btnLogin = driver.findElement(By.tagName("button"));
		
		edtUsername.sendKeys("Admin");
		edtPassword.sendKeys("admin123");
		btnLogin.click();
	}

}
