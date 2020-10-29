package utils;

import org.testng.annotations.DataProvider;

public class ExcelDataProvider {

    @DataProvider(name = "myTestDataProvider")
    public Object[][] getTestData(){
        String excelPath = "C:\\Users\\Uzytkownik\\IdeaProjects\\pl.engineer-\\src\\test\\java\\excel\\TestData.xlsx";
        Object data[][] = testData(excelPath, "Sheet1");
        return data;
    }

    public Object[][] testData(String pkgPath, String sheetName){
        ExcelUtils excelUtils = new ExcelUtils(pkgPath, sheetName);

        int rowNum = excelUtils.getRowCount();
        int colNum = excelUtils.getColumnCount();

        Object loginData[][] = new Object[rowNum-1][colNum];

        for(int i = 1; i<rowNum; i++){
            for (int j = 0; j < colNum; j++){
                String cellData = excelUtils.getCellData(i,j);
                loginData[i-1][j] = cellData;
            }
        }
        return loginData;
    }

}
