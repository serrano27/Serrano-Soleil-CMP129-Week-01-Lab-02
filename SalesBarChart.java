package Labs.Week_1.scr;

import java.util.Scanner;
public class SalesBarChart 
{
    public static void main(String [] args)
    {
        //reminder to self - each * represents $100 in sales

        Scanner keyboard = new Scanner(System.in);

        //vars to hold dollar amounts for each store in sales
        int numberOfStores, numberOfAsterisks;
        //ask user for how many stores
        System.out.print("How many stores? Enter: ");
        numberOfStores = keyboard.nextInt();
        System.out.println();

        //create an array to hold the values for every store
        int[] amounts = new int[numberOfStores];

         //ask user for todays sales for each store
        for(int i = 0; i < numberOfStores; i++)
        {
            System.out.print("Enter today's sales for store " + (i + 1) +": ");
            amounts[i] = keyboard.nextInt();
            System.out.println();
        }
       //calculate asterisk amounts
       int[] asteriskAmounts = new int[numberOfStores]; //creating array to hold the number of asterisks needed
        for(int i = 0; i < numberOfStores; i++)
        {
            asteriskAmounts[i] = amounts[i] / 100;
        }


        //display sales bar chart
        System.out.println("SALES BAR CHART");
        System.out.println("(Each * = $100)");

       
        for(int i = 0; i < numberOfStores; i++)
        {
            System.out.println("Store " + (i + 1) + ": " + "*".repeat(asteriskAmounts[i]));
        }

        
    }
}
