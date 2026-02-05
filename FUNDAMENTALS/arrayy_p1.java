import java.util.Scanner;

public class arrayy_p1 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        String[] arr = new String[n];

        System.out.println("Enter the "+ n +" elements of array : ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();

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
