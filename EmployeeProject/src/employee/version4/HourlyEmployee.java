/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version4;


import employee.version3.*;
import java.util.Date;

/**
 *
 * @author User
 */
public class HourlyEmployee extends Employee{
    private float totalHoursWorked;
    private float ratePerHour;
    
    public HourlyEmployee(){
        super();
        totalHoursWorked = 0;
        ratePerHour = 0;
    }
    public HourlyEmployee(int ID,Name name,Date hired,Date birth,float totalHours,float rate){
        super(ID,name,hired,birth);
        this.totalHoursWorked = totalHours;
        this.ratePerHour = rate;
    }
    public HourlyEmployee(int ID,String first,String middle,String last,Date hired,Date birth,float totalHours,float rate){
        super(ID,first,middle,last,hired,birth);
        this.totalHoursWorked = totalHours;
        this.ratePerHour = rate;
    }
    public HourlyEmployee(HourlyEmployee emp){
        super(emp.getEmpID(),emp.getEmpName(),emp.getEmpDateHired(),emp.getEmpBirthDate());
        this.totalHoursWorked = emp.totalHoursWorked;
        this.ratePerHour = emp.ratePerHour;
    }
    
    public float computeSalary(){
        float Salary = 0;
        for(int i = 0;i < 40;i++){
            Salary += (1*this.ratePerHour);
            this.totalHoursWorked--;
        }
        if(this.totalHoursWorked >0){
            for(;this.totalHoursWorked>0;this.totalHoursWorked--){
                Salary += (ratePerHour *1.5);
            }
        }
        return Salary;
    }
    
    public void displayInfo(){
        super.displayInfo();
        System.out.println(String.format("Total hours worked: %.2f\nPay rate: %.2f",this.totalHoursWorked,this.ratePerHour));
        System.out.println(String.format("Salary: %.2f",this.computeSalary()));
    }
    
    
    @Override
    public String toString() {
        return String.format("%d - %s\nDate Hired : %td,%tm,%ty\nDate of Birth: %td,%tm,%ty\nTotal Hours: %.0f\nPayRate: %.2f"
                ,super.getEmpID(),super.getEmpName(),super.getEmpDateHired(),super.getEmpDateHired(),super.getEmpDateHired()
                ,super.getEmpBirthDate(),super.getEmpBirthDate(),super.getEmpBirthDate()
                ,this.totalHoursWorked,this.ratePerHour);
    }
    
    
}
