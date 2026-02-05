//Void vs Non void methods

public class void_vs_nonvoid {
    
    static void void_fxn(int a, int b){

        int x = a*b*(a+b);

        System.out.println(x);
    }
    public static int non_void(int z, int k, int t){

        return z*t*(k-t);

    }

    public static void main(String[]args){

        void_fxn(23,54);

        int y = non_void(5,10,15);
        System.out.println(y);

    }
}
