public class prime{

    static boolean isPrime(int num){

        if(num <= 1){

            return false;
        }

        for(int i = 2; i < num; i++){

            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[]args){

        int n = 17;
        if(isPrime(n) == true){
            System.out.println(n+" is a Prime number");

        }else{
            System.out.println(n+" is not a Prime number");
        }
    }
}
