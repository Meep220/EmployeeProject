/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version5;

import java.util.ArrayList;


/**
 *
 * @author User
 */
public class EmployeeRoster {
    private ArrayList<Employee> empList;
    private final String allFormat = "%-6s | %-60s | %-30s | %-10s ";
    private final String displayFormat = "%-6s | %-60s | %-30s ";
    
    public EmployeeRoster(){
        empList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }
    
    public void displayAllEmployees(){
        System.out.println(String.format(allFormat, "id","Name","Type","Salary"));
        for(Employee emp: empList ){
            System.out.println(String.format(allFormat,
                  ""+  emp.getEmpID(),emp.getEmpName(),""+emp.getClass().getSimpleName(),getSalary(emp)));
        }
    }
    
    public void addEmployee(Employee emp){
       empList.add(emp);
    }
    
    public int countEmpType(String key){
        int counter = 0;
        for(Employee emp: empList){
            if(this.checkInstance(emp, key)){
                counter++;
            }
        }
        return counter;
        
    }
    
    public void displayEmpType(String key){
        for(Employee emp : empList){
            if(this.checkInstance(emp, key)){
                System.out.println(String.format(allFormat, ""+emp.getEmpID(),emp.getEmpName(),emp.getClass().getSimpleName(),""+this.getSalary(emp)));
            }
        }
    }
        
    public Employee removeEmployee(int id){
        for(Employee emp : empList){
            if(emp.getEmpID() == id){
                empList.remove(emp);
                return emp;
            }
        }
        return null;
    }
    
    public EmployeeRoster searchEmployee(String keyword){
        EmployeeRoster result = new EmployeeRoster();
        for(Employee emp : empList){
            if(emp.getEmpName().toString().toLowerCase().contains(keyword.toLowerCase())){
                result.addEmployee(emp);
            }else{
                if(this.checkInstance(emp, keyword)){
                    System.out.println(String.format(displayFormat, emp.getEmpID(),emp.getEmpName(),emp.getClass().getSimpleName()));
                }
            }
        }
        return result;
    }
    
    public double getSalary(Employee emp){
        double Salary = 0;
        if(emp instanceof HourlyEmployee HEmployee){
            Salary = HEmployee.computeSalary();
            return Salary;
        }else if(emp instanceof PieceWorkerEmployee PWEmployee){
            Salary = PWEmployee.computeSalary();
            return Salary;
        }else if(emp instanceof CommissionEmployee CEmployee){
            Salary = CEmployee.computeSalary();
            return Salary;
        }else if(emp instanceof BasePlusCommissionEmployee BPCEmployee){
            Salary = BPCEmployee.computeSalary();
            return Salary;
        }
            
        return Salary;
    }
    
    public void updateEmployee(int id, Name name){
        for(Employee emp : empList){
            if (emp.getEmpID() == id){
               emp.setEmpName(name);
            }
        }
    }
    
    public boolean checkInstance(Employee emp, String key){
        boolean check;
        switch (key){
            case "HE","HourlyEmployee" -> check = (emp instanceof HourlyEmployee);
            case "PWE","PieceWorkerEmployee" -> check = (emp instanceof PieceWorkerEmployee);
            case "CE","CommissionEmployee" -> check = (emp instanceof CommissionEmployee);
            case "BPCE","BasePlusCommissionEmployee" -> check = (emp instanceof BasePlusCommissionEmployee);
            default -> check = false;
        }
        return check;
    }
}
