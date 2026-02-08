public class whole2DArray {

    // Print 2D Array
    static void printMatrix(int[][] arr){

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Sum of all elements
    static int totalSum(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }

    // Row-wise sum
    static void rowSum(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
            System.out.println("Row " + i + " sum = " + sum);
        }
    }

    // Column-wise sum
    static void columnSum(int[][] arr){
        for(int j = 0; j < arr[0].length; j++){
            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                sum += arr[i][j];
            }
            System.out.println("Column " + j + " sum = " + sum);
        }
    }

    // Maximum element
    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        return max;
    }

    // Minimum element
    static int min(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] < min)
                    min = arr[i][j];
            }
        }
        return min;
    }

    // Print primary diagonal
    static void diagonal(int[][] arr){
        System.out.print("Diagonal: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i][i] + " ");
        }
        System.out.println();
    }

    // Transpose of matrix
    static void transpose(int[][] arr){
        System.out.println("Transpose:");
        for(int i = 0; i < arr[0].length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }

    // Search an element
    static boolean search(int[][] arr, int key){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == key)
                    return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args){

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Matrix:");
        printMatrix(arr);

        System.out.println("Total Sum: " + totalSum(arr));

        rowSum(arr);
        columnSum(arr);

        System.out.println("Max: " + max(arr));
        System.out.println("Min: " + min(arr));

        diagonal(arr);
        transpose(arr);

        System.out.println("Search 5: " + search(arr, 5));
    }
}
