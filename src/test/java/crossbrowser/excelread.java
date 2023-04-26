package crossbrowser;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excelread {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File f = new File(
				"C:\\Users\\leksh\\eclipse-workspace\\AutomationTesting\\src\\test\\java\\crossbrowser\\view.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheetAt(0);
		{
			for (Row row : sh) {
				for (Cell c : row) {
					switch (c.getCellType()) {
					case STRING:
						System.out.print(c.getStringCellValue() +" ");
						break;

					case NUMERIC:
						System.out.print(c.getNumericCellValue() + " ");
						break;

					case BOOLEAN:
						System.out.print(c.getBooleanCellValue() + " ");
						break;
					}
				}
			}

		}
		fis.close();
	}
}
