package Comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

class Information{
    private String name;
    private double gpa;

    public Information(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }
    public double getGPA(){
        return gpa;
    }
}
public class Student {
    
    public static void main(String[]args){
        List<Information> student1 = new ArrayList<>();
        student1.add(new Information("Kunal",4.8));
        student1.add(new Information("Anshuman",3.5));
        student1.add(new Information("Happy",4.1));
        student1 .add(new Information("Hardik",3.5));

        //instead of doing 1 wwe can do it directly by : 
        Comparator<Information> comparator = Comparator.comparing(Information :: getGPA).reversed().thenComparing(Information::getName); //1st GPA then Name
        student1.sort(comparator);
        
        // 1-->//this is not good...but we can sort by doing this 
        /*
        student1.sort((a,b) -> {
            if(b.getGPA() - a.getGPA() > 0){
                return 1;
            }else if(b.getGPA() - a.getGPA() < 0){
                return -1;
            }else{
                return 0.getName().compareTo(b.getName());
            }
        });
        */

        for(Information s : student1){
            System.out.println(s.getName()+" : "+s.getGPA());
        }
    }
}
