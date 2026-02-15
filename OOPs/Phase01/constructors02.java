package Phase01;

class Car{
    String brand;
    int speed;
    int model;

     //constructor-1 --------> calls constructor-2
     Car(){
        this("BYD",240);
        System.out.println("Constructor 2 is called");
    }

    //constructor-2 --------> calls constructor-3
    Car(String brand, int speed){     //inner variable can be different fron instance variable

        this("BMW",300, 003);
        System.out.println("Constructor 3 is called");
    }

    //constructor-3
    Car(String brand, int speed, int model){
        this.brand = brand;   
        this.speed = speed;
        this.model = model;
    }

    //Changing variable
    void changeBrand(String change_brand){

        System.out.println("The changed brand is : "+change_brand); 
    }

    //Simple Method
    void display(){
        System.out.println(brand+" is running at the speed of "+speed+" KM/hr.");
    }
}

public class constructors02{
    public static void main(String[]args){

        Car c1 = new Car();
        System.out.println(c1.brand);
        System.out.println(c1.speed);
        System.out.println(c1.model);
    
        c1.changeBrand("Maruti Suzuki");
        c1.display();
    }
}