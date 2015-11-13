//Ben Meyerson
//CSE 002
//The purpose of this program is to make an array for "minesweeper"
import java.util.Scanner;
public class minesweeper{
    public static void main(String [] args){
        int N = 0;
        int M = 0;
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the size of the board (2-30): ");
       
        N = scan.nextInt();
        
        System.out.println("Enter the number of mines (From 1 to N*N): ");
        M = scan.nextInt();
        
        
        String [][] arr = new String[N][N];
        make(N, M, arr);
        print(N, arr);
    }
       public static void make(int n, int m, String [][] arr){
        int mines = 0;
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
               arr[i][j] = "0";
            }
        }
        while (mines < m){
            int i = (int)(Math.random()*n);
            int j = (int)(Math.random()*n);
            if (arr[i][j] != "M") {
                arr[i][j] = "M";
                mines++;
            }
        }
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                if (arr[i][j] == "M"){
                    try{
                        updater(arr, i-1,j-1);
                    }
                    catch(Exception e) {}
                    
                    try{
                        updater(arr, i-1,j+1);
                    }
                    catch(Exception e) {}
                    
                    try{
                        updater(arr, i-1,j);
                    }
                    catch(Exception e) {}
                    
                    
                    
                    try{
                        updater(arr, i,j-1);
                    }
                    catch(Exception e) {}
                    
                    try{
                        updater(arr, i,j+1);
                    }
                    catch(Exception e) {}
                    
                    try{
                        updater(arr, i+1,j);
                    }
                    catch(Exception e) {}
                    
                    try{
                        updater(arr, i+1,j-1);
                    }
                    catch(Exception e) {}
                    
                    try{
                        updater(arr, i+1,j+1);
                    }
                    catch(Exception e) {}
                }
            }
        }
        }
        
        public static void updater(String[][] arr, int i, int j){
            switch (arr[i][j]){
                case "0 ":
                    arr[i][j] = "1 ";
                    break;
                case "1 ":
                    arr[i][j] = "2 ";
                    break;
                case "2 ":
                    arr[i][j] = "3 ";
                    break;    
                case "3 ":
                    arr[i][j] = "4 ";
                    break; 
                case "4 ":
                    arr[i][j] = "5 ";
                    break;    
                case "5 ":
                    arr[i][j] = "6 ";
                    break;    
                case "6 ":
                    arr[i][j] = "7 ";
                    break;  
                case "7 ":
                    arr[i][j] = "8 ";
                    break;  
                default:
                    break;
            }
        }
       public static void print(int n, String[][] arr){
           for (int i =0; i<n; i++){
               for (int j = 0; j<n;j++){
                   System.out.print(arr[i][j]);
               }
               System.out.println();
           }
       } 
    }