package firstTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.sun.jna.platform.FileUtils;



public class FirstTest {
	@Test
	public void validatefirstTest() {
		WebDriver wd=new FirefoxDriver();
		wd.get("https://www.bing.com");
		WebElement data=wd.findElement(By.name("q"));
		data.sendKeys("chennai");
		data.sendKeys(Keys.ENTER);
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copy
	}
}
