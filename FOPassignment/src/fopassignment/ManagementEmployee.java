/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fopassignment;

/**
 *
 * @author yhuas
 */
public class ManagementEmployee extends Employee {
    public ManagementEmployee(String employeeId, String employeeName, int employeeStatus, String password) {
        // Initialize attributes using the constructor of the parent class
        super(employeeId, employeeName, employeeStatus, password);
    }

    public void viewAllCustomerData() {
        ViewInfo.displayAllCustomerData();
    }

    public void viewAllSalesRecords() {
        ViewInfo.displayAllSalesRecords();
    }

    public void viewAllVehicleData() {
        ViewInfo.displayAllVehicleData();
    }

    public void viewAllEmployeeData() {
        ViewInfo.displayAllEmployeeData();
    }
}
