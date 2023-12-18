/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fopassignment;

/**
 *
 * @author yhuas
 */
public class Employee {
    private String employeeId;
    private String employeeName;
    private int employeeStatus; // 0 for sales employee, 1 for management employee
    private String password;
    
    public Employee(String employeeId, String employeeName, int employeeStatus, String password) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeStatus = employeeStatus;
        this.password = password;
    }

    // Getter for employeeId
    public String getEmployeeId() {
        return employeeId;
    }

    // Setter for employeeId
    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // Getter for employeeName
    public String getEmployeeName() {
        return employeeName;
    }

    // Setter for employeeName
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Getter for employeeStatus
    public int getEmployeeStatus() {
        return employeeStatus;
    }

    // Setter for employeeStatus
    public void setEmployeeStatus(int employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }
}
