package browserLaunch;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chromedriver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 20);
		driver.get("https://demowebshop.tricentis.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File webpage = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./errorshots/snap.png");
		FileHandler.copy(webpage, target);
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Computers')]"));
		File source = ele.getScreenshotAs(OutputType.FILE);
		File target1 = new File("./errorshots/s.png");
		FileHandler.copy(source, target1);                                      
				
	}

}
