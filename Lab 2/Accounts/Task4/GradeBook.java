/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task4;

/**
 *
 * @author User
 */
public class GradeBook
{
    private String courseName;
    private String instructorName;
    
    public GradeBook(String course,String instructor)//constructor
    {
        courseName=course;
        instructorName=instructor;
    }
    
    public void setCourseName(String course)
    {
        courseName=course;
    }
    
    public String getCourseName()
    {
        return courseName;
    }
    
    public void setInstructorName(String instructor)
    {
        instructorName=instructor;
    }
    
    public String getInstructorName()
    {
        return instructorName;
    }
    
    public void displayMessage()
    {
        System.out.println("Welcome to the grade book for "+getCourseName());
        System.out.println("This course is presented by:"+getInstructorName());
    }      
}
