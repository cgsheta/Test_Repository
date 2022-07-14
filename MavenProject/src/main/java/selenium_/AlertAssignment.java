package selenium_;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertAssignment {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		//1)click on first 'Click me' button
		// Get the text from Alert and click on OK button
		Thread.sleep(3000);
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		Alert simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		System.out.println("Simple Alert text is : " + alertText);
		driver.switchTo().alert().accept();
		
	
		//2)click on second 'Click me' button
		//This alert appeared after 5 seconds
	    //Get the text from Alert and click on OK button
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"timerAlertButton\"]")).click();
		Thread.sleep(6000);
		Alert timerAlert = driver.switchTo().alert();
		String alertText1 = timerAlert.getText();
		System.out.println("Timer Alert text is : " + alertText1);
		driver.switchTo().alert().accept();
		
		
		
		//3)click on third 'Click me' button
		//Get the text from confirmAlert and click on OK/Cancel button
		//If you clicked on any button on confirmAlert
		//system will display text like below,
		//'You selected Ok'
		//'You selected Cancel'
		//get the above text too.
		
		Thread.sleep(3000);
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		Alert confirmationAlert = driver.switchTo().alert();
		String confirmAlert = confirmationAlert.getText();
		System.out.println("Confirm Alert text is : " + confirmAlert);
		confirmationAlert.accept();
	
	}

}
