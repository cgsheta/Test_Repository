package selenium_;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebelementCount {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		
		//Hyperlinks
		List<WebElement> hyperlinks = driver.findElements(By.xpath("//a"));
		int a = hyperlinks.size();
		
		List<WebElement> hyperlinks1 = driver.findElements(By.xpath("//link"));
		int a1 = hyperlinks1.size();
		
		System.out.println("hyperLinks are : " + (a + a1));
		
		//Dropdowns
		List<WebElement> dropDowns = driver.findElements(By.xpath("//select"));
		int b = dropDowns.size();
		
		System.out.println("dropdowns are : " + b);
		
		//images
		//List<WebElement> images = driver.findElements(By.xpath("//img"));
		//int c = images.size();
		//System.out.println("images are : " + c);
		
		//editbox
		//List<WebElement> editbox = driver.findElements(By.xpath("//input[@type='text']"));
		//int d = editbox.size();
		//System.out.println("editbox are : " + d);
	}

}
