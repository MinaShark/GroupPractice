package GroupWithZuhal.GroupWithZuhal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
		
		
		
		driver.switchTo().frame(0);
		WebElement sourcElement = driver.findElement(By.id("draggable"));
		hardWait();
		WebElement targetElement = driver.findElement(By.id("droppable"));
		hardWait();
		
		Actions action = new Actions(driver);
		action.
		clickAndHold(sourcElement).
		moveToElement(targetElement).
		release().build().perform();
		
		hardWait();
		
		driver.close();
	}
	
	public static void hardWait() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

}
}
}