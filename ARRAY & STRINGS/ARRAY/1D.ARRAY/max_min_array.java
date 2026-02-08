//Find maximum and minimum element in an Array

import java.util.Scanner;

public class max_min_array {

    public static void main(String[]args){

        

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the "+n+" elements of the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        //Max and minimum-->

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }

            if(arr[i] < min){                     
                min = arr[i];
            }
        }

        System.out.println("Maximum element is "+max+" and Minimum element is "+min);
        sc.close();

    }
}
