package crossbrowser;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {
	public static void main(String[] args) throws IOException {

		XSSFWorkbook wk = new XSSFWorkbook();
		XSSFSheet s1 = wk.createSheet("List");
		Row r0 = s1.createRow(0);// row number 0 is 1st row
		Cell c0 = r0.createCell(0);
		c0.setCellValue("Name");

		Cell c1 = r0.createCell(1);
		c1.setCellValue("age");

		Row r1 = s1.createRow(1);
		Cell c02 = r1.createCell(0);
		c02.setCellValue("Lekshmi");

		Cell c03 = r1.createCell(1);
		c03.setCellValue("25");

		File f = new File(
				"C:\\Users\\leksh\\eclipse-workspace\\AutomationTesting\\src\\test\\java\\crossbrowser\\details.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		wk.write(fos);
		fos.close();
		wk.close();

		System.out.println("Success..!!!!!!!!!");
	}
}
