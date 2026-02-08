import java.util.Scanner;

public class array_sum {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the "+n+" element of array");
        for(int i = 0; i < n; i++){

            arr[i] = sc.nextInt();
        }
        System.out.print("The sum of the array is : ");
        for(int i = 0; i < n; i++){
            sum += arr[i];
        }

        System.out.print(sum);
        sc.close();
    }
}
