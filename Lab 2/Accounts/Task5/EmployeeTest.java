/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task5;

/**
 *
 * @author User
 */
public class EmployeeTest 
{
    public static void main(String[]args)
    {
        //Create employee objects
        Employee employee1 = new Employee("Saman","Kumara",100000.00);
        Employee employee2 = new Employee("Nimal","Rajapaksha",120000.00);
        
        //Calculate yearly salaries
        employee1.setMonthlySalary(100000.00*12);
        employee2.setMonthlySalary(120000.00*12);
        
        employee1.displayMessage();
        employee2.displayMessage();
        
        //Salary increments
        double employee1NewYearlySalary=(employee1.getMonthlySalary()*110)/100;
        double employee2NewYearlySalary=(employee2.getMonthlySalary()*110)/100;
        
        //set yaerly salaries to monthley salaries
        employee1.setMonthlySalary(employee1NewYearlySalary);
        employee2.setMonthlySalary(employee2NewYearlySalary);
        
        employee1.displayMessage();
        employee2.displayMessage();
    }
}
