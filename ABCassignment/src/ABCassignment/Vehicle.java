/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABCassignment;

/**
 *
 * @author User
 */
public class Vehicle {
    public static int record;
    private String carPlate,carModel,acquirePrice,salesPrice,carStatus;
    public Vehicle(String carplate,String model,String aprice,String status,String sprice){
        carPlate=carplate;
        carModel=model;
        acquirePrice=aprice;
        carStatus=status;
        salesPrice=sprice;
        record++;
    }
    public String getCarPlate(){
        return carPlate;
    }
    public String getCarModel(){
        return carModel;
    }
    public String getAcquirePrice(){
        return acquirePrice;
    }
    public String getCarStatus(){
        return carStatus;
    }
    public String getSalesPrice(){
        return salesPrice;
    }
    public String getAll(){
        return carPlate+" "+carModel+" "+acquirePrice+" "+carStatus+" "+salesPrice;
    }
}
