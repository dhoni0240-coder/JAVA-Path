public class palindrome {

    static boolean palindrome(String name){

        int left = 0, right = name.length() - 1;

        while(left < right){
            if(name.charAt(left) != name.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[]args){
        String n = "NITIN";

        System.out.println(palindrome(n));
    }
}
