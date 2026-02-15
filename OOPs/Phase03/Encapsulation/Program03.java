package Phase03.Encapsulation;

import java.util.ArrayList;
import java.util.List;

//Parent Class
class Bankaccount{
    //double balance;  --> //bad design

    //Private data members
    private String account_holder;
    private double balance;
    protected List<String> transactionHistory;


    //Constructor
    public Bankaccount(String account_holder, double initial_balance){
        this.account_holder = account_holder;
        this.balance = (initial_balance > 0) ? initial_balance : 0;
        this.transactionHistory = new ArrayList<>();

        transactionHistory.add("Account created with Balance : $"+balance);
    }

    //Method for - Money deposit
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            transactionHistory.add("Deposited : $"+amount);
            System.out.println("$"+amount+" deposited successfully.");
        }else{
            System.out.println("Invalid Ammount cannot deposit.");
        }
    }

    //Method for - Money withdraw
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance -= amount;
            transactionHistory.add("Withdrawn : $"+amount);
            System.out.println("$"+amount+" withdrawn successfully.");

        }else{
            System.out.println("Insuffecient balance ");
        }
    }

    //Getter method
    public double getBalance(){
        return balance;
    }

    //Getter for account_holder
    public String getAccountHolder(){
        return account_holder;
    }

    //transaction History
    public void showTransactionHistory(){
        System.out.println("--Transaction History--");
        for(String record : transactionHistory){
            System.out.println(record);
        }
    }

    //overiding toString()
    @Override
    public String toString(){
        return "Account Holder : "+account_holder+
        "\nCurrent Balance : $"+balance;
    }
}

//Child Class
class SavingAccount extends Bankaccount{

    private double interestRate;

    public SavingAccount(String account_holder, double initial_balance, double interestRate){
        super(account_holder, initial_balance);
        this.interestRate = interestRate;
    }

    //Method Overriding
    @Override
    public void withdraw(double amount){
        if(amount > 0 && amount <= getBalance()){
            super.withdraw(amount);
            System.out.println("Saving account withdraw Successfully");
        }else{
            System.out.println("Withdrawl Failed.Check you Balance");
        }
    }

    //Add interest
    public void addInterest(){
        double interest = getBalance()*interestRate/100;
        deposit(interest);
        System.out.println("Interest added at "+interestRate+"%");
    }
}

//Main Class
public class Program03 {
    public static void main(String[]args){
        
        SavingAccount person = new SavingAccount("Ashirvad Shukla", 15000000,5);
        System.out.println(person);    //calling toString

        System.out.println("Account Holder Name is : "+person.getAccountHolder());
        System.out.println("Your balance is : "+person.getBalance());

        person.deposit(90000);
        person.withdraw(100000);
        person.addInterest();

        System.out.println("\nThe final balance is ");
        System.out.println(person);

        person.showTransactionHistory();
    }
}
