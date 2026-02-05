//Take User input as Name and Age

import java.util.Scanner;

public class Problem_3 {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name : ");
        String name = sc.nextLine();

        System.out.print("Enter your Age : ");
        int age = sc.nextInt();

        System.out.println("Your Name is : "+name);
        System.out.println("Your Age is : "+age);

    }
}
