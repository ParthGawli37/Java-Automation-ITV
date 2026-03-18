package SeleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment12 {

	public static void main(String[] args) {

		//Launch Chrome and open a website
		WebDriver chrome = new ChromeDriver();	
		chrome.manage().window().maximize();
		
		chrome.get("https://www.google.com/");
		
		//Print browser title using webdriver.
		System.out.println("Page Title is :" + chrome.getTitle());
		
		//Closing chrome browser
		chrome.quit();

		//Launching edge browser and open a website
		WebDriver edge = new EdgeDriver();
		edge.get("https://www.google.com/");
		
		//Printing browser title using webdriver
		System.out.println("Edge Title is :" + edge.getTitle());
		
		//Closeing edge broswer and stoping selenium.
		edge.quit();

	}

}
