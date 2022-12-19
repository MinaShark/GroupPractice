package GroupWithZuhal.GroupWithZuhal;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class Screenshotconcept3 {
	
	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		takeScreenshot("Facebook_loginPage");
		
		
	}

	public static void takeScreenshot(String fileName) throws IOException {
		
		// 1. take screenshot and store it as a file format
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
		// 2. now copy the screenshot to desired locatoin using copyfile method
		
		FileUtils.copyFile(file, new File("/Output/Screenshots" + fileName +".png"));
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
