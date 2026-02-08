public class second_largest{

    //Finding second largest element of the array
    static void Second(int[] arr){

        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                sec_max = max;
                max = arr[i];
            }else if(arr[i] > sec_max && arr[i] != max){
                sec_max = arr[i];
            }
        }
        if(sec_max == Integer.MIN_VALUE){
            System.out.println("Second largest does not exist");
        }else{
            System.out.println("The second largest element is "+sec_max);
        }
    }

    //Finding second smallest element of the array
    static void Second_smallest(int[] arr){

         int min = Integer.MAX_VALUE;
         int Second_min = Integer.MAX_VALUE;

         for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                Second_min = min;
                min = arr[i];
            }else if(arr[i] > min && arr[i] < Second_min){
                Second_min = arr[i];
            }
         }

         System.out.println("Second min is "+Second_min);
    }

    public static void main(String[]args){

        int[] a = {43,665,24,554,666,23};
        Second(a);
        Second_smallest(a);
    }
}