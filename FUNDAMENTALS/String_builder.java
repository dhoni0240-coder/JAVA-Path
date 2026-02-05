//String Builder in java

public class String_builder {
    public static void main(String[]args){

        String str = "Hello";
        str += " Ashirvad";

        StringBuilder s = new StringBuilder("Hello");
        s.append(" Coders");

        System.out.println(str);
        System.out.println(s);
        
    }
}
