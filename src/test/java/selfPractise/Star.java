package selfPractise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Star {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub

	// Compare values of two sheet
		
		File f= new File("C:\\New folder\\Excel2.xlsx");
		
		FileInputStream file= new FileInputStream(f);
		XSSFWorkbook wb= new XSSFWorkbook(file);
		XSSFSheet sh=wb.getSheet("Sheet1");
		XSSFSheet sh1=wb.getSheet("Sheet2");
		if(compareSheet( sh,  sh1)) {
			System.out.println("rows  equal");
		}else {
			System.out.println("rows not equal");
		}
		
		}
		
	public static boolean compareSheet(XSSFSheet sh, XSSFSheet sh1) {
		
		
		int start=sh.getFirstRowNum();
		int last=sh.getLastRowNum();
		boolean compare=true;
		
		for(int i=start;i<=last; i++) {
			
			XSSFRow r1=sh.getRow(i);
			XSSFRow r2=sh1.getRow(i);
			
			if(!compareTwoRows(r1,r2)) {
				
				System.out.println("row not equal" + i);
				compare=false;
				break;
			}else {
				System.out.println("row  equal" + i);
			}
		}
		
		return compare;
		
	}

	private static boolean compareTwoRows(XSSFRow r1, XSSFRow r2) {
		// TODO Auto-generated method stub
		return false;
	}
	}

		
	


