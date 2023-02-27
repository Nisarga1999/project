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

public class TS2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://in.via.com/");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tar = ts.getScreenshotAs(OutputType.FILE);
		File target=new File("./errorshots/nis.png");
		FileHandler.copy(tar, target);
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Flights')]"));
		File tarr = ele.getScreenshotAs(OutputType.FILE);
		File target1=new File("./errorshots/nish.png");
		FileHandler.copy(tarr, target1);


	}

}
