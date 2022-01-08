/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task6;

/**
 *
 * @author User
 */
public class SeatTypeTest 
{
    public static void main(String[]args)
    {
        //creates objects
        SeatType seatA= new SeatType(200,20);
        SeatType seatB= new SeatType(150,60);
        SeatType seatC= new SeatType(100,40);
        
        //calculate total sales
        int totalSales= (seatA.getSeatsSold()*seatA.getPricePerSeat())
                +(seatB.getSeatsSold()*seatB.getPricePerSeat())
                +(seatC.getSeatsSold()*seatC.getPricePerSeat());
        
       //print total sales 
       System.out.println("Total Sales=Rs." +totalSales);
    }
}
