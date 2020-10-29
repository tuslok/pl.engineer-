package utils;

import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;

public class ExcelUtils {

    static OPCPackage pkg;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    public ExcelUtils(String pkgPath, String sheetName){
        try {
            pkg = OPCPackage.open(new File(pkgPath));
            workbook = new XSSFWorkbook(pkg);
            sheet = workbook.getSheet(sheetName);
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.getCause();
            e.getStackTrace();
        }
    }


    public static int getRowCount(){
        int rowCount = 0;
        try{
            rowCount = sheet.getPhysicalNumberOfRows();
        } catch (Exception e){
        System.out.println(e.getMessage());
        e.getCause();
        e.getStackTrace();
            }
        return rowCount;
    }

    public static int getColumnCount(){
        int colCount = 0;
        try{
            colCount = sheet.getRow(0).getPhysicalNumberOfCells();
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.getCause();
            e.getStackTrace();
        }
        return colCount;
    }

    public static String getCellData(int rowNum, int colNum){
        String cellData = null;
        try{
            cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.getCause();
            e.getStackTrace();
        }
        return cellData;
    }
}
