import java.util.Scanner;

public class array{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the " + n +"  elements of the array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Your array is : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");

        }
        sc.close();
    }
}
