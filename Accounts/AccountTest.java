/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Accounts;

/**
 *
 * @author User
 */
import java.util.Scanner;

public class AccountTest 
{
    public static void main(String args[])
    {
        Account account1 = new Account(50.00); //account objects
        Account account2 = new Account(-7.53);

        System.out.printf("account1 balance: $%.2f\n",
                account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n\n",
                account2.getBalance());

        Scanner input = new Scanner(System.in);
        double withdrawalAmount;

        System.out.print("Enter Withdrawal amount for Account1: ");
        withdrawalAmount = input.nextDouble();
        System.out.printf("\nsubtarcting %.2f from acount1 balance\n",
                withdrawalAmount);
        account1.debit(withdrawalAmount);

        System.out.printf("account1 balance: $%.2f\n",
                account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n",
                account2.getBalance());

        System.out.print("Enter Withdrawal amount for Account2: ");
        withdrawalAmount = input.nextDouble();
        System.out.printf("\nsubtarcting %.2f from acount2 balance\n",
                withdrawalAmount);
        account2.debit(withdrawalAmount);

        System.out.printf("account1 balance: $%.2f\n",
                account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n",
                account2.getBalance());
    }
}
