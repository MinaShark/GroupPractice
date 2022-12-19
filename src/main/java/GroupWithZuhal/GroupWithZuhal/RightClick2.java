package GroupWithZuhal.GroupWithZuhal;

import java.util.concurrent.TimeUnit;

import org.bouncycastle.jcajce.provider.digest.Haraka;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
			
		
		
		Actions action = new Actions(driver);
		
		WebElement rightClickButton = driver.findElement(By.cssSelector("span.context-menu-one"));
		action.contextClick(rightClickButton).build().perform();
		hardWait();
		
		WebElement copy = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		String copyText = copy.getText();
		hardWait();
		System.out.println(copyText);
		
		Alert alert = driver.switchTo().alert();
	
		alert.accept();
		hardWait();
		copy.click();
		
		
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
