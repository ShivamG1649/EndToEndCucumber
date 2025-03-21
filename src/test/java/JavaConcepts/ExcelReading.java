/*
1) OOPS






 */

package JavaConcepts;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReading {

    public static void main(String[] args) throws IOException {

//        System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();

        // Read data from Excel

        FileInputStream
                fis = new FileInputStream(new File("src\\test\\resources\\Data\\Sheet1.xlsx"));
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet1 = workbook.getSheetAt(0);
        Row row = sheet1.getRow(1); // Read second row (index starts from 0)
        String username = row.getCell(0).getStringCellValue();
        String password = row.getCell(1).getStringCellValue();

    }
}
