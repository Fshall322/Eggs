/**
 * Created by Frank Hall on 6/25/2016.
 */
import java.util.Scanner;  //import to allow input from keyboard.

public class Eggs // eggs class
{
    public static void main(String[] args) // main method
    {
        int dozenEggs = 0, individualEggs = 0, totalAmountEggs = 0; // variable decleration and intializations
        double dozenEggsCost, individualEggscost, totalCost;

        Scanner input = new Scanner(System.in); // creates the scanner
        System.out.println("How many eggs are in your order?"); // asks user for input
        totalAmountEggs = input.nextInt(); // saves user input to the variable
        dozenEggs = totalAmountEggs / 12; // math to determine the amount of dozens and single eggs, and thecost of the eggs
        dozenEggsCost = dozenEggs * 3.25;
        individualEggs = totalAmountEggs % 12;
        individualEggscost = individualEggs * .45;
        totalCost = dozenEggsCost + individualEggscost;
        System.out.println("You ordered " +totalAmountEggs+ " eggs.");  // out put for the total of eggs, the total amount of dozens and singular eggs, and the cost of the eggs.
        System.out.println("Thats " +dozenEggs+ " dozen at $3.35 per dozen");
        System.out.println("You have " +individualEggs+ " loose eggs at 45 cents per egg");
        System.out.print("for a grandtotal of ");
        System.out.printf("$%.2f",totalCost);
    } // end method
} // end class
