package selenium_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class blazedemo {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");
		
		//Choose your departure city:
		Thread.sleep(2000);
		Select departureCity = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")));
		departureCity.selectByValue("Boston");
		
		//Choose your destination city:
		Thread.sleep(2000);
		Select destinationCity = new Select(driver.findElement(By.xpath("/html/body/div[3]/form/select[2]")));
		destinationCity.selectByValue("London");
		
		
		//	Click on FindFlights button
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();
		
		//	Click on 'Choose This Flight' (any button / third one)
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[3]/td[1]/input")).click();
		
		//	Fill all the data(Valid/Invalid) then click on 'Purchase' Flight button
		Thread.sleep(2000);
		driver.findElement(By.id("inputName")).sendKeys("Chirag");
		driver.findElement(By.id("address")).sendKeys("52 Wannamaker Cr");
		driver.findElement(By.id("city")).sendKeys("Cambridge");
		driver.findElement(By.id("state")).sendKeys("Ontario");
		driver.findElement(By.id("zipCode")).sendKeys("N3E 0C5");
		Select cardType = new Select(driver.findElement(By.id("cardType")));
		cardType.selectByValue("visa");
		driver.findElement(By.id("creditCardNumber")).sendKeys("1234567887654321");
		driver.findElement(By.id("creditCardMonth")).clear();
		driver.findElement(By.id("creditCardMonth")).sendKeys("10");
		driver.findElement(By.id("creditCardYear")).clear();
		driver.findElement(By.id("creditCardYear")).sendKeys("2025");
		driver.findElement(By.id("nameOnCard")).sendKeys("Chirag Sheta");
		driver.findElement(By.id("rememberMe")).click();
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		
		
		//	Get the message "Thank you for your purchase today!"
		String successMessage = driver.findElement(By.xpath("/html/body/div[2]/div/h1")).getText();
		System.out.println("Confirmation Message is : " + successMessage);
		
		//	Get all the other details
		String details = driver.findElement(By.xpath("/html/body/div[2]/div/table")).getText();
		System.out.println("Purchase Details are : " + details);
		
	}

}
