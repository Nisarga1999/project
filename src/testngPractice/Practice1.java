package testngPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Practice1 {
	WebDriver driver = null;

	@BeforeClass
	@Parameters("browsername")
	public void launchBrowser(@Optional("chrome") String bname) {
		if (bname.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (bname.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		Reporter.log("chrome browser is launched", true);
	}

	@BeforeMethod
	public void login() {
		Reporter.log("user navigated to loginpage", true);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.name("remember")).click();
		driver.findElement(By.id("loginButton")).click();
		Reporter.log("user login suceesfully", true);
	}

	@Test
	public void Tc_001() {
		driver.findElement(By.id("container_tasks")).click();
		Reporter.log("user clicked on task bar", true);

	}

	@AfterMethod
	public void logout() {

		driver.findElement(By.id("logoutLink")).click();
		Reporter.log("user logout suceesfully", true);

	}

	@AfterClass
	public void tareBrowse() {

		driver.quit();
		Reporter.log("server close suceessfully", true);

	}
}
