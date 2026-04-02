package Set;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        // Creating HashSet
        HashSet<Integer> numbers = new HashSet<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10); // duplicate ignored

        System.out.println("Set: " + numbers);

        // Removing element
        numbers.remove(20);
        System.out.println("After removal: " + numbers);

        // Checking existence
        System.out.println("Contains 30? " + numbers.contains(30));

        // Size
        System.out.println("Size: " + numbers.size());

        // Iteration
        System.out.println("Iterating:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Converting Set to List
        ArrayList<Integer> list = new ArrayList<>(numbers);
        System.out.println("Converted to List: " + list);
    }
}