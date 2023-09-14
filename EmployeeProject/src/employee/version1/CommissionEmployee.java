/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;

import java.util.Date;

/**
 *
 * @author User
 */
public class CommissionEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private double totalSales;
    
    public CommissionEmployee(int empID,String name,Date Hired,Date Birth,double totalSales){
        this.empID = empID;
        this.empName = name;
        this.empDateHired = Hired;
        this.empBirthDate = Birth;
        this.totalSales = totalSales;
    }
    public CommissionEmployee(int empID,String name,Date Hired,Date Birth){
        this.empID = empID;
        this.empName = name;
        this.empDateHired = Hired;
        this.empBirthDate = Birth;
    }
    
    public CommissionEmployee(){
        this.empID = 0;
        this.empName = "NULL";
        this.totalSales = 0;
        
    }
    
    public CommissionEmployee(CommissionEmployee Emp){
        this.empID = Emp.empID;
        this.empName = Emp.empName;
        this.empDateHired = Emp.empDateHired;
        this.empBirthDate = Emp.empBirthDate;
        this.totalSales = Emp.totalSales;
        
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

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    
    public double computeSalary(){
        double Salary = 0;
        if(this.totalSales >=500000){
            Salary += this.totalSales *0.5;
        }else if(this.totalSales >= 100000 && this.totalSales < 500000){
            Salary += this.totalSales *0.3;
        }else if(this.totalSales >= 50000 && this.totalSales < 100000){
            Salary += this.totalSales *0.2;
        }else{
            Salary += this.totalSales *0.05;
        }
        return Salary;
    }
    
    public void displayInfo(){
        System.out.println(String.format("%d - %s",this.empID,this.empName));
        System.out.println(String.format("Date Hired : %td,%tm,%ty\nDate of Birth: %td,%tm,%ty ",this.empDateHired,this.empDateHired,this.empDateHired,this.empBirthDate,this.empBirthDate,this.empBirthDate));
        System.out.println(String.format("Total Sales: %.2f",this.totalSales));
        System.out.println(String.format("Salary : %.2f",this.computeSalary()));
    }
    
    @Override
    public String toString() {
        return String.format("%d - %s\nDate Hired : %td,%tm,%ty\nDate of Birth: %td,%tm,%ty\nTotal Sales: %.0f",this.empID,this.empName,this.empDateHired,this.empDateHired,this.empDateHired,this.empBirthDate,this.empBirthDate,this.empBirthDate,this.totalSales);
    }
}
