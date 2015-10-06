//Ben Meyerson
//hw06
//10/5/2015
//this program will print a pyramid of i height

import java.util.Scanner; //imports the scanner
public class pyramid{ //declares the class
    public static void main(String [] args){ //declares main method
       Scanner myScanner = new Scanner (System.in); //initializes the scanner
      
      //prompt for user input
       System.out.println("Enter a number greater than 0 or a number above 5  to end the program: ");
       int i = myScanner.nextInt(); //initializes the variable i
       boolean Stop = true;
       
       while (Stop == true){
           
          if (i == 1){
               System.out.println(" * ");
               break;
           }
          else if (i == 2){
              System.out.println(" * ");
              System.out.println("***");
              break;
          } 
         else if (i == 3){
              System.out.println("  *  ");
              System.out.println(" *** ");
              System.out.println("*****");
              break;
          }
          else if (i == 4){
              System.out.println("   *   ");
              System.out.println("  ***  ");
              System.out.println(" ***** ");
              System.out.println("*******");
              break;
          }
         else if (i == 5){
              System.out.println("    *    ");
              System.out.println("   ***   ");
              System.out.println("  *****  ");
              System.out.println(" ******* ");
              System.out.println("*********");
              break;
          }
          else if (i<=0){
              System.out.println("Invalid input");
              break;
          }
          else if (i>5){
              Stop = false;
              System.out.println("End");
              break;
          }
       }
    }
}