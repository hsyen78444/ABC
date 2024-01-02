/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABCassignment;

/**
 *
 * @author User
 */
public class Sales {
    public static int record=0;
    private String salesId,dateTime,carPlate,custId,employeeId;
    public Sales(String sid,String datetime,String carplate,String cid,String eid){
        salesId=sid;
        dateTime=datetime;
        carPlate=carplate;
        custId=cid;
        employeeId=eid;
        record++;
    }
    public String getEmployeeId(){
        return employeeId;
    }
    public String getDateTime(){
        return dateTime;
    }
    public String getCarPlate(){
        return carPlate;
    }
    public String getCustId(){
        return custId;
    }
    public String getSalesId(){
        return salesId;
    }
    public String getAll(){
        return salesId+" "+dateTime+" "+carPlate+" "+custId+" "+employeeId;
    }
}
