package TestNGDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CalDemo {
    WebDriver driver;
    @Test
    public void DatePicker() throws InterruptedException {
        driver = new EdgeDriver();
        driver.get("https://automationtesting.co.uk/datepicker.html");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='basicDate']")).click();

        String targetDate="2026-August-02";
        //  year / month // Day
       // use string Split method to

    String targetDate1[] = targetDate.split("-");
    String targetMonth = targetDate1[1];
    String targetYear=targetDate1[0];
    String targetDay=targetDate1[2];

    Thread.sleep(3000);

    // Enter the year

        // Find out the current month

     String currentMonth = driver.findElement(By.xpath("//span[@class='cur-month']")).getText().trim();


        driver.findElement(By.xpath("(//input[@class='numInput cur-year'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@class='numInput cur-year'])[1]")).sendKeys(targetYear);

 String[] months ={"january","February","March","April","May","June","July","August","September","October","November","December"};
 int currentMonthIndex=java.util.Arrays.asList(months).indexOf(currentMonth);
        int targetMonthIndex=java.util.Arrays.asList(months).indexOf(targetMonth);

        int diff=targetMonthIndex-currentMonthIndex;

        for(int i=1;i<=diff;i++){
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[@class='flatpickr-calendar hasTime animate arrowTop open']//span[@class='flatpickr-next-month']//*[name()='svg']")).click();
         Thread.sleep(2000);
        }

        System.out.println("debug");


        // day Selection


// Difference of the year
// Difference of the month from the current month

        //feb ->Aug
        //6












    }


}
