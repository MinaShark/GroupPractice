package GroupWithZuhal.GroupWithZuhal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.command.PullImageCmd;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://demo.automationtesting.in/FileDownload.html");
		
		
		// textfile
		driver.findElement(By.id("textbox")).sendKeys("ZuhalJan");
		driver.findElement(By.id("createTxt")).click();
		driver.findElement(By.id("link-to-download")).click();
		
		
	// PDF files 
	driver.findElement(By.id("pdfbox")).sendKeys("pdfbox");
	driver.findElement(By.id("createPdf")).click();
	driver.findElement(By.id("createPdf")).click();
		
	
	// we write the sytenxt for Java executer as belew:
	// javascriptExecuter jsE= (javascriptExecuter)driver;
	//jsE.executeScript("arguments[0].click

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
