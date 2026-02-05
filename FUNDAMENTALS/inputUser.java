import java.util.Scanner;

public class inputUser {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        
        System.out.println("Your age is : " + age);
        sc.close();
    }
}

//Explaination :
/*
JAVA does not read input automatically so, we have created #Scanner object in line 6.
then it read input from - int age = sc.nextInt, in line 9,
*/