/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version6;

import java.util.Date;

/**
 *
 * @author User
 */
public class EmployeeProject {
    
    public static void main(String[] args){
        
        
        Date birth = new Date(2003,8,6);
        Date hired = new Date();
        Name fullName = new Name("Rey","Laurence","Capoy");
        Name fullName2 = new Name("Matthew","Cedric","Calaycay");
        
        EmployeeRoster roster = new EmployeeRoster();
        EmployeeRoster search = new EmployeeRoster();
        
        
        HourlyEmployee emp = new HourlyEmployee(1,"Rey","Laurence","Capoy",hired,birth,50,2);
//        System.out.println(emp.toString());
//        emp.displayInfo();
//        System.out.println(String.format("Salary : %.2f",emp.computeSalary()));
        
        PieceWorkerEmployee emp2 = new PieceWorkerEmployee(2,fullName,hired,birth,45,2);
//        emp2.displayInfo();
//        System.out.println(emp2.toString());
        
        CommissionEmployee emp3 = new CommissionEmployee(3,fullName,hired,birth,200000);
//        emp3.displayInfo();
//        System.out.println(emp3.toString());
        
        BasePlusCommissionEmployee emp4 = new BasePlusCommissionEmployee(4,fullName,hired,birth,200000,2);
//        emp4.displayInfo();
//        System.out.println(emp4.toString());
        
//        roster.displayAllEmployees();
        roster.addEmployee(emp);
//        roster.displayAllEmployees();
        roster.addEmployee(emp2);
        roster.addEmployee(emp3);
        roster.addEmployee(emp4);
        roster.displayAllEmployees();
        roster.removeEmployee(2);
        roster.displayAllEmployees();
        System.out.println(String.format("No. Of Hourly Employees : %d",roster.countEmpType("HE")));
        Employee emp5 = new HourlyEmployee();
        Employee emp6 = new HourlyEmployee();
        roster.addEmployee(emp5);
        roster.addEmployee(emp6);      
        System.out.println(String.format("No. Of Hourly Employees : %d",roster.countEmpType("HE")));
        roster.displayEmpType("HourlyEmployee");
        roster.displayAllEmployees();
        search = roster.searchEmployee("Rey");
        search.displayAllEmployees();
        roster.updateEmployee(1, fullName2);
        roster.displayAllEmployees();
    }
    
}
