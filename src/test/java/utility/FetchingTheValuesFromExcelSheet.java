package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.edge.EdgeDriver;

public class FetchingTheValuesFromExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fs = new FileInputStream(
				"D:\\SARASVATI\\AutomationTestingByMKT\\Amazon_POM\\ExcelSheet1\\Saras Doc.xlsx");

		Workbook wb = WorkbookFactory.create(fs);

		Sheet s1 = wb.getSheet("Login");
		Row r1 = s1.getRow(1);
		Cell c1 = r1.getCell(0);

		String username1 = c1.getStringCellValue();
		System.out.println("Username 1 :" + username1); // username

		String password1 = wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue(); // password

		System.out.println("Password 1: " + password1);
		
		EdgeDriver driver= new EdgeDriver();
		driver.manage().window().maximize();


	}

}
