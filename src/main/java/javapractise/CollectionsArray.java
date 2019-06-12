package javapractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsArray {

	public static void main(String[] args) {
		
		String val1 = "Val_App:ESF!UPS!IMSPROD!IMSAMD";
		String val2 = "Role1!Add~Role2!Remove~Role3!Add~Role4!Remove";
		String val3 = "User1~User2~User3~User4";
		
		
		for(int i=0;i<val1.split(":")[1].split("!").length;i++) {
			String va = val1.split(":")[0]+":"+val1.split(":")[1].split("!")[i];
			System.out.println(va.split(":")[0]+" "+va.split(":")[1]);
			//System.out.println(val1.split(":")[1].split("!")[i]);
			System.out.println(val2.split("~")[i]);
			System.out.println(val3.split("~")[i]);
		}
		
		
		/*
		

		String columnHeader = "Application:Operations:Value(s):Attributes";
		String columnValue = "BPS~BPS:Create~Remove:Role1!email@email.com!123456789~email1@email1.com!Role3!987654321:~ROLE Name";

		String columnHeaderGUI = "Application:Operations:Value(s):Attributes";
		String columnValueGUI = "BPS, Create, Role1!email@email.com!123456789";
		
		//BPS, Remove, email1@email1.com!Role3!987654321, ROLE Name
		
		Map<String,String> tblDetails = new HashMap<String,String>();

		if(columnHeader.split(":").length==columnValue.split(":").length) {
			for(int i=0;i<columnHeader.split(":").length;i++) {
				tblDetails.put(columnHeader.split(":")[i], columnValue.split(":")[i]);
			}
		}
		
		for(Map.Entry<String, String> entry :tblDetails.entrySet()) {
			System.out.println("Key - "+entry.getKey()+ " Value - "+entry.getValue());
		}
		
		System.out.println(tblDetails);
		
		String allColumnValue[] = columnValue.split(":");
		
		System.out.println("allColumnValue Array - "+Arrays.toString(allColumnValue));
		
		int index = 1;
		
		String afterColumnValue[] = new String[allColumnValue.length];
		
		for(int i=0;i<allColumnValue.length;i++) {
			afterColumnValue[i]= allColumnValue[i].split("~")[index];
		}
		
		System.out.println("After Column Seperate - "+Arrays.toString(afterColumnValue));
		
		for(int j=0;j<columnHeader.split(":").length;j++) {
			for(int k=0;k<columnValue.split(":").length;k++) {
				
			}
			
		}
		
		
	*/	
		
		
		
//		String value = tblDetails.get("Value(s)");
//		System.out.println(value);
//		String[][] result = to2dim(value, "~", "!");
//		int row =-1;
//		for(int i=0;i<result.length;i++) {
//			for(int j=0;j<result[i].length;j++) {
//				if(result[i][j].equals("Role3")) {
//					row=i;
//					if(row>=i) {
//						System.out.println(row);
//					}
//				}
//			}
//		}
	
//			String val = tblDetails.get("Operations").split("~")[row];
//			System.out.println("Value - "+val);
//	
	






	}

	public static String [][] to2dim (String source, String outerdelim, String innerdelim) {
		// outerdelim may be a group of characters
		String [] sOuter = source.split ("[" + outerdelim + "]"); 
		int size = sOuter.length;
		// one dimension of the array has to be known on declaration:
		String [][] result = new String [size][]; 
		int count = 0;
		for (String line : sOuter)
		{
			result [count] = line.split (innerdelim);
			++count;
		}
		return result;
	}

}
