package javapractise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class ExcelRowCopy {

	//This Program will copy the rows in sheet 1 based on the number of times it is mentioned in sheet2 and paste it in a new excel

	public static void main(String[] args) throws IOException {
		long startTime = System.currentTimeMillis();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy_hh_mm_ss");
		String current_date = dateFormat.format(new Date()); //Setting the date Format to display the current date and time

		String path = System.getProperty("user.home")+"\\Desktop\\";
		String inputFilePath = path+"Sample_Data_RPA.xlsx";
		String outputFilePath = path+"Output_"+current_date+".xlsx";

		//This method will return the number rows in the input excel
		int count = ExcelRowCopy.excelRowCount(inputFilePath);

		//This method will return the data from sheet 1 based on the key as row number
		Multimap<Integer,String> sheet1Data = ExcelRowCopy.readExcelSheet1(inputFilePath);

		//To get the inputsheet name
		Collection<String> name = sheet1Data.get(-1);
		String inputSheetName = name.toArray()[0].toString();

		//This method will return the data from sheet 2 which has the details of which rows to be repeated , how many times
		Multimap<String, String> shee2Data = ExcelRowCopy.readExcelSheet2(inputFilePath);

		FileOutputStream output =new FileOutputStream(new File(outputFilePath));  //Open FileOutputStream to write updates
		XSSFWorkbook outputWB = new XSSFWorkbook();
		XSSFSheet OutputSheet = outputWB.createSheet(inputSheetName+"_"+current_date);

		int lastRow = 0;

		//This loop will read each row and column in sheet 1 and check the flag and number of times it should be repeated and write it in o/p excel
		for(int i=0;i<=count;i++) {
			String rowcol = "A"+(i+1); //This will store the Row and Column number eg - A2
			System.out.println(rowcol);

			if(shee2Data.containsKey(rowcol)==true) {
				Collection<String> values = shee2Data.get(rowcol); //Fetch the values by providing the key "A2" and fetch the values and store it in collections
				int repeat = Integer.parseInt(values.toArray()[0].toString()); //Store the number of times that row should be repeated
				String flag = values.toArray()[1].toString(); //store the flag whether that row should be repeated or not

				if(flag.equalsIgnoreCase("Yes")==true) 
				{
					//If the flag is "Yes" then fetch that row  and store it in collections and write it the number of times as it is mentioned in the sheet2
					Collection<String> data = sheet1Data.get(i);
					for(int m=0;m<(repeat+1);m++) {
						XSSFRow row = OutputSheet.createRow(lastRow);
						for(int f=0;f<data.size();f++) {
							XSSFCell col  = row.createCell(f);
							col.setCellValue(data.toArray()[f].toString());	
						}		
						lastRow++;
						FileOutputStream output_file =new FileOutputStream(new File(outputFilePath));  //Open FileOutputStream to write updates
						outputWB.write(output_file); //write changes
						output_file.close();  //close the stream    
						//System.out.println("Record No - "+(m+1)+" is written successfully in the output excel file");
					} 
				}else {
					//If the flag is "No" then fetch that row  and store it in collections and write it only once
					Collection<String> data = sheet1Data.get(i);
					XSSFRow row = OutputSheet.createRow(lastRow);
					for(int f=0;f<data.size();f++) {
						XSSFCell col  = row.createCell(f);
						col.setCellValue(data.toArray()[f].toString());	
					}
					lastRow++;
					FileOutputStream output_file =new FileOutputStream(new File(outputFilePath));  //Open FileOutputStream to write updates
					outputWB.write(output_file); //write changes
					output_file.close();  //close the stream    
				}

			}else {

				Collection<String> data = sheet1Data.get(i);
				XSSFRow row = OutputSheet.createRow(lastRow);
				for(int f=0;f<data.size();f++) {
					XSSFCell col  = row.createCell(f);
					col.setCellValue(data.toArray()[f].toString());	
				}	
				lastRow++;
				FileOutputStream output_file =new FileOutputStream(new File(outputFilePath));  //Open FileOutputStream to write updates
				outputWB.write(output_file); //write changes
				output_file.close();  //close the stream    	
			}
		}
		int outputRowCount = ExcelRowCopy.excelRowCount(outputFilePath);
		System.out.println("Total No of Records present in the output excel is - "+outputRowCount);
		long endTime   = System.currentTimeMillis();
		NumberFormat formatter = new DecimalFormat("#0.00000");
		System.out.print("Execution time is " + formatter.format((endTime - startTime) / 1000d) + " seconds");
	}


	public static int excelRowCount(String fileName) throws IOException {

		FileInputStream fis = new FileInputStream(new File(fileName)); //Read the spreadsheet that needs to be updated
		XSSFWorkbook workbook = new XSSFWorkbook(fis); //Access the workbook
		XSSFSheet sheet = workbook.getSheetAt(0); //Access the worksheet, so that we can update / modify it.
		int count = sheet.getLastRowNum();
		fis.close();	
		return count;
	}


	public static Multimap<Integer, String> readExcelSheet1(String fileName) throws IOException {
		FileInputStream fis = new FileInputStream(new File(fileName));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		DataFormatter format = new DataFormatter();
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		String sheetName = sheet.getSheetName();
		Multimap<Integer, String> map = ArrayListMultimap.create();
		map.put(-1, sheetName);
		for(int i=0;i<=rowCount;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<colCount;j++) {
				map.put(i, format.formatCellValue(row.getCell(j)));	
			}
		}
		fis.close();		
		return map;
	}


	public static Multimap<String, String> readExcelSheet2(String fileName) throws IOException {
		FileInputStream fis = new FileInputStream(new File(fileName));
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(1);
		DataFormatter format = new DataFormatter();
		int rowCount = sheet.getLastRowNum();
		Multimap<String, String> map = ArrayListMultimap.create();
		for(int i=3;i<rowCount+1;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=2;j<4;j++) {
				map.put(format.formatCellValue(row.getCell(1)), format.formatCellValue(row.getCell(j)));		
			}
		}
		fis.close();
		return map;
	}

}


