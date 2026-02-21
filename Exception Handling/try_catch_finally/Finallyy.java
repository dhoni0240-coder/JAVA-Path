//finally block

package try_catch_finally;

public class Finallyy {
    public static void main(String[]args){
        
        try{
            int[] arr = {23,45,56,67};
            System.out.println(arr[6]);
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
        }

        finally{
            System.out.println("Finally will always execute whether exception occur or not.");
        }
    }
}
