package browserLaunch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutionScrollBy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.mangomist.com/");
		driver.findElement(By.xpath("//a[text()='Day Out']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500);");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Day Out']"));
		js.executeScript("arguments[0].click();",ele);
//		WebElement ele = driver.findElement(By.xpath("//h4[contains(text(),'Half Mango Lunch')]"));
//		js.executeScript("arguments[0].scrollIntoView(true);", ele);
	}

}
