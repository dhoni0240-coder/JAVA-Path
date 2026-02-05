//Sum of Elements
public class array_p2 {
    public static void main(String[]args){

        int[] arr = {23,34,45,56};
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
