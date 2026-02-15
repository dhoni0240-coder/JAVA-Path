package Phase02;

class Student{
    String name;
    int roll;
    int marks;
    String course;

    //Default Constructor
    Student(){
        this.name = "Human";
        this.roll = 54;
        this.marks = 87;
        this.course = "Btech CSE";
    }

    //Parameterized Constructor
    Student(String name, int roll, int marks,String course){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
        this.course = course;
    }
    
    @Override
    public String toString(){
        return "Name : "+name+ 
        " ,Roll no. : "+roll+
        " ,Marks : "+marks+
        " ,Course : "+course;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }

        Student next = (Student) obj;

        return this.name.equals(next.name) &&
        this.roll == next.roll &&
        this.marks == next.marks &&
        this.course.equals(next.course);
    }
}

public class inbuilt_Methods_toString {
    
    public static void main(String[]args){
        Student one = new Student("Ashirvad",90,97,"Btech CSE");
        Student two = new Student("Ashirvad",90,97,"Btech CSE");
        
        System.out.println(one);
        System.out.println(one.equals(two));
    }
}
