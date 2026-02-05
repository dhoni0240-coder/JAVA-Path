//Addition of number from 1 to N.

public class Problem_7 {
    public static void main(String[]args){

        int n = 5;
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("Sum is : "+sum);
    }
}
