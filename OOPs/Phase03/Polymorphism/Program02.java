package Phase03.Polymorphism;

//Parent Class---->
class Car{
    protected String brand;

    Car(String brand){

        this.brand = brand;
    }

    void key(){
        System.out.println("Start the Engine of the Car by putting Key");
    }

    void acceleter(){
        System.out.println("Now take on acceleter");
    }
    
    void acceleter(int speed){
        System.out.println("The car is running at the speed of "+speed+"km/h");
    }
}

//Child Class---->
class Porche extends Car{
    private String model;

    Porche(String model){
        super("Parche is on the way");
        this.model = model;
    }

    //Overriding parent class method

    @Override
    void key(){
        System.out.println("Porche "+model+" is going for its first drive");
    }

    //Child class method
    void showDetail(){
        System.out.println("The car model is : "+model);
    }
}
public class Program02{

    public static void main(String[]args){

        Car one = new Car("Toyota Fortuner");
        one.key();
        one.acceleter();
        one.acceleter(320);  //Method overloading

        Car two = new Porche("911");
        two.key();
        two.acceleter();
        two.acceleter(400);

        if(two instanceof Porche){
            Porche p = (Porche) two;

            p.acceleter(600);
        }
    }
}
