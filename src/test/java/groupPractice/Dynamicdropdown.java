package groupPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.utils.OsgiUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamicdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		// how to print all the value in dropdown
		List<WebElement>listOfMonth = driver.findElements(By.xpath("//select[@id='month']//option"));
		System.out.println(listOfMonth.size());
		
		for (int i =0; i<listOfMonth.size(); i ++) {
			if (listOfMonth.get(i).getText().equals("Dec")) {
				listOfMonth.get(i).click();
				System.out.println(listOfMonth.get(i).getText());
				break;
			}
			
		}
		
		driver.close();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
