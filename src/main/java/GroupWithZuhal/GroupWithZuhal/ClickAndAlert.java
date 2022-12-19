package GroupWithZuhal.GroupWithZuhal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		WebElement rightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement doublClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		
		Actions actions = new Actions(driver);
		actions.contextClick(rightClick).perform();
		
		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		copy.click();
	
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
	}

}
