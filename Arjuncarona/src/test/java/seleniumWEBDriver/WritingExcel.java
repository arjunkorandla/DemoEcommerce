package seleniumWEBDriver;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class WritingExcel {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("C://Users//koran//Desktop//java//selinium//DDT_EXCEL/inputfile.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("data");
        for (int r = 0; r<=5; r++) {

            XSSFRow rows = sheet.createRow(r);

            for (int c = 1; c < 5; c++)
            {
                rows.createCell(c).setCellValue("welcome");


            }
            System.out.println();
        }
        workbook.write(file);
    }
}
