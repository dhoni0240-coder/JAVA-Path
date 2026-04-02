package Map;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {

        // Creating HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // Adding key-value pairs
        students.put(101, "Aman");
        students.put(102, "Rohit");
        students.put(103, "Sneha");

        System.out.println("Map: " + students);

        // Accessing value
        System.out.println("Student with ID 102: " + students.get(102));

        // Updating value
        students.put(103, "Priya");
        System.out.println("After update: " + students);

        // Removing element
        students.remove(101);
        System.out.println("After removal: " + students);

        // Checking key/value
        System.out.println("Contains key 102? " + students.containsKey(102));
        System.out.println("Contains value Priya? " + students.containsValue("Priya"));

        // Size
        System.out.println("Size: " + students.size());

        // Iterating using entrySet
        System.out.println("Iterating:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }
}