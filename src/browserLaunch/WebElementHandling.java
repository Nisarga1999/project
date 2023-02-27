package browserLaunch;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("admin");
		System.out.println(user.getAttribute("name"));
//		System.out.println(user.getTagName());
//		System.out.println(user.getText());
//		System.out.println(user.getClass());
		System.out.println(user.getLocation());
		System.out.println(user.getRect());
		System.out.println(user.getSize());
		Dimension dim=new Dimension();
		System.out.println(dim.getHeight());
		System.out.println(dim.getWidth());
		System.out.println(user.getCssValue("font-size"));
		System.out.println(user.getTagName());
		//driver.quit();
		

	}

}
