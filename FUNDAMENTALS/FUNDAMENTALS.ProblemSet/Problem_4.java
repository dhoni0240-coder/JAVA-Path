//Check Even or Odd

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("This is EVEN number.");

        }else{
            System.out.println("This is an ODD number");
        }
    }
}
