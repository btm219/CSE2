//Ben Meyerson
//lab06
//October 1, 2015
//this program will run a nested loop for an employer to input timesheets
import java.util.Scanner; //imports the scanner
public class timeSheets{ //declares class
    public static void main(String [] args){ //declares main method
        Scanner myScanner = new Scanner (System.in); //declares the scanner
        
        System.out.println("Enter the number of timesheets to be read in: "); //prompts user for number of timesheets
        int numSheets = myScanner.nextInt();
        
        int totalHours = 0; //declares and initializes variables
        int totalPay = 0;
        int totalPayrate = 0;
        int i = 0;
        
        
        while (i<numSheets){ //begins while loop
            int j = 0;
            int day = 0;
            
            System.out.println("Enter this employees payrate per hour (in cents): ");
            int payrate = myScanner.nextInt();
        
            while (j<5){ //begins nested loop
            j++; //adds 1 to j for each iteration
            day++; //adds a day to the prompt
        System.out.println("Enter the number of hours worked on day (as a whole number) " + day + ": ");
        int hours = myScanner.nextInt();
        totalHours = totalHours + hours;
            }
        //calculations needed for desired response
        totalPayrate = totalPayrate + payrate;
        totalPay = (totalHours * totalPayrate)/numSheets;
        i++;
        }
       System.out.println("The total amount to be paid to employees is: " + totalPay + " cents"); //prints output  
    }
}