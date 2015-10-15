import java.util.Scanner; //imports the scanner
public class methods{ //declares the class
    public static void main(String [] args){ //declares main method
       
       double avg;
       double middle;
       
       Scanner myScanner = new Scanner (System.in); //prompt for user input and initializes the corresponding variables
        System.out.println("Enter in the smallest number: ");
        double a = myScanner.nextDouble();
        System.out.println("Enter in the second smallest number: ");
        double b = myScanner.nextDouble();
        System.out.println("Enter in the third smallest number: ");
        double c = myScanner.nextDouble();
        System.out.println("Enter in the fourth smallest number: ");
        double d = myScanner.nextDouble();
        System.out.println("Enter in the fifth smallest number: ");
        double e = myScanner.nextDouble();
        System.out.println("Enter in the sixth smallest number: ");
        double f = myScanner.nextDouble();
        System.out.println("Enter in the seventh smallest number: ");
        double g = myScanner.nextDouble();
        System.out.println("Enter in the eigth smallest number: ");
        double h = myScanner.nextDouble();
        System.out.println("Enter in the ninth smallest number: ");
        double i = myScanner.nextDouble();
        System.out.println("Enter in the tenth smallest (largest) number: ");
        double j = myScanner.nextDouble();
       
       avg = mean(a,b,c,d,e,f,g,h,i,j);
       middle = median(e,f);
       print(avg,middle);
    }
    //method to do the math for the mean
    public static double mean(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j){
        double avg = (a+b+c+d+e+f+g+h+i+j)/10;
        return avg;
    }
    //method to do the math for the median
    public static double median(double e, double f){
        double middle = (e+f)/2;
        return middle;
    }
    //method that prints the answers
    public static void print(double avg, double middle){
        System.out.println("The mean is: " + avg);
        System.out.println("The median is: " + middle);
        return;
    }
}