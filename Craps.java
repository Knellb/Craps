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
        Die d1 = new Die();
        Die d2 = new Die();
        int total = d1.roll() + d2.roll();
        boolean didTheyWin = true;
        
        if (total == 7 || total == 11)
        {
            didTheyWin = true;
        }
        else if (total == 2 || total == 3 || total == 12)
        {
            didTheyWin = false;
        }
        else
        {
            int winPoint = total;
            int lossPoint = 7;
            while (total != lossPoint && total != winPoint)
            {
                total = d1.roll() + d2.roll();
                System.out.println("You rolled a " + total);
            }
            if (total == winPoint)
            {
                didTheyWin = true;
            }
            else
            {
                didTheyWin = false;
            }
        }
        if (didTheyWin == true)
        {
            System.out.println("Congratulations! You won! Play again?");
        }
        else
        {
            System.out.println("Oh no! You rolled a " + total + ". You lost.");
        }
    }
}
