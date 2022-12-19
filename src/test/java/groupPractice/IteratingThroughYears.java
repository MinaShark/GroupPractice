package groupPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IteratingThroughYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		List<WebElement> listOfYear = driver.findElements(By.cssSelector("select#year>option"));
		System.out.println(listOfYear.size());
		
	//	for (int i = 2; i< listOfYear.size(); i++) {
		//	if(i==2010||i== 2011||2012) {
			//	System.out.println(listOfYear.get(i).getText());
		//		break;
				
			}
			
		}
		
	}

}
