public class BankMain
{
    public static void main(String[] args)
    {
        BankAccount User1=new BankAccount();
        BankAccount User2=new BankAccount();
        User1.owner="Vaibhav";
        User2.owner="Sahil";
        User1.balance=5000;
        User2.balance=15000;
        User1.account_number=135790;
        User2.account_number=246810;
        User1.details();
        System.out.println();
        User2.details();
        System.out.println();
        User1.deposit(8000);
        User2.deposit(6000);
        System.out.println();
        User1.getBalance();
        User2.getBalance();
        System.out.println();
        User1.withdraw(4000);
        User2.withdraw(5000);
        System.out.println();
        User1.getBalance();
        User2.getBalance();
    }
}
class BankAccount
{
    int account_number;
    float balance;
    String owner;

    void deposit(float amount)
    {
        balance+=amount;
        System.out.println("Deposited Amount by "+owner+": "+amount+" Rs.");
    }
    void withdraw(float amount)
    {
        balance-=amount;
        System.out.println("Amount Withdrawed by "+owner+": "+amount+" Rs.");
    }
    void getBalance()
    {
        System.out.println("Current Balance of "+owner+": "+balance+" Rs.");
    }
    void details()
    {
        System.out.println("Owner: "+owner);
        System.out.println("Account Number: "+account_number);
        System.out.println("Balance: "+balance);
    }
}