package Phase01;

class Car{
    String brand;
    int speed;

    //Default Constructor
     Car(){
        this.brand = "BMW";
        this.speed = 320;
    }

    //without this keyword
    //Car(String brand){
     //   brand = brand;  //wrong
    //}

    //Parameterized Constructor
    Car(String brand, int speed){     //inner variable can be different fron instance variable

        this.brand = brand;    //with this
        this.speed = speed;
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

public class simple_class01{
    public static void main(String[]args){

        Car c1 = new Car();                                 //object-1

        System.out.println("Brand of c1 is : "+c1.brand);
        System.out.println("The speed of c1 is : "+c1.speed);

        Car c2 = new Car("Mercedes",240);      //object-2

        System.out.println("Brand of c2 is : "+c2.brand);
        System.out.println("The speed of c2 is : "+c2.speed);

        c1.changeBrand("Maruti Suzuki");
        c1.display();               //method call
        c2.display();               //method call
    }
}
//this keyword --> refers to the current object
//new keyword --> allocates memory