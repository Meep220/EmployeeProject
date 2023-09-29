/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version3;

/**
 *
 * @author JoselitoYap
 */
public class Name {
    private String firstName;
    private String middleInitial;
    private String lastName;
    private String[] suffix = {""};
    
    public Name(String first, String middle , String last, String...suffix){
        this.firstName = first;
        this.lastName = last;
        this.middleInitial = String.format("%s.", middle.charAt(0));
        this.suffix = suffix;
    }
    
    public Name(Name employeeName){
        this.firstName = employeeName.getFirstName();
        this.lastName = employeeName.getLastName();
        this.middleInitial = employeeName.getMiddleInitial();
        this.suffix = employeeName.getSuffix();
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

    public String[] getSuffix() {
        return suffix;
    }
    
    public String getSuffixString(){
        String temp = "";
        for(String suffix1 : suffix){
            temp = temp + suffix1 + " ";
        }
        return temp;
    }

    public void setSuffix(String[] suffix) {
        this.suffix = suffix;
    }
    
    
    
    public void displayFullName(){
        System.out.println(String.format("%s , %s , %s , %s ",firstName,middleInitial,lastName,getSuffixString()));
        
    }
    
    @Override
    public String toString() {
        return String.format("%s , %s , %s, %s", firstName,middleInitial,lastName,getSuffixString());
    }
    
    
    
    
}
