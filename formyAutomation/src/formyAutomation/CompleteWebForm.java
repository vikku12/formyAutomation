package formyAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import static org.junit.Assert.*;


public class CompleteWebForm {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK107174\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/form");
		
		driver.findElement(By.id("first-name")).sendKeys("Vishal");
		driver.findElement(By.id("last-name")).sendKeys("Kumar");
		driver.findElement(By.id("job-title")).sendKeys("Sr. Engineer");
		driver.findElement(By.id("radio-button-2")).click();
		driver.findElement(By.id("checkbox-1")).click();
		driver.findElement(By.cssSelector("option[value='2']")).click();
		driver.findElement(By.id("datepicker")).sendKeys("12/04/2021");
		driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
		driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement alert = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success")));
		
		String alertText  = alert.getText();
		
		
		//assertEquals("The form was successfully submitted!",alertText);
		
		driver.quit();
		
	}

}
