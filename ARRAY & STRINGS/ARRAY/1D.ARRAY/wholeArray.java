public class wholeArray {

    // Print array
    static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Sum of array
    static int sum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    // Max element
    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    // Min element
    static int min(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    // Reverse array
    static void reverse(int[] arr){
        int left = 0, right = arr.length - 1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Check if sorted (ascending)
    static boolean isSorted(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    // Linear search
    static int linearSearch(int[] arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key)
                return i;
        }
        return -1;
    }

    // Second largest element
    static int secondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                second = max;
                max = arr[i];
            }
            else if(arr[i] > second && arr[i] != max){
                second = arr[i];
            }
        }
        return second;
    }

    // Frequency count
    static void frequency(int[] arr){
        boolean[] visited = new boolean[arr.length];

        for(int i = 0; i < arr.length; i++){
            if(visited[i]) continue;

            int count = 1;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
    }

    public static void main(String[] args){

        int[] arr = {4, 2, 7, 2, 9, 4, 1};

        System.out.print("Array: ");
        printArray(arr);

        System.out.println("Sum: " + sum(arr));
        System.out.println("Max: " + max(arr));
        System.out.println("Min: " + min(arr));

        reverse(arr);
        System.out.print("Reversed: ");
        printArray(arr);

        System.out.println("Is Sorted: " + isSorted(arr));
        System.out.println("Search 9 at index: " + linearSearch(arr, 9));
        System.out.println("Second Largest: " + secondLargest(arr));

        System.out.println("Frequency:");
        frequency(arr);
    }
}

