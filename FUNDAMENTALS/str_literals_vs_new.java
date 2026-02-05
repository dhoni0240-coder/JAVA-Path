public class str_literals_vs_new {
    public static void main(String[]args){

        String s = "Ashirvad";
        String i = "Ashirvad";

        String p = new String("Ashirvad");
        String g = new String("Ashirvad");

        System.out.println(s == i);
        System.out.println(p == g);  // == compares reference.
        System.out.println(s == p);
        System.out.println(s.equals(g));  //equals() compares content.
        System.out.println(p.equals(g));
        System.out.println(i != g);
    }
}
