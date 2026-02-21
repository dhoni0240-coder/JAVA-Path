//Multiple catch Block

package try_catch_finally;

public class MultipleCatch {
    public static void main(String[]args){
        try{
            int x = 76;
            int y = 0;
            int result = x / y;

            System.out.println("THe result will be : "+result);
        }

        catch(NullPointerException e){
            System.out.println("NullPointerException occurred");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayOutOfBoundsException Occurerred");
        }

        catch(ArithmeticException e){
            System.out.println("ArithmeticExvception occurred");
        }
    }
}
