package groupPractice;

import java.time.Month;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropDown1 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		
	WebElement month = 	driver.findElement(By.id("month"));
	WebElement day = driver.findElement(By.id("day"));
	WebElement year = driver.findElement(By.id("year"));
	
	//Select selectmonth = new Select (month);
	//selectmonth.selectByValue("6");
	//hardWait();
	
	//Select selectday = new Select (day);
	//selectday.selectByVisibleText("28");
	//hardWait();
	
	//Select selectyear = new Select (year);
	//selectyear.selectByIndex(28);
	//hardWait();
	
	
	
	selectByVisibleText(day, "9");
	hardWait();
	selectByVisibleText(month, "Mar");
	hardWait();
	selectByVisibleText(year, "1990");
	hardWait();
	
	
	driver.close();
	driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	}
	// we created this method when we have more dropdowns then we want to save time and use this method instade
	public static void selectByVisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
		
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
