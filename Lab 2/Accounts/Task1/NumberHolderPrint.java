/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task1;

/**
 *
 * @author User
 */
public class NumberHolderPrint 
{
     public static void main(String[]args)
     {
        NumberHolder numObj= new NumberHolder();
        numObj.anInt=10;
        numObj.afloat=(float)10.5;
        
        System.out.println(numObj.anInt);
        System.out.println(numObj.afloat);
    }
}
