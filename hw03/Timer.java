//Ben Meyerson
//Homework 3
//Timer.java

//import the scanner
import java.util.Scanner;
//define a class
public class Timer {
    //define main method
    public static void main(String [] args) {
        //declare the scanner 
        Scanner myScanner = new Scanner (System.in);
        //prompt for user input
        System.out.print("Enter the current hour (military time)(in the form HH): ");
        int currentTimeHour = myScanner.nextInt();
        System.out.print("Enter the current minute (in the form MM): ");
        int currentTimeMinute = myScanner.nextInt();
        System.out.print("Enter the time that you'll be eating dinner (military time)(in the form HH): ");
        int dinnerTimeHour = myScanner.nextInt();
        System.out.print("Enter the time that you'll be eating dinner (in the form MM): ");
        int dinnerTimeMinute = myScanner.nextInt();
        
        //calculations for time until dinner for the hours
        int timeUntilDinnerHour;
        timeUntilDinnerHour = dinnerTimeHour - currentTimeHour;
        //calculations for the time until dinner for the minutes
        int timeUntilDinnerMinute;
        timeUntilDinnerMinute = dinnerTimeMinute - currentTimeMinute;
        //prints the time remaining until dinner
        System.out.println("You have " + timeUntilDinnerHour + " hours and " + timeUntilDinnerMinute + " minutes until dinner");
    }
}
