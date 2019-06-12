package javapractise;

import java.io.*;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.filefilter.WildcardFileFilter;

public class FolderCreation {

	public static void main(String[] args) {

	//This program is to move the movie files to a new folder that is created with the same file name
		
	
	String path = System.getProperty("user.home")+"\\downloads";
	FileFilter filter = new WildcardFileFilter("*.srt");
	File[] files = new File(path).listFiles(filter);
		
	for(File fl : files)
	{
	if(fl.isFile()){
		String flNameWoExt = FilenameUtils.removeExtension(fl.getName());
		new File(path+"\\"+flNameWoExt).mkdirs();
		fl.renameTo(new File(path+"\\"+flNameWoExt+"\\"+fl.getName()));
	}
	}
	
	System.out.println("Finished");

	}

}
