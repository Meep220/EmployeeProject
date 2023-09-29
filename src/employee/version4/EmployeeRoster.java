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
    private final String allFormat = "%-6s | %-60s | %-30s | %-10s ";
    private final String displayFormat = "%-6s | %-60s | %-30s ";
    public EmployeeRoster(){
        this.size = 10;
        this.empList = new Employee[size];
        this.count = 0;
        
    }
    
    public EmployeeRoster(int maxSize){
        this.size = maxSize;
        this.empList = new Employee[maxSize];
        this.count = 0;
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
        System.out.println(String.format(allFormat, "id","Name","Type","Salary"));
        for(int x = 0; x < this.count;x++){
            System.out.println(String.format(allFormat,
                  ""+  empList[x].getEmpID(),empList[x].getEmpName(),""+empList[x].getClass().getSimpleName(),getSalary(empList[x])));
        }
    }
    
    public boolean addEmployee(Employee emp){
       empList[count] = emp;
       if(this.empList[count]!= null) {
           count++;
           return true;
       }
       return false;
    }
    
    public int countEmpType(String key){
        int counter = 0;
        boolean isType = false;
        for(int ndx = 0;ndx < count;ndx++){
            switch (key) {
                case "HourlyEmployee","HE" -> isType = empList[ndx] instanceof HourlyEmployee;
                case "PieceWorkerEmployee","PWE" ->isType = empList[ndx] instanceof PieceWorkerEmployee;
                case "CommissionEmployee","CE" -> isType = empList[ndx] instanceof CommissionEmployee;
                case "BasePlusCommissionEmployee","BPCE" -> isType = empList[ndx] instanceof BasePlusCommissionEmployee;
                default ->{}
            }
            if(isType == true){
                counter++;
                isType = false;
            }
        }
        return counter;
        
    }
    
    public void displayEmpType(String key){
        switch (key){
            case "HE","HourlyEmployee"->{
                for(int ndx = 0; ndx < count; ndx++ ){
                    if(empList[ndx] instanceof HourlyEmployee){
                        System.out.println(String.format(displayFormat,empList[ndx].getEmpID()
                                ,empList[ndx].getEmpName(),""+empList[ndx].getClass().getSimpleName()));
                    }
                }
            }
            case "PWE","PieceWorkerEmployee" ->{
                for(int ndx = 0; ndx < count; ndx++ ){
                    if(empList[ndx] instanceof PieceWorkerEmployee){
                        System.out.println(String.format(displayFormat,empList[ndx].getEmpID()
                                ,empList[ndx].getEmpName(),""+empList[ndx].getClass().getSimpleName()));
                    }
                }
            }
            case "CE", "CommissionEmployee" ->{
                for(int ndx = 0; ndx < count; ndx++ ){
                    if(empList[ndx] instanceof PieceWorkerEmployee){
                        System.out.println(String.format(displayFormat,empList[ndx].getEmpID()
                                ,empList[ndx].getEmpName(),""+empList[ndx].getClass().getSimpleName()));
                    }
                }    
            }
            case "BPCE" ,"BasePlusCommissionEmployee" ->{
                for(int ndx = 0; ndx < count; ndx++ ){
                    if(empList[ndx] instanceof PieceWorkerEmployee){
                        System.out.println(String.format(displayFormat,empList[ndx].getEmpID()
                                ,empList[ndx].getEmpName(),""+empList[ndx].getClass().getSimpleName()));
                    }
                } 
            }  
            default ->{}
        }
    }
        
    public Employee removeEmployee(int id){
        Employee removed = null;
        int removing = 0;
        for(int ndx = 0;ndx < count;ndx++){
            if((empList[ndx].getEmpID()) == id){
                removed = empList[ndx];
                removing = 1;
            }
            if(removing == 1){
                empList[ndx] = empList[ndx+1];
            }
        }
        count--;
        return removed;
    }
    
    public EmployeeRoster searchEmployee(String keyword){
        EmployeeRoster result = new EmployeeRoster(size);
        for(int ndx = 0; ndx < count;ndx++){
            if(empList[ndx].getEmpName().toString().toLowerCase().contains(keyword.toLowerCase())){
                result.addEmployee(empList[ndx]);
            }else{
                switch (keyword){
                    case "HE", "HourlyEmployee" -> {if(empList[ndx] instanceof HourlyEmployee){result.addEmployee(empList[ndx]);}}
                    case "PWE","PieceWorkerEmployee" -> {if(empList[ndx] instanceof PieceWorkerEmployee){result.addEmployee(empList[ndx]);}}
                    case "CE" , "CommissionEmployee" -> {if(empList[ndx] instanceof CommissionEmployee){result.addEmployee(empList[ndx]);}}
                    case "BPCE", "BasePlusCommissionEmployee" ->{if(empList[ndx] instanceof BasePlusCommissionEmployee){result.addEmployee(empList[ndx]);}}
                    default -> {}
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
        for(int ndx = 0;ndx < count;ndx++){
            if (empList[ndx].getEmpID() == id){
               empList[ndx].setEmpName(name);
            }
        }
    }
}
