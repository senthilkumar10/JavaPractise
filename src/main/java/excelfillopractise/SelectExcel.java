package excelfillopractise;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

import java.util.ArrayList;

public class SelectExcel {

    public static void main(String[] args) throws FilloException {

        Fillo fillo = new Fillo();
        Connection connection = fillo.getConnection("./src/main/resources/EMP.xlsx");

        String strQuery = "Select * from EMPDetails";
        Recordset rs = connection.executeQuery(strQuery);

        //Get all the field Names
        ArrayList<String> fieldNames = rs.getFieldNames();

        //Print the total excel values
        while(rs.next()){
            System.out.println(
                    rs.getField(fieldNames.get(0))+" | "+ rs.getField(fieldNames.get(1))+" | "+
                            rs.getField(fieldNames.get(2))+" | "+rs.getField(fieldNames.get(3))+" | "
            );
        }


        //Print the total rows count

        System.out.println("\nTotal No of rows in excel : "+rs.getCount());



        rs.close();
        connection.close();

    }

}
