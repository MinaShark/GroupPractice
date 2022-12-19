package groupPractice;

import java.time.temporal.WeekFields;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaticDropDown {

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
	
   
  //  Select selectmonth = new Select(month);
   // selectmonth.selectByVisibleText("Jul");
   // hardWait();
    
   // Select selectday = new Select(day);
 //  selectday.selectByVisibleText("15");
  //  hardWait();
    
   // Select selectyear = new Select(year);
   //selectyear.selectByValue("1995");
   // hardWait();
    
	
	
	selectByVisibleText(month, "Jul");
	selectByVisibleText(day, "15");
	selectByVisibleText(year, "1995");
    
    driver.close();
    driver.quit();
    
    
   
		
	}
	
	public static void selectByVisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
  public static void hardWait() {
	  try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }
}
