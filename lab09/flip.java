//Ben Meyerson
//10/23/15
//lab09
//this program shows the results of a flip of a coin n number of times
import java.util.Scanner; //imports the scanners
import java.lang.Math;
public class flip{ //defines the class
    public static String flip(){ //for one flip
        double rand = Math.random();
        if (rand>0.5) //if flip is greater than 0.5 it is heads, otherwise it's tails
            return "Heads";
        else
            return "Tails";
    }
   
   public static String flip(int n){ //for many flips
     int heads = 0;
     int tails = 0;
     if(n==0) //this will call the other flip method
         return flip();
     else{ //if more than 0
            for(int x = 0; x<n; x++){ //finds how many time it is flipped
                double flip = Math.random(); //randomizes flip
                if (flip>0.5)
                    heads++;
                
                else 
                    tails++;
            }
        
     return "Heads: " + heads + "/Tails: " + tails; //return statement
     }
   } 
    public static void main(String [] args){ //main method
        Scanner myScanner = new Scanner (System.in); //initializes the new scanner
        boolean count = true;
        while(count){
            System.out.println("Enter how many times the coin will be flipped (from 0 to 100): ");
            int x = myScanner.nextInt();
            if (x>100)
                count = false;
            
            else
              System.out.println("The coin landed on " + flip(x));  
                
        }
        }
    
    }