package browserLaunch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptDisableandHidden {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
//		WebElement ele = driver.findElement(By.xpath("//div[text()='Gender (optional)']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		driver.findElement(By.xpath("//label[text()='Custom']")).click();
//		js.executeScript("arguments[0].value='nisarga';", ele);
		driver.get("https://demoapp.skillrary.com/");
		WebElement disable = driver.findElement(By.xpath("//input[@class='form-control']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='nisarga';", disable);
		js.executeScript("window.scrollBy(0,500)");
	}

}
