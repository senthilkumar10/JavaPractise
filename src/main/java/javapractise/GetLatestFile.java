package javapractise;

import java.io.*;
import java.util.Arrays;

import org.apache.commons.io.filefilter.WildcardFileFilter;


public class GetLatestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static File getTheNewestFile(String filePath, String fileName, String ext){
		
		File theNewestFile = null;
		File dir = new File(filePath);
		FileFilter fileFilter = new WildcardFileFilter(fileName+ext);
		File[] files = dir.listFiles(fileFilter);
		
		if(files.length>0){
			//Arrays.sort(files, LastModifiedFileComparator.LastModified_REVERSE );
			theNewestFile = files[0];
			
		}
		
		return theNewestFile;
		
	}

}
