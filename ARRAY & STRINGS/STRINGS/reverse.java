public class reverse {

    static void reverseString(String n){

        String rev = "";
        for(int i = n.length()-1; i >= 0; i--){
            rev+=n.charAt(i);
        }
        System.out.println(rev);
    }

    public static void main(String[]args){

        String name = "Ashirvad";
        reverseString(name);
    }
}
