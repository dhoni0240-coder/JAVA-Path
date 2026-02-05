//Reversing An Array

public class reverse_str {
    public static void main(String[]args){

        String s = "Ashirvad Shukla";
        String rev = "";
        
        for(int i = s.length() - 1; i >= 0 ; i--){
            rev += s.charAt(i);
        }
        System.out.println(rev);
    }
}
