package selenium_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment_JRI_GIT {

	public static void main(String[] args) {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.justrechargeit.com/SignIn.aspx");
		
		driver.findElement(By.id("imgbtnSignin")).click();
		String text = driver.findElement(By.id("MessageCaption2")).getText();
		System.out.println("Simple Alert text is : " + text);
	}

}
