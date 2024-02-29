package selfPractise;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.beust.jcommander.Strings;


public class ApachePoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(Arrays.deepToString(Array1()).toCharArray());
		
	}
	
	
	public static String[][] Array1(){
		
		File file= new File("C:\\New folder\\Excel2.xlsx");
		XSSFWorkbook wkbook;
		XSSFSheet sheet;
		String[][] s= new String[0][0];
		
		
		try {
			FileInputStream excel = new FileInputStream(file);
			wkbook = new XSSFWorkbook(excel);
			sheet = wkbook.getSheet("Sheet1");
			int start = sheet.getFirstRowNum();
			int end = sheet.getLastRowNum();
			s= new String[end-start+1][4];
			for(int i = start; i <= end; i++) {
				
				s[i][0] = sheet.getRow(i).getCell(0).getStringCellValue();
				s[i][1] = sheet.getRow(i).getCell(1).getStringCellValue();
				s[i][2] = sheet.getRow(i).getCell(2).getStringCellValue();
				s[i][3] = sheet.getRow(i).getCell(3).getStringCellValue();
				
				
			}
			
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return s;
		
		

}
/*public static Object[][] Array2(){
		
    File file= new File("C:\\New folder\\Excel2.xlsx");
		
	
	XSSFWorkbook wkbook;
	
	XSSFSheet sheet2;
	
	Object [][] arr2 = new Object[0][0];
	
	try {
		FileInputStream excel = new FileInputStream(file);
		wkbook = new XSSFWorkbook(excel);
		
		sheet2 = wkbook.getSheet("Sheet2");
		
		int startSecond = sheet2.getFirstRowNum();
		int endSecond = sheet2.getLastRowNum();
		
		
		arr2= new Object[endSecond-endSecond+1][4];
		for(int i = startSecond; i <= endSecond; i++) {
			arr2[i][0] = sheet2.getRow(i).getCell(0).getStringCellValue();
			arr2[i][1] = sheet2.getRow(i).getCell(1).getStringCellValue();
			arr2[i][2] = sheet2.getRow(i).getCell(2).getStringCellValue();
			arr2[i][3] = sheet2.getRow(i).getCell(3).getStringCellValue();
			
		}
		
	} catch(IOException e) {
		System.out.println(e.getMessage());
	}
	
	return arr2;

}*/
}
