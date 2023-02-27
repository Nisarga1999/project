package browserLaunch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
//		WebElement frameEle = driver.findElement(By.xpath("//iframe[@name='app']"));
//		driver.switchTo().frame(frameEle);
//		driver.findElement(By.xpath("//span[text()='Maps']")).click();
//		driver.quit();
		
		driver.get("https://www.dream11.com/");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@name='regEmail']")).sendKeys("9632555615");
		driver.findElement(By.id("regUser")).click();
	}

}
