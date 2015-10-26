import java.util.Scanner;
public class areas{
    public static void main(String [] args){
      Scanner myScanner = new Scanner (System.in);
      System.out.println("Enter the shape (circle enter 1, rectangle enter 2, or trapezoid enter 3: ");
      int shape = myScanner.nextInt();

      if (shape == 1){
          System.out.println("Enter radius of the circle: ");
          double r = myScanner.nextDouble();
          areas.area(r);
      }
     else if (shape == 2){
         System.out.println("Enter the length of the rectangle: ");
         double l = myScanner.nextDouble();
         System.out.println("Enter the width of the rectangle: ");
         double w = myScanner.nextDouble();
         areas.area(l, w);
     } 
     else if (shape == 3){
         System.out.println("Enter the length of the longer base: ");
         double base1 = myScanner.nextDouble();
         System.out.println("Enter the length of the shorter base: ");
         double base2 = myScanner.nextDouble();
         System.out.println("Enter the height of the trapezoid: ");
         double height = myScanner.nextDouble();
         areas.area(base1, base2, height);
     }
    }
    public static double area(double r){
        double areaC = 1;
        areaC = areaC * 3.14 * r * r;
        System.out.println("The area of the circle is: " + areaC);
        return areaC;
    }
    public static double area(double l, double w){
        double areaR = 1;
        areaR = areaR * l * w;
        System.out.println("The area of the rectangle is: " + areaR);
        return areaR;
    } 
    public static double area(double base1, double base2, double height) {
        double baseDiff = base1 - base2;
        double areaT = 1;
        areaT = areaT * (baseDiff / height);
        System.out.println("The area of the trapezoid is: " + areaT);
        return areaT;
    }
}