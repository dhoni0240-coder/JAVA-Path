package Phase02;

//Lazy Singleton class --> create object only when it is needed
class Singleton{
    //private static Singleton instance;   //can be reassigned

    private Singleton(){

        System.out.println("You are in singleton Object");

    }
    private static class Asian{

        private static final Singleton Instance = new Singleton();   //it is final, cannot be reassigned

    }

    public static Singleton getInstance(){

        //if(instance == null){
          //  instance = new Singleton();
        //}

        return Asian.Instance;
    }
}

public class singleTon_class04 {
    
    public static void main(String[]args){

        Singleton a = Singleton.getInstance(); //static methods are called using class name only not by new keyword
        Singleton b = Singleton.getInstance();

        System.out.println(a == b);
    }
}
//Eager singleton class --> create object immediately when class loads
