package locatorsinselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorInSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Selenium Browser Drivers\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("test@gmail.com");
		
	//	driver.findElement(By.id("pass")).sendKeys("12345");
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("1234576");
		
	//	driver.findElement(By.name("login")).click();
		
	//	driver.findElement(By.tagName("a")).click();
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.findElement(By.partialLinkText("Voting")).click();
	}

}
