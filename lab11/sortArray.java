import java.util.Arrays;

public class sortArray{
    
    public static void sort(int x []){
        Arrays.sort(x);
    }
    public static void main(String [] args){
        int [] arr;
        arr = new int [20];
        
        for (int x = 0; x<arr.length; x++){
            arr[x] = (int)(Math.random() * 100);
        }
       
        sort(arr);
        System.out.println("Sorted Array 1: ");
        for (int x = 0; x<arr.length; x++){
                System.out.println(arr[x]);
        }
        int arr2[] = new int [10];
        for (int x = 0; x<arr2.length; x++){
            arr2[x] = (int)(Math.random()*100);
        }
        sort(arr2);
            System.out.println("Sorted Array 2: ");
        for (int x = 0; x<arr2.length; x++){
                System.out.println(arr2[x]);
        }
        int arr3[] = new int [30];
        for (int x = 0; x<arr.length; x++){
            arr3[x] = arr[x];
        }
        for (int x = 0; x<arr2.length; x++){
            arr3[arr.length-1+x] = arr2[x];
        }
        sort(arr3);
          System.out.println("Sorted Array 3: ");
        for (int x = 0; x < arr3.length; x++){
              System.out.println(arr3[x]);
        }  
    }
    
}