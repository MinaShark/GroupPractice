package groupPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeNewLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
WebDriverManager.chromedriver().setup();
        
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.get("http://tek-school.com/retail/");
        WebElement text= driver.findElement(By.xpath("//a[text()='TEST ENVIRONMENT']"));
        System.out.println(text.getText());
       
        Assert.assertEquals(text.getText(), "TEST ENVIRONMENT");
        
        
        
        driver.findElement(By.linkText("My Account")).click(); // 
        
        
       WebElement register =  driver.findElement(By.linkText("Register"));
       register.click();
       
       
       // our actiual locator is register, since we use partial link text, we use only acount partially. 
   WebElement registerForm =    driver.findElement(By.partialLinkText("Account"));
       
   hardwait();
      Assert.assertEquals(driver.findElement(By.xpath("//h1[text()='Register Account']")).getText(),"Register Account");
      
      System.out.println(registerForm.getText());
       
      hardwait();
        driver.findElement(By.id("input-firstname")).sendKeys("Mina");
        
        driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Sediqi");
        hardwait();
        
        driver.findElement(By.cssSelector("")).sendKeys("mina.sediqi25@gmail.com");
        
       hardwait();
        
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("20273537366");
        
        hardwait();
        
        driver.findElement(By.id("input-password")).sendKeys("Tekschool123");
        hardwait();
        driver.findElement(By.id("input-confirm")).sendKeys("Tekschool123");
        hardwait();
       WebElement newsLetter =  driver.findElement(By.xpath("(//input[@name='newsletter'])[2]"));
       
       System.out.println(newsLetter.isSelected());
       Assert.assertEquals(newsLetter.isSelected(),true);
  
        hardwait();
        driver.findElement(By.xpath("//input[@type='checkbox']")).click();
        
        driver.findElement(By.xpath("//input[@value='Continue']")).click();
        
        hardwait();
       
        WebElement congrats= driver.findElement(By.xpath("//p[text()='Congratulations! Your new account has been successfully created!']"));
     
		Assert.assertEquals(congrats.getText(), "Congratulations! Your new account has been successfully created!");
		
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		   driver.close();
		
	
	}
	public static void hardwait() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


