//Ben Meyerson
//hw05
//this program calculates the average grade for a class

import java.util.Scanner; //imports the scanner
public class averageGrade{ //declares the class
    public static void main(String [] args){ //declares the main method
        Scanner myScanner = new Scanner (System.in); //declare the scanner
        boolean Stop = true; //declares a boolean and sets it initially to true
        String stop; //declares a string called stop
        double overallGrade = 0; //declares a variable used for the overall grade
        double Grade = 0; //declares a variable for the total of all the grades
        double loopCount = 0; //declares a variable for how many grades have been entered
        while (Stop == true){ //starts the while loop
        
        System.out.println("Enter a grade between 0 and 100: "); //asks for the user to input a grade
        double numberA = myScanner.nextDouble(); //declares a variable which will be input by the user
        
        if (numberA <=100 && numberA >= 0){ //states the firt case
            loopCount = loopCount + 1;
            Grade = Grade + numberA;
            overallGrade = Grade/loopCount;
            System.out.println("==============================");
            System.out.println("  The Average grade is: " + overallGrade); //prints the average grade
            System.out.println("==============================");
        }
        
        else if (numberA == 999){ //this case will stop the program if 999 is entered
                Stop = false;
                System.out.println("=============================");
                System.out.println("  Program has been stopped."); //lets the user know that the program has ended
                System.out.println("=============================");
                break;
            }
        else if (numberA < 0 || numberA > 100) { //this case is for if a number is entered that is not within the range specified above
            System.out.println("====================================");
            System.out.println("  Number must be between 0 and 100"); //prints the response
            System.out.println("====================================");
        }
        }
 
            
    }
}