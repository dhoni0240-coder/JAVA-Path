//Grade Problem

import java.util.Scanner;

public class Problem_6 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();

        if(marks >=90){
            System.out.println("Excellent");

        }else if(marks < 90 && marks > 80){
            System.out.println("Very Good");

        }else if(marks < 80 && marks > 70){
            System.out.println("Good");

        }else if(marks < 70 && marks > 40){
            System.out.println("Satisfactry");
        }else{
            System.out.println("Fail");
        }
    }
}
