package w7;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    int accNo;
    String Name;
    int balance;
    
    public BankAccount(int accNo, String Name, int balance){
        this.accNo=accNo;
        this.Name=Name;
        this.balance=balance;
    }
    void deposit(int amount){
        balance=balance+amount;
        System.out.println("the amount you have deposited is: " + balance);
    }
    void withdraw(int amount){
        if(amount>balance){
        System.out.println("your balance is: " + balance + " so you cannot withdraw this amount");
        }
        else{
        System.out.println("your withdrawn amount is :" + amount);
        }
        balance=balance-amount;
    }
    void total(){
        System.out.println("your current balance is:" + balance);
    }
}