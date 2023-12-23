/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sales;

import java.io.*;
public class ImportCustomerData {
    public static void main(String[] args) {
        String file = "src\\cust.csv";
BufferedReader reader = null;
String line = "";

try{
    reader = new BufferedReader(new FileReader(file));
    while((line = reader.readLine()) != null){
        String [] row = line.split(",");
        for(String index : row){
            System.out.printf("%-30s", index);
        }
        System.out.println("");
    }
}
catch(Exception e){
    e.printStackTrace();
}
finally{
    try{
       reader.close(); 
    }
    catch(Exception e){
        e.printStackTrace();
    }
}
    }
  
}
