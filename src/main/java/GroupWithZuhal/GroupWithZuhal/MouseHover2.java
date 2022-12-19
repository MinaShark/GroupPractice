package GroupWithZuhal.GroupWithZuhal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		hardWait();
		// this will move to the element and perform 
		
		driver.findElement(By.xpath("//a[text()='Articles']")).click();
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
