/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ABCassignment;

/**
 *
 * @author User
 */
public class Employee {
    public static int record;
    private String employeeId,employeeName,password,employeeStatus;
    public Employee(){
    }
    public Employee(String id,String name,String status,String pass){
        employeeId=id;
        employeeName=name;
        employeeStatus=status;
        password=pass;
        record++;
    }
    public String getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public String getPassword(){
        return password;
    }
    public String getEmployeeStatus(){
        return employeeStatus;
    }
    public String getAll(){
        return employeeId+" "+employeeName+" "+password+" "+employeeStatus;
    }
}
