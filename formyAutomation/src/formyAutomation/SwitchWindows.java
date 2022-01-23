package formyAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Collection;
import java.lang.Iterable;

public class SwitchWindows {

	public static void main(String[] args) {
		
		/* driver.switchTo().frame("frameName");
		 * driver.switchTo().frame("frameName");
		 * driver.switchTo().alert();
		 * */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VK107174\\Documents\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		WebElement newtabbutton = driver.findElement(By.id("new-tab-button"));
		newtabbutton.click();
		
		String oringalHandle = driver.getWindowHandle();
		
		for(String handle1: oringalHandle) {
			
			driver.switchTo().window(handle1);
		}
		
		driver.switchTo().window(oringalHandle);
		
		driver.quit();
	}

}
