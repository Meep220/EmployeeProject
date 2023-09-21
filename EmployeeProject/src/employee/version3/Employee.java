/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version3;


import java.util.Date;

/**
 *
 * @author User
 */
public class Employee extends Name{
    private int empID;
    private Name empName;
    private Date empDateHired;
    private Date empBirthDate;
    
    
    public Employee(){
        empID = -1;
        empName = new Name();
        empDateHired = new Date(0,0,0);
        empBirthDate = new Date(0,0,0);
    }
    
    public Employee(int ID,String first,String middle,String last,Date hired,Date birth){
        empID = ID;
        empName = new Name(first,middle,last);
        empDateHired = hired;
        empBirthDate = birth;
    }
    
    public Employee(Employee emp){
        empID = emp.getEmpID();
        empName = emp.getEmpName();
        empDateHired = emp.getEmpDateHired();
        empBirthDate = emp.getEmpBirthDate();
    }
    
    
    public Employee(int ID,Name name,Date hired,Date birth){
        empID = ID;
        empName = new Name(name);
        empDateHired = hired;
        empBirthDate = birth;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
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
        System.out.println(String.format("%d",empID));
        displayFullName(this.getEmpName());
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
