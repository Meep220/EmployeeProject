/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version5;





/**
 *
 * @author JoselitoYap
 */
public class Name {
    private String firstName;
    private String middleInitial;
    private String lastName;
    
    
    public Name(String first, String middle , String last){
        this.firstName = first;
        this.lastName = last;
        this.middleInitial = String.format("%s.", middle.charAt(0));
    }
    
    public Name(Name employeeName){
        this.firstName = employeeName.getFirstName();
        this.lastName = employeeName.getLastName();
        this.middleInitial = employeeName.getMiddleInitial();
    }
    
    public Name(){
        this.firstName = "XXXXX";
        this.lastName = "XXXXX";
        this.middleInitial = "X.";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void displayFullName(){
        System.out.println(String.format("%s , %s , %s ",firstName,middleInitial,lastName));
    }

    @Override
    public String toString() {
        return String.format("%s , %s , %s", firstName,middleInitial,lastName);
    }
    
    
    
    
}
