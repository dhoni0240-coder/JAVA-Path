package Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

//for sorting in descinding order
class myComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer a1, Integer a2){  // if +ve -> a1 will come last and if negative a1 will come first
        return a2 - a1;
    }
}

//To sort string on the basis of string length
class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String a1, String a2){
        return a1.length() - a2.length();
    }
}


public class comparator {
    public static void main(String[]args){

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(2);

        list.sort(null);  //sorting for Ascending order  is simple
        System.out.println(list);

        //For sorting in descending order
        //Class 1
        list.sort(new myComparator());
        System.out.println(list);

        //same thing with lambda expression
        list.sort((a,b) -> b - a);
        System.out.println(list);
        System.out.println("With Lambda expression : "+list);

        //For sorting of word by string length
        //Class 2
        List<String> words = Arrays.asList("Apple","Banana","Pomegranate","Nuts");
        words.sort(new StringLengthComparator());
        System.out.println(words);

        //same thing with lambda expression
        words.sort((a,b) -> a.length() - b.length());
        System.out.println("With Lambda expression : "+words);

    }
}
