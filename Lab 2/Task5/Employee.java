/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task5;

/**
 *
 * @author User
 */
public class Employee 
{
    private String firstName;
    private String lastName;
    private double monthlySalary;
    
    //constructor
    public Employee(String firstN, String lastN, double mSalary )
    {
        firstName=firstN;
        lastName=lastN;
        monthlySalary=mSalary;
    }
    
    public void setFirstName(String firstN )
    {
        firstName=firstN;
    }
    public String getFirstName()
    {
       return firstName; 
    }
    
    public void setLastName(String lastN )
    {
        lastName=lastN;
    }
    public String getLastName()
    {
        return lastName;
    }
    
    public void setMonthlySalary(double mSalary)
    {
        if(monthlySalary<0)
        {
           monthlySalary=0.00; 
        }
        if(monthlySalary>=0)
        {
           monthlySalary=mSalary; 
        }
    }
    public double getMonthlySalary()
    {
        return monthlySalary;
    }
    
    public void displayMessage()
    {
        System.out.println("Mr."+getFirstName()+" "+getLastName()
                +" your yearly salary is Rs."+getMonthlySalary());
    }
     
}
