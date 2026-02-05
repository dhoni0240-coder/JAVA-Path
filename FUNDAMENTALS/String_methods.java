public class String_methods {
    public static void main(String[]args){

        String var = "My name is Ashirvad Shukla";
        String a = "Java";
        String b = "JAVA";

        System.out.println(var.length());
        System.out.println(var.charAt(5));
        System.out.println(var.substring(11,19));
        System.out.println("My name is Ashirvad Shukla ji".equals(var));
        System.out.println(a.equalsIgnoreCase(b));  //Ignore the Upper or Lower case of strings and then compares
        System.out.println(var.toUpperCase());
        System.out.println(var.toLowerCase());

        String s = new String("Dhoni");
        String n = new String("DHONI");
        System.out.println(s.equalsIgnoreCase(n));

    }
}
