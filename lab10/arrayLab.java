import java.util.Scanner;
public class arrayLab{
    public static void main(String [] args){
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter how large the array will be: ");
        int n = myScanner.nextInt();
        System.out.println("---");
        int [] arr;
        arr = new int [n];
        int sum = 0;
        int avg = 0;
        
        for (int i = 0; i<arr.length; i++){
            arr[i] = (int)(Math.random() * 100);
        }
        for (int x = 0; x<arr.length; x++){
            System.out.println(arr[x]);
        }
        for (int j = 0; j<arr.length; j++){
            sum += arr[j];
            avg = sum/(arr.length);
           } 
           System.out.println("The sum is: " + sum);
           System.out.println("The average is: " + avg);
        for (int k = 0; k<arr.length; k++){
            if (arr[k] >= avg) 
                System.out.println("The number " + arr[k] + " is above or equal to the average");
            }
        }
    }