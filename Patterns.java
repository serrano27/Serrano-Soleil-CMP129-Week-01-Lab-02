package Labs.Week_1.scr;

import java.util.Scanner;
public class Patterns 
{
    public static void main(String [] args)
    {
            //both Pattern A and Pattern B use "+"
        /*help from GitHub Copilot: Outer loop - controls number of rows
        Inner Loop - controls number of symbols appearing on current row
        "print" - used in inner loop so that symbols are on same line
        "println"-used after inner loop to move to next row

        increasing pattern - inner loop limit grows w/ outer loop count
        decreasing pattern - inner loop limit decreases
        */
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a number greater than 1 or 2: ");
        int numberOfPluses = keyboard.nextInt(); //to not have the limits for the loops as a fixed number

        //display pattern A
        System.out.println("-------------------------------");
        System.out.println("Pattern A");
        System.out.println("-------------------------------");
        //outer loop
        for (int r = 1; r < numberOfPluses + 1; r++)
        {
            //inner loop
            for (int c = 1; c < r; c++)
            {
                System.out.print("+");
            }
            System.out.println("+");
        }
        //display pattern B
        System.out.println("-------------------------------");
        System.out.println("Pattern B");
        System.out.println("-------------------------------");
        //outer loop
        for (int r = 1; r < numberOfPluses + 1; r++)
        {
            //inner loop
            for (int c = numberOfPluses; c > r; c--)
            {
                System.out.print("+");
            }
            System.out.println("+");
        }


    }
}
