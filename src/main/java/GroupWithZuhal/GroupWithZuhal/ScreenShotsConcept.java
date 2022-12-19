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
import net.bytebuddy.implementation.LoadedTypeInitializer.ForStaticField;

public class ScreenShotsConcept {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://tek-school.com/retail/");

 
		takeScreeshot("tekRetailPage");


    }

//     we need to create method that way we can call it any time we want

    public static void takeScreeshot(String screenshotName) {

        String path = ".\\screenshots\\";

//        1. take screenshot and store it as file format
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

//        2. now copy the screenshot to desired location using copyfile method:

        try {
            FileUtils.copyFile(file, new File(path + screenshotName + ".png"));
        } catch (IOException e) {

            e.printStackTrace();
		
	
		
        }
	
	}
}




