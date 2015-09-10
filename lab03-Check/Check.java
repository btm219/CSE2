//Ben Meyerson
//September 10, 2015
//CSE 2 Lab 3
//The purpose of this program is to allow a user to input data which will give them the output needed to split a check

//import the scanner first
import java.util.Scanner;
//proceed as usual with declaring public class and main method
public class Check {
    //main method is required for every Java program
    public static void main(String [] args) {
        
        //declare the scanner
        Scanner myScanner = new Scanner ( System.in );
        //prompt for the user to input the cost of the check
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        double checkCost = myScanner.nextDouble();
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx) : ");
        double tipPercent = myScanner.nextDouble ();
        tipPercent /= 100; //converts the tip into a decimal value
        System.out.print("Enter the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt ();
        //how many people are in the group
        
        double totalCost;
        //total cost of the check
        double costPerPerson;
        //the amount each person has to pay
        int dollars, dimes, pennies;
        // stores dollar amount and then digits places as well
        totalCost = checkCost * (1+tipPercent);
        //calculates the total cost
        costPerPerson = totalCost/numPeople;
        //get the entire amount, dropping the decimal fractions
        dollars = (int) costPerPerson;
        //get the dollar amount
        dimes = (int) (costPerPerson * 10) % 10;
        //get the tenths digit amount
        pennies = (int) (costPerPerson * 100) % 10;
        //get the hundredths digit amount
        System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);
        //displays how much each person owes
        
    }   //end of main method
}   //end of class