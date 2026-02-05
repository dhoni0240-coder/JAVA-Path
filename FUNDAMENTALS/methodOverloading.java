public class methodOverloading {
    
    static int operations(int a, int b){

        return a*b*(a-b);
    }

    static int operations(int a , int b , int c){

        return (b/a)*(a-b);
    }

    static boolean operations(int a, int b , boolean check){
        return a > b;
    }

    static double opertions(double a, double b, double c){
        return a*b*c*(a-b-c);
    }

    public static void main(String[]args){

        System.out.println(operations(12,23));
        System.out.println(operations(10,20,30));
        System.out.println(operations(32,45,true));
        System.out.println(operations(43,45,65));
        
    }
}

//Method overloading -> same method but different parameters 
