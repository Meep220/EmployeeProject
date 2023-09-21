/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version2;

import java.util.Date;

/**
 *
 * @author User
 */
public class PieceWorkerEmployee extends Employee{
    private int totalPiecesFinished;
    private float ratePerPiece;
    public PieceWorkerEmployee(){
        super();
        totalPiecesFinished = 0;
        ratePerPiece = 0;
    }
    public PieceWorkerEmployee(PieceWorkerEmployee emp){
        super(emp.getEmpID(),emp.getEmpName(),emp.getEmpDateHired(),emp.getEmpBirthDate());
        totalPiecesFinished = 0;
        ratePerPiece = 0;
    }
    public PieceWorkerEmployee(int ID,String name,Date hired,Date birth,int totalPieces,float rate){
        super(ID,name,hired,birth);
        totalPiecesFinished = totalPieces;
        ratePerPiece = rate;
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
        super.displayInfo();
        System.out.println(String.format("Total Pieces: %d\nPayRate Per Piece: %.2f",this.totalPiecesFinished,this.ratePerPiece));
        System.out.println(String.format("Salary : %2f",this.computeSalary()));
    }

    
    @Override
    public String toString() {
        return super.toString()+String.format("\nFinished Pieces: %d\nRate per Piece: %.2f",this.totalPiecesFinished,this.ratePerPiece);
    }

    
    
    
}
