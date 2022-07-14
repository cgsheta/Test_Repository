package selenium_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		Thread.sleep(5000);
		//Select a speed: Fast
		Select speed = new Select(driver.findElement(By.id("speed")));
		speed.selectByIndex(3);
		
		//Select a file: PDF file
		Select file = new Select(driver.findElement(By.id("files")));
		file.selectByValue("2");
		//Select a number: 4
		//Select a Product: Iphone
		//Select a Animal: Baby cat
	}

}
