/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABCassignment;

/**
 *
 * @author User
 */
public class Customer {
    public static int record;
    private String custId,custName,phoneNum,postcode;
    public Customer(){
    }
    public Customer(String id,String name,String phnum,String code){
        custId=id;
        custName=name;
        phoneNum=phnum;
        postcode=code;
        record++;
    }
    public String getCustId(){
        return custId;
    }
    public String getCustName(){
        return custName;
    }
    public String getPhoneNum(){
        return phoneNum;
    }
    public String getPostcode(){
        return postcode;
    }
    public String getAll(){
        return custId+" "+custName+" "+phoneNum+" "+postcode;
    }
}
