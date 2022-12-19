package GroupWithZuhal.GroupWithZuhal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.ls.LSOutput;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DwonloadFileCocpet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://omayo.blogspot.com/");
        
        
      String projectPaht=  System.getProperty("user.dir");
        
       driver.findElement(By.id("uploadfile")).sendKeys(projectPaht+"\\Screenshots\\ScreenshotsLikedin Page.png");
		
	}
	

}
