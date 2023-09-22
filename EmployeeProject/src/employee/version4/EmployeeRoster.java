/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version4;

/**
 *
 * @author User
 */
public class EmployeeRoster {
    private Employee[] empList;
    private int count;
    private int size;
    
    public EmployeeRoster(){
        this.count = 0;
        this.size = 10;
    }
    
    public EmployeeRoster(int maxSize){
        this.count = 0;
        this.size = maxSize;
    }

    public Employee[] getEmpList() {
        return empList;
    }

    public void setEmpList(Employee[] empList) {
        this.empList = empList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public void displayAllEmployees(){
        System.out.println("id\t|\t\tName\t\t|\ttype\t   |\tSalary");
    }
    
    
    
    
}
