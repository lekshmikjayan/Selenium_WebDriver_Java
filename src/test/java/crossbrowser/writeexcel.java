package crossbrowser;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeexcel {
	public static void main(String[] args) throws IOException {

		XSSFWorkbook w = new XSSFWorkbook();
		XSSFSheet s = w.createSheet("view");
		Row r2 = s.createRow(2);
		Cell c0 = r2.createCell(0);
		c0.setCellValue("Morning");

		Row r1 = s.createRow(1);
		Cell c3 = r1.createCell(3);
		c3.setCellValue("Have a good day");

		File f = new File(
				"C:\\Users\\leksh\\eclipse-workspace\\AutomationTesting\\src\\test\\java\\crossbrowser\\view.xlsx");
		FileOutputStream fs = new FileOutputStream(f);
		w.write(fs);
		fs.close();
		w.close();
		System.out.println("Misson accomplished");
	}

}
