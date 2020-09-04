package seleniumWEBDriver;


import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelSheet1 {
    public static  void main(String[] args) throws IOException {



            FileInputStream file = new FileInputStream("C://Users//koran//Desktop//java//selinium//DDT_EXCEL/data3.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet("Sheet1");
            int Num_rows = sheet.getLastRowNum();
            int NUM_col = sheet.getRow(0).getLastCellNum();
            System.out.println(Num_rows);
            System.out.println(NUM_col);
            for (int r = 0;r<=Num_rows;r++)
            {
                    XSSFRow row = sheet.getRow(r);
                    for (int c =1;c<NUM_col;c++)
                    {
                            //XSSFCell cell = row.getCell(c);
                            //String value = cell.toString();

                            String value = row.getCell(c).toString();
                            System.out.print("    "+ value + "    ");
                    }
                    System.out.println();
            }
}}
