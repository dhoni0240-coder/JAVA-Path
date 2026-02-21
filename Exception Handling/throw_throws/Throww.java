//Describinig throw keyword

package throw_throws;
import java.util.Scanner;
public class Throww {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if(age < 18){
            throw new ArithmeticException("You are not eligible to vote...sorry");
        }
        System.out.println("You can vote");
    }
}
