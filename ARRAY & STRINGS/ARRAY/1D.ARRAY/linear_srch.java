//Linear search in array

public class linear_srch{

    static void search(int[] arr, int n, int target){

        boolean found = false;

        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                System.out.println(i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Invalid target");
        }
    }

    public static void main(String[]args){
        int[] arr = {34,54,32,65,11,89};
        int n = arr.length;
        int target = 11;

        search(arr,n,target);
    }
}