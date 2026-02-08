//How to declare an array

import java.util.Scanner;
public class array1 {
    
    
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enetr the size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the "+n+" elements of Array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

            
        }
        System.out.println("Your Array is : ");
        for(int i = 0; i < n; i++){
            
            System.out.print(arr[i]);
            if(i < n-1){
                System.out.print(",");
            }
        }
        sc.close();
    }
}

