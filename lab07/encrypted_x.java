import java.util.Scanner; //imports the scanner
public class encrypted_x{ //defines the class
    public static void main(String [] args){ //defines the main method
        Scanner myScanner = new Scanner (System.in); //defines the scanner
        
        System.out.print("Enter the size of square (0-100): "); //prompts for user input
        int num = myScanner.nextInt(); //declares and initalizes that input as variable num
        
        if (num < 0 || num > 100){ //for loop that verifies the number entered was within the right range
            System.out.println("Invalid size");
            System.exit(1); //ends the program
        }
        
        for (int i = 0; i <= num; i++){ //starts the for loop that makes the picture
            
            for (int j = 0; j < num; j++){ //inner loop to make the pattern
             if (j == i || j== num - i){
                 System.out.print(" "); 
             } 
              else {
                  
              System.out.print("*");
              }
               } 
               System.out.println(); 
        }
    }
}