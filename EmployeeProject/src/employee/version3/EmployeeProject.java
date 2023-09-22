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
public class EmployeeProject {
    
    public static void main(String[] args){
        
        
        Date birth = new Date(2003,8,6);
        Date hired = new Date();
        Name fullName = new Name("Rey","Laurence","Capoy","Almighty","True","Son","God","Venerated","Omnipotent");
        
        HourlyEmployee emp = new HourlyEmployee(1,"Rey","Laurence","Capoy",hired,birth,50,2);
        System.out.println(emp.toString());
        emp.displayInfo();
        System.out.println(String.format("Salary : %.2f",emp.computeSalary()));
        
        PieceWorkerEmployee emp2 = new PieceWorkerEmployee(2,fullName,hired,birth,45,2);
        emp2.displayInfo();
        System.out.println(emp2.toString());
        
        CommissionEmployee emp3 = new CommissionEmployee(3,fullName,hired,birth,200000);
        emp3.displayInfo();
        System.out.println(emp3.toString());
        
        BasePlusCommissionEmployee emp4 = new BasePlusCommissionEmployee(4,fullName,hired,birth,200000,2);
        emp4.displayInfo();
        System.out.println(emp4.toString());
        
    }
    
}
