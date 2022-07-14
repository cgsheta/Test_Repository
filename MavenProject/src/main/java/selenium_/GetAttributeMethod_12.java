package selenium_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeMethod_12 {

	public static void main(String[] args) {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.xe.com/");
		
		//Get the amount editbox default value using Getattribute method 
		//and print it into Console
		String amount = driver.findElement(By.xpath("//*[@id=\"amount\"]")).getAttribute("value");
		System.out.println("default value is : " + amount);
		
		
		
		//Get the plain text "How to transfer money in 3 easy steps" 
		//from application by using GetText method

	}

}
