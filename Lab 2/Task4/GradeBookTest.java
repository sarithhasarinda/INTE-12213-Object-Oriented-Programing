/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task4;

/**
 *
 * @author User
 */
public class GradeBookTest 
{
    public static void main(String args[])
    {
        GradeBook gradeBook1=new GradeBook("CS101 Introduction to Java Programming!",
                "Sam Smith\n");
        gradeBook1.displayMessage();
        
        gradeBook1.setInstructorName("Judy Jones\n");
        System.out.println("Changing instructor name to " 
                + gradeBook1.getInstructorName());
        
        gradeBook1.displayMessage();
    }
}
