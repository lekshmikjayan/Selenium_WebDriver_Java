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

public class readexcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File f = new File(
				"C:\\Users\\leksh\\eclipse-workspace\\AutomationTesting\\src\\test\\java\\crossbrowser\\view.xlsx");
		FileInputStream fis = new FileInputStream(f);

		Workbook wr = WorkbookFactory.create(fis);
		Sheet st = wr.getSheetAt(0);
		Row r = st.getRow(2);
		Cell c = r.getCell(0);

		System.out.println(c);
		fis.close();
	}
}
