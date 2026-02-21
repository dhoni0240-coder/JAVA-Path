//Describing throws keyword

package throw_throws;
import java.io.*;

public class Throwss {
    static void checkFile() throws IOException{

        FileReader file = new FileReader("file.txt");
    }

    public static void  main(String[]args){
        try{
            checkFile();
        }
        catch(IOException e){
            System.out.println("File not Found...");
        }
    }
}
