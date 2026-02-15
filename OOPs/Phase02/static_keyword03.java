package Phase02;

class counter {

    //Static variable
    static int count;

    counter(){
        count--;
    }

    //Static method
    static int addition(int a, int b){
        return a + b;
    }

    //Static Block
    static {
        System.out.println("Currently you are in static block");
    }
}

public class static_keyword03{
    public static void main(String[]args){

        new counter();
        new counter();
    
        System.out.println("Ststic variable : "+counter.count);  //static variable
        System.out.println("Static method : "+counter.addition(98,58)); //static method
        new counter(); //static block
    }
}
