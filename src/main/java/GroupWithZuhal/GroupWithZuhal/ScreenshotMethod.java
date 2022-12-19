package GroupWithZuhal.GroupWithZuhal;

import java.io.File;
import java.io.IOException;
import java.lang.Character.UnicodeScript;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotMethod {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://tek-school.com/retail/");
		
		
		driver.close();
		
	
	}
    public static void TakeScreenshot(String screenshotName) {
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyFile(file, new File("/Output/Screenshots" + screenshotName + ".jpg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
