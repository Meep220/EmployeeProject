/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version5;




import java.util.Date;

/**
 *
 * @author User
 */
public class CommissionEmployee extends Employee{
    private double totalSales;
    
    public CommissionEmployee(){
        super();
        this.totalSales = 0;
    }
    public CommissionEmployee(int ID,Name name,Date hired,Date birth,double totalSales){
        super(ID,name,hired,birth);
        this.totalSales = totalSales;
    }
    public CommissionEmployee(int ID,String first,String middle,String last,Date hired,Date birth,double totalSales){
        super(ID,first,middle,last,hired,birth);
        this.totalSales = totalSales;
    }
    
    public CommissionEmployee(CommissionEmployee emp){
        super(emp.getEmpID(),emp.getEmpName(),emp.getEmpDateHired(),emp.getEmpBirthDate());
        this.totalSales = emp.totalSales;
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
        super.displayInfo();
        System.out.println(String.format("Total Sales: %.2f", this.totalSales));
        System.out.println(String.format("Salary: %.2f", computeSalary()));
    }
    
    
    
    @Override
    public String toString() {
        return super.toString() + String.format("\ntotalSales = %.2f", this.totalSales);
    }
    
    
    
}
