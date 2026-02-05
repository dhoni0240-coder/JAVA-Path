public class Problem_11 {
    public static void main(String[]args){
        
        int[] arr = {20,23,14,19,32,13};
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        
    }
}
