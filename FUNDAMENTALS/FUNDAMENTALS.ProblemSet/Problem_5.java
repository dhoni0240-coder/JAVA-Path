//Find larger of two numbers

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[]args){
            
        Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number_1 : ");
            int num_1 = sc.nextInt();

            System.out.print("Enter the num_2 : ");
            int num_2 = sc.nextInt();

            if(num_1 > num_2){
                System.out.println("Number_1 is Larger.");

            }else{
                System.out.println("Number_2 is Larger.");
            }

        }
    }
 
