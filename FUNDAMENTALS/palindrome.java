public class palindrome {

    public static void main(String[]args){

        String s = new String("nitin");
        String rev = new String("");

        for(int i = s.length() - 1; i >= 0; i--){
            rev += s.charAt(i);
        }

        if(s.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}