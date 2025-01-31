package SeleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertHandlingDemo
{
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationtesting.co.uk/popups.html");
        driver.findElement(By.xpath("//button[@onclick='alertTrigger()']")).click();

        // Switch to alert and accept it
        Alert alert =driver.switchTo().alert();
        String alertMessage=  alert.getText();
        String expectedAlertMessage ="You have triggered the alert!";
        Assert.assertEquals(alertMessage,expectedAlertMessage);
        driver.quit();

    }
}
