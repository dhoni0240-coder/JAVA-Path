public class array_2D {

    static void aRRAY_2D(int[][] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[]args){
        int[][] a = {
            {1, 2},
            {3, 4}
        };

        aRRAY_2D(a);
    }
}