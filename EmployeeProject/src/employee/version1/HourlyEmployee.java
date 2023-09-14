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
public class HourlyEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private float totalHoursWorked;
    private float ratePerHour;
    
    public HourlyEmployee(int empID,String name,Date Hired,Date Birth,float totalHoursWorked,float ratePerHour){
        this.empID = empID;
        this.empName = name;
        this.empDateHired = Hired;
        this.empBirthDate = Birth;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    public HourlyEmployee(int empID,String name,Date Hired,Date Birth){
        this.empID = empID;
        this.empName = name;
        this.empDateHired = Hired;
        this.empBirthDate = Birth;
    }
    
    public HourlyEmployee(){
        this.empID = 0;
        this.empName = "NULL";
        this.empDateHired = new Date(0,0,0);
        this.empBirthDate = new Date(0,0,0);
        this.totalHoursWorked = 0;
        this.ratePerHour = 0;
    }
    
    public HourlyEmployee(HourlyEmployee Emp){
        this.empID = Emp.empID;
        this.empName = Emp.empName;
        this.empDateHired = Emp.empDateHired;
        this.empBirthDate = Emp.empBirthDate;
        this.totalHoursWorked = Emp.totalHoursWorked;
        this.ratePerHour = Emp.ratePerHour;
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

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }
    
    public double computeSalary(){
        int hoursWorked = 0;
        double Salary;
        for(int i = 0;i < 40;i++){
            hoursWorked +=1;
            this.totalHoursWorked--;
        }
        Salary = hoursWorked*this.ratePerHour;
        if(this.totalHoursWorked >0){
            for(;this.totalHoursWorked>0;this.totalHoursWorked--){
                Salary += (ratePerHour *1.5);
            }
        }
        return Salary;
    }
    
    public void displayInfo(){
        System.out.println(String.format("%d - %s",this.empID,this.empName));
        System.out.println(String.format("Date Hired : %td,%tm,%ty\nDate of Birth: %td,%tm,%ty ",this.empDateHired,this.empDateHired,this.empDateHired,this.empBirthDate,this.empBirthDate,this.empBirthDate));
        System.out.println(String.format("Total Hours: %.0f\nPayRate: %.2f",this.totalHoursWorked,this.ratePerHour));
        System.out.println(String.format("Salary : %2f",this.computeSalary()));
    }

    @Override
    public String toString() {
        return String.format("%d - %s\nDate Hired : %td,%tm,%ty\nDate of Birth: %td,%tm,%ty\nTotal Hours: %.0f\nPayRate: %.2f",this.empID,this.empName,this.empDateHired,this.empDateHired,this.empDateHired,this.empBirthDate,this.empBirthDate,this.empBirthDate,this.totalHoursWorked,this.ratePerHour);
    }
    
    
    
    
}
