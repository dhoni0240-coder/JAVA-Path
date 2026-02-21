package Full_Explaination;

import java.io.*;

// Custom Exception
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class Program {

    static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {

        if(amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance!");
        }
        else {
            System.out.println("Withdrawal successful");
        }
    }

    static void readFile() throws IOException {
        FileReader file = new FileReader("abc.txt");
    }

    public static void main(String[] args) {

        System.out.println("Program Started");

        try {

            // Arithmetic Exception
            int a = 10/0;

            // Array Exception
            int arr[] = {1,2};
            System.out.println(arr[5]);

            // Custom Exception
            withdraw(1000, 2000);

            // Checked Exception
            readFile();

        }
        catch(ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Error: " + e.getMessage());
        }

        catch(InsufficientBalanceException e) {
            System.out.println("Custom Error: " + e.getMessage());
        }

        catch(IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }

        catch(Exception e) {
            System.out.println("General Exception");
        }
        
        finally {
            System.out.println("Finally block executed");
        }

        System.out.println("Program Ended");
    }
}