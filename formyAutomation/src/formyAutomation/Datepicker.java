package formyAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK107174\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/datepicker");
		
		WebElement dateField = driver.findElement(By.id("datepicker"));
		dateField.sendKeys("13/02/1990");
		dateField.sendKeys(Keys.RETURN);
		
		driver.quit();

	}

}
