package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFEvaluationWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_ONE {
	

	public static void main(String[] args) throws IOException  {
		


		FileInputStream file = new FileInputStream("C://Users//koran//Desktop//java//selinium//DDT_EXCEL/data3.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int Num_rows = sheet.getLastRowNum();
		int NUM_col = sheet.getRow(0).getLastCellNum();
		System.out.println(Num_rows);
		System.out.println(NUM_col);

		

	}

}
