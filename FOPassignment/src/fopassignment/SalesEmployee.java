/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fopassignment;

/**
 *
 * @author yhuas
 */
public class SalesEmployee extends Employee {
    public SalesEmployee(String employeeId, String employeeName, int employeeStatus, String password) {
        // Initialize attributes using the constructor of the parent class
        super(employeeId, employeeName, employeeStatus, password);
    }

    public void viewOwnCustomerData() {
        ViewInfo.displayOwnCustomerData(getEmployeeId());
    }

    public void viewOwnSalesRecords() {
        ViewInfo.displayOwnSalesRecords(getEmployeeId());
    }

    public void viewAllVehicleData() {
        ViewInfo.displayAllVehicleData();
    }
}
