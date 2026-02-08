//Whole String in one class
public class wholeString {

    public static void main(String[] args) {

        String s = "Java Programming";

        //Length of string
        System.out.println("Length: " + s.length());

        //Access characters (traversal)
        System.out.print("Characters: ");
        for(int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i) + " ");
        }
        System.out.println();

        //Reverse string
        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--){
            rev += s.charAt(i);
        }
        System.out.println("Reverse: " + rev);

        //Palindrome check
        String p = "madam";
        boolean isPalindrome = true;
        int l = 0, r = p.length() - 1;

        while(l < r){
            if(p.charAt(l) != p.charAt(r)){
                isPalindrome = false;
                break;
            }
            l++;
            r--;
        }
        System.out.println("Palindrome (madam): " + isPalindrome);

        //Count vowels
        int vowels = 0;
        String lower = s.toLowerCase();

        for(int i = 0; i < lower.length(); i++){
            char ch = lower.charAt(i);
            
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
        }
        System.out.println("Vowels count: " + vowels);

        //Word count
        String[] words = s.trim().split("\\s+");
        System.out.println("Word count: " + words.length);

        //Character frequency
        int[] freq = new int[256];

        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i)]++;
        }

        System.out.println("Character Frequency:");

        for(int i = 0; i < 256; i++){
            if(freq[i] > 0 && i != ' '){
                System.out.println((char)i + " : " + freq[i]);
            }
        }

        //equals vs ==
        String a = "java";
        String b = new String("java");

        System.out.println("a == b : " + (a == b));
        System.out.println("a.equals(b) : " + a.equals(b));

        //Uppercase & Lowercase
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());

        //String immutability demo
        String x = "Hello";
        x.concat(" World");

        System.out.println("Immutability check: " + x); // still Hello
    }
}
