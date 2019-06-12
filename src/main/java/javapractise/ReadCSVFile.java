package javapractise;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class ReadCSVFile {

	public static void main(String[] args) {
			

	}
	
	public String readCSVFile(String fileName){
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		String[] lang = null;
		String preLang = null;
			
		try{
			br= new BufferedReader(new FileReader(fileName));
			while((line=br.readLine())!=null){
				//use comma as separator
				lang=line.split(cvsSplitBy);
			}
			String pref = lang[19];
			int len = pref.length()-1;
			preLang = (String)pref.subSequence(1, len);			
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException iOE){
			iOE.printStackTrace();
		}finally{
			if(br!=null)
			{
				try{
					br.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		return preLang;
	}

}
