package javapractise;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyAndMoveFile {

	public static void main(String[] args) {
	
	//copyMoveFile(sourceFileName, destFileName);

	}
	
	public static void copyMoveFile(String sourceFileName,String destFileName){
		
		FileSystem fileSys = FileSystems.getDefault();
		Path srcPath = fileSys.getPath(sourceFileName);
		Path destPath = fileSys.getPath(destFileName);
		try{
			//To Copy file from source to destination folder
			Files.copy(srcPath, destPath, StandardCopyOption.REPLACE_EXISTING);
			
			//To move file from source to destination folder
			Files.move(srcPath, destPath, StandardCopyOption.REPLACE_EXISTING);
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		
	}

}
