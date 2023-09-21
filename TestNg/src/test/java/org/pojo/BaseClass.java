package org.pojo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void launchChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public static void launchURL(String url) {
		driver.get(url);
	}
	
	public static void sendValues(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	public static void clickElement(WebElement element) {
		element.click();
	}
	
    public static void getDataFromExcel(String location,String sheet,int rowInd,int cellInd) throws IOException  {
		
    	
    	File f = new File(location);
    	FileInputStream fin = new FileInputStream(f);
    	
    	
    	Workbook book = new XSSFWorkbook(fin);
        Sheet s = book.getSheet(sheet);
        
        Row r = s.getRow(rowInd);
        Cell cell = r.getCell(cellInd);
        int type = cell.getCellType();
        
        String name =" ";
        
        if (type==1) {
        	 name = cell.getStringCellValue();
        	 System.out.println(name);
		}
        else if (DateUtil.isCellDateFormatted(cell)) {
			Date d = cell.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
			name = sim.format(d);
			System.out.println(name);
		} 
        else {
			double d = cell.getNumericCellValue();
			long l = (long)d;
			name = String.valueOf(l);
			System.out.println(name);
		}
        
	}
	

}
