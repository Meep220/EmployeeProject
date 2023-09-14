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
public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private Date empDateHired;
    private Date empBirthDate;
    private int totalPiecesFinished;
    private float ratePerPiece;
    
    public PieceWorkerEmployee(int empID,String name,Date Hired,Date Birth,int totalPiecesFinished,float ratePerPiece){
        this.empID = empID;
        this.empName = name;
        this.empDateHired = Hired;
        this.empBirthDate = Birth;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
    
    public PieceWorkerEmployee(int empID,String name,Date Hired,Date Birth){
        this.empID = empID;
        this.empName = name;
        this.empDateHired = Hired;
        this.empBirthDate = Birth;
    }
    
    public PieceWorkerEmployee(){
        this.empID = 0;
        this.empName = "NULL";
        this.empDateHired = new Date(0,0,0);
        this.empBirthDate = new Date(0,0,0);
        this.totalPiecesFinished = 0;
        this.ratePerPiece = 0;
    }
    
    public PieceWorkerEmployee(PieceWorkerEmployee Emp){
        this.empID = Emp.empID;
        this.empName = Emp.empName;
        this.empDateHired = Emp.empDateHired;
        this.empBirthDate = Emp.empBirthDate;
        this.totalPiecesFinished = Emp.totalPiecesFinished;
        this.ratePerPiece = Emp.ratePerPiece;
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

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }
    
    public double computeSalary(){
        int bonus = this.totalPiecesFinished/100;

        double Salary = 0;
        Salary += this.totalPiecesFinished * this.ratePerPiece + (bonus*this.ratePerPiece*10);
        
        return Salary;
    }
    
    public void displayInfo(){
        System.out.println(String.format("%d - %s",this.empID,this.empName));
        System.out.println(String.format("Date Hired : %td,%tm,%ty\nDate of Birth: %td,%tm,%ty ",this.empDateHired,this.empDateHired,this.empDateHired,this.empBirthDate,this.empBirthDate,this.empBirthDate));
        System.out.println(String.format("Total Pieces: %d\nPayRate Per Piece: %.2f",this.totalPiecesFinished,this.ratePerPiece));
        System.out.println(String.format("Salary : %2f",this.computeSalary()));
    }

    @Override
    public String toString() {
        return String.format("%d - %s\nDate Hired : %td,%tm,%ty\nDate of Birth: %td,%tm,%ty\nTotal Pieces: %d\nPayRate per Piece: %.2f",this.empID,this.empName,this.empDateHired,this.empDateHired,this.empDateHired,this.empBirthDate,this.empBirthDate,this.empBirthDate,this.totalPiecesFinished,this.ratePerPiece);
    }
    
}
