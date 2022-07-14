package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_Apple_vacation {
  @Test
  public void f() throws Exception {
	  WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.applevacations.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"accessible-megamenu-1657804489960-32\"]")).click(); 
	  
  }
}
