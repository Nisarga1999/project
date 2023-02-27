package browserLaunch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchingEmptyChomeBrowse {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.kstdc.co/tour-packages/tirupati-mangapura/");
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.urlToBe("https://www.kstdc.co/tour-packages/tirupati-mangapura/"));
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getWindowHandle());
		//System.out.println(driver.getPageSource());
		//navigate
		driver.navigate().forward();
		driver.get("https://www.keralatourism.org/");
		driver.navigate().refresh();
		driver.navigate().back();
		//driver.get("https://goatourism.gov.in/");
		driver.navigate().to("https://www.shridharmasthala.org/");
		driver.navigate().to("https://www.shridharmasthala.org/");
		driver.quit();

	}

}
