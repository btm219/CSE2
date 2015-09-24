//Ben Meyerson
//Lab05
//This program will be used as a calculator but will loop until the users wants it to stop

import java.util.Scanner; //imports the scanner
public class CalculatorSpecial { //defines the class
    public static void main(String [] args){ //defines main method
        //decalre scanner
        Scanner myScanner = new Scanner (System.in);
        boolean Stop = true; //declares boolean Stop and sets it equal to true to begin with
        while (Stop == true){ //only runs if boolean is true
            
        //prompt for user input
        System.out.print("Enter first integer: ");
        int firstNum = myScanner.nextInt();
        System.out.print("Enter second integer: ");
        int secondNum = myScanner.nextInt();
        System.out.print("Enter math operation symbol: ");
        String symbol = myScanner.next();
       
        
        //sequence for switch process
        int calc;
        switch (symbol) {
            case "+": System.out.println(firstNum + secondNum); //prints first case which is addition
            break;
            case "-": System.out.println(firstNum - secondNum); //prints first case which is subtraction
            break;
            case "*": System.out.println(firstNum * secondNum); //prints first case which is mulitplication
            break;
            case "/": System.out.println(firstNum / secondNum); //prints first case which is division
            break;
            default: System.out.println("Illegal operator"); //prints illegal operator if the symbol is wrong
            break;
        }System.out.println("Do you want to continue? "); //asks user if they want to continue
        String stop = myScanner.next(); //declares string stop as user input
        if (stop.equals("n") || stop.equals("N")){
            Stop = false; //stops the program
            System.out.println("Program stopped"); //tells the user that the program has ended
            break; //stops the loop
        
        }
        }
    }
}