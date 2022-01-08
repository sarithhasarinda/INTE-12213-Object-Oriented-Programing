/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Accounts;

/**
 *
 * @author User
 */
public class Account 
{
     private double balance; // instant variable that stores balance

    //constructor
    public Account(double initialBalance)
    {
        if(initialBalance > 0.0)
        {
            balance = initialBalance;
        }
    }

    public void credit(double amount)
    {
        balance = balance + amount;//add amount to balance
    }

    public void debit(double amount)
    {
        if(amount > balance)
        {
            System.out.println("Debit amount exceeded account balance");
        }
        else 
        {
            balance = balance - amount;
        }
    }

    public double getBalance()
    {
        return balance;
    }
}
