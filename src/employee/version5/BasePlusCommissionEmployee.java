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
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    
    public BasePlusCommissionEmployee(){
        super();
        this.baseSalary = 0;
    }
    
    public BasePlusCommissionEmployee(int empID,Name name,Date hired,Date birth,double totalSales,double base){
        super(empID,name,hired,birth,totalSales);
        this.baseSalary = base;
    }
    public BasePlusCommissionEmployee(int empID,String first,String middle,String last,Date hired,Date birth,double totalSales,double base){
        super(empID,first,middle,last,hired,birth,totalSales);
        this.baseSalary = base;
    }
    public BasePlusCommissionEmployee(BasePlusCommissionEmployee emp){
        super(emp.getEmpID(),emp.getEmpName(),emp.getEmpDateHired(),emp.getEmpBirthDate(),emp.getTotalSales());
        this.baseSalary = emp.baseSalary;
    }
    
    public double computeSalary(){
        
        double Salary = super.computeSalary();
        return Salary + baseSalary;
        
    }
    
    public void displayInfo(){
        super.displayInfo();
        System.out.println(String.format("BaseSalary = %.2f", this.baseSalary));
        
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nBase Salary: %.2f", this.baseSalary) ;
    }
    
    
}

