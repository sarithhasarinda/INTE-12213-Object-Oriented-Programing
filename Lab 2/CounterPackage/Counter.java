/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CounterPackage;

/**
 *
 * @author User
 */
public class Counter 
{
    private static int value=0;
    
    public static void increment()
    {
        value++;  
    }
    
    public static int getValue()
    {
        return value;
    }
    
    public static void main(String[]args)
    {
        System.out.println(getValue());
        increment();
        System.out.println(getValue());
    }
}