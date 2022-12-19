package GroupWithZuhal.GroupWithZuhal;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassSendKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://tek-school.com/retail/");
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
      WebElement desktop =   driver.findElement(By.xpath("//a[text()='Desktops']"));
      WebElement showAllDesktop = driver.findElement(By.xpath("//a[contains(text(),'Show All Desktops')]"));
     WebElement search =    driver.findElement(By.cssSelector("input[class='form-control input-lg']\""));
     String text = "MacBook Air";
        
        Actions actions = new Actions(driver);
        
        Action builderAction = actions.keyDown(Keys.COMMAND).sendKeys(search,text).keyUp(Keys.COMMAND).build();
        builderAction.perform();
		
		
		// this class was not succefull because it did not write the text in the search box
        
		
		
		
		
	}

}
