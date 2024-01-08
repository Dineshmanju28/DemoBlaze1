package genericlibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class fileUtility {
	
	public static void main(String[] args) {
		try {
			System.out.println(getproperty("password"));
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //catch (IOException e) {
			// TODO Auto-generated catch block
	         //e.printStackTrace();
		}
	

	public static String getproperty(String key)  {
		
		FileInputStream file=null;
		try {
			file = new FileInputStream("./src/test/resources/commondata.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties p=new Properties();
		
		try {
			p.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return p.getProperty(key);
	}}

/*
public static String readCellDataFromExcel () throws IOException, EncryptedDocumentException {
	
	// Get the java representation of object of the excel file
	FileInputStream fis= new FileInputStream("./Resources/testdata.xlsx");
	
	// Get the Workbook
	Workbook book= WorkbookFactory.create(fis);
	
	// Get the Sheet from Workbook
	Sheet sheet= book.getSheet("register");
	
	// Get the row from sheet 
	Row	row= sheet.getRow(6);
		
	// Get the cell from selected row
	System.out.println(row.getCell(4));
	

	
	// Read the data from cell using method chaining
//	return WorkbookFactory.create(fis).getSheet("register").getRow(row).getCell(cell).toString();
	
}



// Read the data from Excel row by row
public static String readRowDataFromExcel () throws IOException, EncryptedDocumentException {

	// Get the java representation of object of the excel file
	FileInputStream fis= new FileInputStream("./Resources/testdata.xlsx");

	// Get the Workbook
	Workbook book= WorkbookFactory.create(fis);
	
	// Get the Sheet
	Sheet sheet= book.getSheet("sheetName");
	
	// Get the count of rows having value
	int	rowCount = sheet.getPhysicalNumberOfRows();

	// Get the count of cells having value
	int	cellCount = sheet.getPhysicalNumberOfCells();

	//Create 2 dimensional array
	String [][] data = new String [rowCount-1][cellCount];
	
	// Read the data from Excel & store inside 2 dimensional array
	for(int i = 1; i < rowCount; i++) {
		for (int j = 0; j < cellCount; j++) {
			data[i-1][j] = Sheet.getRow(i).getCell(j).toString();
			 
			return data ()  ;
		}
	
*/