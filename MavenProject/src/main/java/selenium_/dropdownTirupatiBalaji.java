package selenium_;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownTirupatiBalaji {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tirupatibalaji.ap.gov.in/#/registration");
		
		Thread.sleep(5000);
		
		//Choose Country as "INDIA"

		Select countryS = new Select(driver.findElement(By.name("countryS")));
		countryS.selectByValue("number:1001");

		//State as "Assam" / Goa /your wish
		Select stateS = new Select(driver.findElement(By.name("stateS")));
		
	}

}
