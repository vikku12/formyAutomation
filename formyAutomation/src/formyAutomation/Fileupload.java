package formyAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK107174\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/fileupload");
		
		WebElement fileUpload = driver.findElement(By.id("file-upload-field"));
		fileUpload.sendKeys("MicrosoftTeams-image.png");
		
		driver.quit();

	}

}
