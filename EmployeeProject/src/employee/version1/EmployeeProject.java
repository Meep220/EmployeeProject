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
public class EmployeeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date hired = new Date(2023,8,8);
        Date Birth = new Date(2003,8,6);
        
        HourlyEmployee emp = new HourlyEmployee(1,"Rey",hired,Birth,40,1);
        emp.displayInfo();
        System.out.println(emp.toString());
        PieceWorkerEmployee Pemp = new PieceWorkerEmployee(1,"Rey",hired,Birth,140,1);
        Pemp.displayInfo();
        System.out.println(Pemp.toString());
        
        CommissionEmployee Cemp = new CommissionEmployee(1,"Rey",hired,Birth,1);
        Cemp.displayInfo();
        
        BasePlusCommissionEmployee BPCemp = new BasePlusCommissionEmployee(1,"Rey",hired,Birth,100000,1);
        BPCemp.displayInfo();
        
    }
    
}
