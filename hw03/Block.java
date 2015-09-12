//Ben Meyeron
//Homework 3
//Block.java

//import the scanner
import java.util.Scanner;
//define the class
public class Block {
    //define main method
    public static void main(String [] args) {
        //declare the scanner
        Scanner myScanner = new Scanner (System.in);
        //user input prompt 
        System.out.print("Enter the length of the block: ");
        double length = myScanner.nextDouble();
        System.out.print("Enter the width of the block: ");
        double width = myScanner.nextDouble();
        System.out.print("Enter the height of the block: ");
        double height = myScanner.nextDouble();
        
        //declare variables for calculations
        double volume;
        double surfaceArea;
        double sideLW; //area of the two sides of length times width
        double sideLH; //area of the two sides of length times height
        double sideWH; //area of the two sides of width times height

        //calculations for the volume of the block
        volume = length * width * height;
        //calcuations for the surface area of the block
        sideLW = length * width * 2;
        sideLH = length * height *2;
        sideWH = width * height * 2;
        surfaceArea = sideLW + sideLH + sideWH;
        //prints the volume of the block
        System.out.println("The volume of the block is: " + volume);
        //prints the surface area of the block
        System.out.println("The surface area of the block is: " + surfaceArea);
    }
}