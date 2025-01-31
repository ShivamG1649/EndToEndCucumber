package SeleniumBasics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ScrollDemo
   {
       public static void main(String[] args)
       {
           WebDriver driver = new ChromeDriver();
           driver.get("https://automationtesting.co.uk/popups.html");
           driver.manage().window().maximize();

             // JavaScript Executor
//           JavascriptExecutor js =(JavascriptExecutor)driver;
//           js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

           // Scroll by using keyboard keys downKey for scroll down

           Actions actions = new Actions(driver);

           // Scroll down using the PAGE_DOWN key
           actions.sendKeys(Keys.ARROW_DOWN).perform();

           //

          driver.quit();
       }

   }
