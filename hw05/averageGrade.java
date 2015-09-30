//Ben Meyerson
//hw05
//this program calculates the average grade for a class

import java.util.Scanner;
public class averageGrade{
    public static void main(String [] args){
        Scanner myScanner = new Scanner (System.in);
        boolean Stop = true;
        String stop;
        double overallGrade = 0;
        double Grade = 0;
        double loopCount = 0;
        while (Stop == true){
        
        System.out.println("Enter a grade between 0 and 100: ");
        double numberA = myScanner.nextDouble();
        
        if (numberA <=100 && numberA >= 0){
            loopCount = loopCount + 1;
            Grade = Grade + numberA;
            overallGrade = Grade/loopCount;
            System.out.println("==============================");
            System.out.println("  The Average grade is: " + overallGrade);
            System.out.println("==============================");
        }
        
        else if (numberA == 999){
                Stop = false;
                System.out.println("=============================");
                System.out.println("  Program has been stopped.");
                System.out.println("=============================");
                break;
            }
        else if (numberA < 0 || numberA > 100) {
            System.out.println("====================================");
            System.out.println("  Number must be between 0 and 100");
            System.out.println("====================================");
        }
        }
 
            
    }
}