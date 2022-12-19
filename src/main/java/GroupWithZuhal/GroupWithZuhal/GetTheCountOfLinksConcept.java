package GroupWithZuhal.GroupWithZuhal;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.output.AbstractByteArrayOutputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTheCountOfLinksConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
        // 1.get the total count of links on the page
        // 2.get the text of each link on the page
        
        // we use the tagname method
        // all the links are represented by the tag <a> html tag
        
      List <WebElement> linksList = driver.findElements(By.tagName("a"));
      
     // size of the linklist:
      System.out.println(linksList.size());
      
      // we have to use the for loop to iterate through it to print the text 
      
      for(int i=0; i<linksList.size(); i++) {
    	  System.out.println(linksList.get(i).getText());
      }
      
      // if you want to know the inputfields are there then you write the input keyword in the By.TagName by
      // driver.findElements
      
      // if you wnat to know how many buttons are there then you have to write the button keyword  in the 
      // driver.findEelemnts(By.TagName("button
     
        
	}

}
