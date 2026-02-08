public class even_odd {
    static void even(int[] arr){

        System.out.print("Even elements are : ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i]+" ");
            }
        }

        System.out.println();

        System.out.print("Odd numbers are : ");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void main(String[]args){

        int[] arr = {1,2,3,4,5,6}; 
        even(arr);
    }
}
