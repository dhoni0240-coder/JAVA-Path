//Find minimum and maximum array

public class array_p3 {       //{2,3,5,4,1}

    static void max_min(int[] arr){

        int max = arr[0];
        int min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];   
            }

            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Max array element is " + max + " and Min is "+min);

    }
    public static void main(String[]args){
        
        int a[] = {1,2,3,4,5};

        max_min(a);

    }
}
