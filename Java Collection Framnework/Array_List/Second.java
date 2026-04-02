package Array_List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Second {
    
    public static void main(String[]args){
        List<String> list = new ArrayList<>();

        List<String> list1 = Arrays.asList("Monday","Tuesday");  //We can make replace in this Arrays.asList but cannot edit it
        System.out.println(list1);
        System.out.println(list1.getClass().getName());
        list1.set(1,"Saturday");
        System.out.println(list1);

        String[] array = {"Apple","Orange","Guava"};   // neither edit nor replace
        List<String> list2 = Arrays.asList(array);
        System.out.println(list2.getClass().getName());
        System.out.println(list2);

        List<String> list3 = new ArrayList<>(list2); //to edit list2 we can do this
        list3.add(1,"Pine Apple");
        System.out.println(list3);

        //Use of List.of
        List<Integer> myList = new ArrayList<>();
        List<Integer> list4 = List.of(1,2,3,4,5,6,7,8);
        myList.addAll(list4);
        System.out.println(myList);
        System.out.println(list);
    }
}
