package browserLaunch;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHnadlesByUsingSwitchToHandleActiveElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.get("https://www.flipkart.com/");
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
//		String parentId = driver.getWindowHandle();
//		driver.findElement(By.name("q")).sendKeys("REDMI", Keys.ENTER);
//		driver.findElement(By.xpath("//div[@class='CXW8mj']/../../../../../..//div[contains(text(),'REDMI ')]"))
//				.click();
//		Set<String> allwindowId = driver.getWindowHandles();
//		allwindowId.remove(parentId);
//		for (String id : allwindowId) {
//			driver.switchTo().window(id);
//		}
//		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		
		//====================================================
		
		driver.get("https://demo.actitime.com/login.do");
		WebElement user = driver.switchTo().activeElement();
		user.sendKeys("admin");
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		
		
		
	}
}
