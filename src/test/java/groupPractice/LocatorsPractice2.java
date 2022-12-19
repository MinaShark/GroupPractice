package groupPractice;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsPractice2 {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://tek-school.com/retail/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	WebElement text =	driver.findElement(By.xpath("//a[text()='TEST ENVIRONMENT' ]"));
		System.out.println(text.getText());
		
		Assert.assertEquals(text.getText(), "TEST ENVIRONMENT");
	
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		hardWait();
		
	WebElement register =	driver.findElement(By.linkText("Register"));
	register.click();
		
	hardWait();
	
	WebElement registerForm = driver.findElement(By.xpath("//h1[text()='Register Account']"));
    //System.out.println(registerForm.getText());
    
    Assert.assertEquals(driver.findElement(By.xpath("//h1[text()='Register Account']")).getText(),
            "Register Account");
                System.out.println(registerForm.getText());
                
                driver.findElement(By.id("input-firstname")).sendKeys("MinaJan");
                hardWait();
                
                driver.findElement(By.id("input-lastname")).sendKeys("Khan");
                hardWait();
                
                driver.findElement(By.cssSelector("input#input-email")).sendKeys("MinaJan4@gmail.com");
                hardWait();
                
                driver.findElement(By.name("telephone")).sendKeys("20276354686");
                hardWait();
                
                driver.findElement(By.id("input-password")).sendKeys("Tek345");
                
                driver.findElement(By.id("input-password")).sendKeys("Tek345");
                hardWait();
                
                WebElement newsLetter =  driver.findElement(By.xpath("(//input[@name='newsletter'])[2]"));
                
                System.out.println(newsLetter.isSelected());
                Assert.assertEquals(newsLetter.isSelected(),true);
           
                 hardWait();
                 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
                 
                 driver.findElement(By.xpath("//input[@value='Continue']")).click();
                 
                 hardWait();
            
	
	
	
		
		
		
		
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
