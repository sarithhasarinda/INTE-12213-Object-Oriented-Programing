/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Task6;

/**
 *
 * @author User
 */
public class SeatType 
{
    private int numberOfSeatsSold;
    private int pricePerSeat;
    
    //constructor
    public SeatType(int seatsSold, int price)
    {
        numberOfSeatsSold=seatsSold;
        pricePerSeat=price;
    }
    
    public void setSeatsSold(int seatsSold)
    {
        numberOfSeatsSold=seatsSold;
    }    
    public int getSeatsSold()
    {
        return numberOfSeatsSold;
    }
    
    public void setPricePerSeat(int price)
    {
        pricePerSeat=price;
    }
    public int getPricePerSeat()
    {
        return pricePerSeat;
    }  
}

