package groupPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDropdown2 {

	public static void main(String[] args) {
		
		
		
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		
		List<WebElement> listOfDay = driver.findElements(By.cssSelector("select#day>option"));
		System.out.println(listOfDay.size());
		
		
		for (int i =0; i<listOfDay.size();i++) {
			if (listOfDay.get(i).getText().equals("15")){
				listOfDay.get(i).click();
				System.out.println(listOfDay.get(i).getText());
				break;
			}
		}

		
		List<WebElement> listOfYear = driver.findElements(By.cssSelector(""));
		
		
		driver.quit();
		driver.close();
		
		
		
	}

}
