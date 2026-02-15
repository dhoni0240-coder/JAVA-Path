//Demonstration of Inheritance using Car and Pagani class

package Phase03.Inheritance;

//Parent class
class Car{
    protected String brand;
    protected int reg_number;

    //Default constructor
    Car(){
        this("generic car",11);
    }

    //Parameterized consructor
    Car(String brand, int reg_number){
        this.brand = brand;
        this.reg_number = reg_number;
    }

    //Parent class method
    void wish(){
        System.out.println("Congratulations! for your new car");
    }

    //Displaying car details
    void display(){
        System.out.println("Your brand is : "+brand);
        System.out.println("Your registration number is : "+reg_number);
    }
}

//Child class
class Pagani extends Car{
    private String model;
    private int prize;

    //Child class default constructor
    Pagani(){
        super("Pagani",100); //calls parent constructor i.e. Car(){}
        this.model = "New";
        this.prize = 5400000;
    }

    //Child class Parameterized constructor
    Pagani(String model, int prize, int reg_number){
        super("Toyota",reg_number);
        this.model = model;
        this.prize = prize;
    }

    //Method Overriding

    @Override
    void wish(){
        super.wish();
        System.out.println("Congratulations you owned a Pagani");
    }

    @Override
    void display(){

        super.display();    //Parents class details
        System.out.println("Your model is : "+model);
        System.out.println("The price of the Pagani is : "+prize);
    }

    void greeting(){
        System.out.println("You owned a luxurious pagani car.");
    }
}

public class program01 {
    public static void main(String[]args){

        Pagani mine = new Pagani();

        mine.wish();
        mine.greeting();
        mine.display();
    }
}
