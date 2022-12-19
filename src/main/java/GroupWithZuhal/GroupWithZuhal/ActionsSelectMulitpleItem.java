package GroupWithZuhal.GroupWithZuhal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAction;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsSelectMulitpleItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/selectable/");

        driver.switchTo().frame(0);

        WebElement item1= driver.findElement(By.xpath("//li[contains(text(),'Item 1')]"));
        WebElement item2= driver.findElement(By.xpath("//li[contains(text(),'Item 2')]"));
        WebElement item3= driver.findElement(By.xpath("//li[contains(text(),'Item 3')]"));
        WebElement item4= driver.findElement(By.xpath("//li[contains(text(),'Item 4')]"));
        
        Actions actions = new Actions (driver);
        
    //    actions.keyDown(Keys.CONTROL)
      //  .click(item1)
      //  .click(item2)
      //  .click (item3)
        //.click(item4)
       // .keyUp(Keys.CONTROL)
       // .build()
       // .perform();
        
        driver.close();
        
        // if we have multiple action to perform we use build if not we only use perform for single action only use perform
     // if we have mutliple action to perform we use build if not we only use perform or for single action only perfrom()
        Actions action2 = new Actions(driver);
        Action builder = action2.keyDown(Keys.CONTROL) // Action is a interface that represent a single user interaction action
                .click(item1)
                .click(item2)
                .click(item3)
                .click(item4)
                .keyUp(Keys.CONTROL)
                .build();
            builder.perform();
        
        
        
        
        
		
	}

}
