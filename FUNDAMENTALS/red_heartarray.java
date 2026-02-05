//Read array like --> {"hello world"," ms dhoni","virat kohli"}

import java.util.Scanner;

public class red_heartarray {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();

        String[] arr = new String[n];
        sc.nextLine();

        System.out.println("Enter the "+n+" elements of the array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextLine();
        }

        System.out.println("Your array is : ");
        for(int i = 0; i < n; i++){

            System.out.print(arr[i]);

            if(i < n-1){
                System.out.print(",");
            }
                
        }
        sc.close();
    }
 }

