/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version2;

import java.util.Date;

/**
 *
 * @author User
 */
public class Employee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    
    public Employee(){
        empID = -1;
        empName = "NULL";
        empDateHired = new Date(0,0,0);
        empBirthDate = new Date(0,0,0);
    }
    
    public Employee(int ID,String name,Date hired,Date birth){
        empID = ID;
        empName = name;
        empDateHired = hired;
        empBirthDate = birth;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(Date empDateHired) {
        this.empDateHired = empDateHired;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }
    
    
    public void displayInfo(){
        System.out.println(String.format("%d - %s",empID,empName));
        System.out.println(String.format("Date Hired : %td,%tm,%ty\nDate of Birth: %td,%tm,%ty "
                ,empDateHired,empDateHired,empDateHired,empBirthDate,empBirthDate,empBirthDate));
    }

    @Override
    public String toString() {
        return String.format("%d - %s\nDate Hired: %td-%tm-%ty\nDate of Birth: %td-%tm-%ty",
                empID,empName,empDateHired,empDateHired,empDateHired,
                empBirthDate,empBirthDate,empBirthDate);
    }
    
    
    
}
