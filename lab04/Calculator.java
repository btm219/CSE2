//Ben Meyerson
//Lab03
//This program will be used as a calculator

import java.util.Scanner; //imports the scanner
public class Calculator { //defines the class
    public static void main(String [] args){ //defines main method
        //decalre scanner
        Scanner myScanner = new Scanner (System.in);
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
        }
    }
}