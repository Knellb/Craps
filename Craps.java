/**
 * Write a description of class Craps here.
 *
 * @author Ben Knell
 * @version 2021-2-2
 */

import java.util.Scanner;

public class Craps
{
    private double dieRoll;
    
    public static void main(String[] args)
    {
        System.out.println("Let's play craps!");
        System.out.println("Do you need instructions (y/n)?");
        Scanner in = new Scanner(System.in);
        String response = in.next();
        if (response.substring(0,1).equalsIgnoreCase("y"))
        {
            System.out.println("Roll two six-sided dice and add the numbers rolled together.");
            System.out.println("On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is over. If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the 'point.'");
            System.out.println("You continue to roll the two dice again until one of two things happens: either you roll the 'point' from that first roll again, in which case you win; or you roll a 7, in which case you lose.");
        }
        
        
    }
    
    
}
