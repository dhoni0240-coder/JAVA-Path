//Demo of try-catch

package try_catch_finally;

public class DemoTryCatch {
    public static void main(String[]args){
        try{
            int a = 12;
            int b = 0;
            int div = a/b;
            System.out.println("Division of a by b : "+div);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divode by Zero...");
        }

        System.out.println("Program ended");
    }
}
