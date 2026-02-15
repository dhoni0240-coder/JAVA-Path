package Phase03.Abstraction;

abstract class Payment{

    protected double amount;

    //constructor
    Payment(double amount){
        this.amount = amount;
    }

    //Abstract method (no body)
    abstract void makePayment();

    //concrete method (with body)
    void paymentReciept(){
        System.out.println("Payment of $"+amount+" processed successfully.");
    }
}

//child Class 1
class CreditCard extends Payment{

    private String cardNumber;

    CreditCard(double amount, String cardNumber){
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void makePayment(){
        System.out.println("Processing credit card Payment...");
        System.out.println("Card number : 98XX-XXXX-XX76 "+cardNumber.substring(14));
    }
}

// Child Class 2
class UPIPayment extends Payment {

    private String upiId;

    UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void makePayment() {
        System.out.println("Processing UPI Payment...");
        System.out.println("UPI ID: " + upiId);
    }
}
public class Program {
    
    public static void main(String[]args){
        Payment payment1 = new CreditCard(5000, "1234-7653-9874");
        payment1.makePayment();
        payment1.paymentReciept();

        System.out.println();

        Payment payment2 = new UPIPayment(4500, "ashirvad@upi");
        payment2.makePayment();
        payment2.paymentReciept();
    }
}
