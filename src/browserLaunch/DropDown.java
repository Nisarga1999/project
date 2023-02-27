package browserLaunch;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/");
		driver.findElement(By.xpath("//span[text()='Men']")).click();
		driver.findElement(By.xpath("//a[text()='Sneakers']")).click();
		WebElement dropdown = driver.findElement(By.id("product-list-sort-select"));
		dropdown.click();
		Select s = new Select(dropdown);
		s.selectByIndex(1);
		List<WebElement> all = s.getOptions();
		for (WebElement ele : all) {
			System.out.println(ele.getText());
		}
		s.selectByVisibleText("Top Sellers");
		s.selectByValue("new-arrivals");
		System.out.println(s.isMultiple());
		List<WebElement> allopt = s.getAllSelectedOptions();
		for (WebElement alloptions : allopt) {
			System.out.println(alloptions.getText());
		}
		System.out.println(s.getFirstSelectedOption());

	}

}
