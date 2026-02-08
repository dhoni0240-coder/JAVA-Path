//Reverse the array

import java.util.Scanner;

public class reverse_array {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the "+n+" elements of the array -:");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

        }
        System.out.println("Your array is : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]);

            if(i < n-1){
                System.out.print(",");
            }
        }
        System.out.println();
        
        int start = 0, end = n-1;
        
            while(start < end){
                int temp = arr[start];  //temp = locker
                arr[start] = arr[end];
                arr[end] = temp;

                start++;
                end--;
            }

            //After reverse
            System.out.println("Array after Reverse : ");

            for(int i = 0; i < n; i++){
                System.out.print(arr[i]+" ");
            }
            sc.close();
        }
    }
