package Array_List;

import java.util.ArrayList;

public class Main{
    public static void main(String[]args){

        ArrayList<Integer> list = new ArrayList<>();  //Default capacity is 10.
        
        System.out.println(list.getClass().getName());
        
        list.add(1);
        list.add(30);
        list.add(60);

        System.out.println("Element at index 0 : "+list.get(0));  //Indexing 0 -> 1
        System.out.println("The size of the ArrayList : "+list.size());

        for(int x : list){
            System.out.println(x);
        }

        System.out.println(list);

        System.out.println("Does it contain 30 ? : "+list.contains(30));  //TO check existance of the element in list --> true or false
        System.out.println("Does it contain 90 ? : "+list.contains(90)); 

        //If we want to add no. between 30 and 60 then - 
        list.add(2,40);    // --> (2-index no. on which we want to store , 40-the no. we want to store in between)
        System.out.println(list);

        list.set(3,99); //It will replace 3rd index element by 99. 
        System.out.println("Size is : "+list.size());
        System.out.println("After updating element : "+list);


        list.remove(1);  //remove my index
        System.out.println(list);   
    
    }
}
