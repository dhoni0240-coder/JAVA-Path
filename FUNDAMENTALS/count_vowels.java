public class count_vowels {
    public static void main(String[]args){

        String w = "Hello Coders";
        int count = 0;
        int count2 = 0;

        for(int i = 0; i < w.length() - 1; i++){
            char ch = w.charAt(i);
            if(ch == 'a'||ch == 'i'||ch == 'o'||ch == 'e'||ch == 'u'){
                count++;
            }else{
                count2++;
            }
        }
        System.out.println(count);
        System.out.println(count2);
    }
}
