import java.util.Scanner;

class Account
{
    public int bal;
    public Account(int bal)
    {
        this.bal=bal;
    }
    public boolean isSufficientbalance(int w)
    {
        if(bal>w)
        return true;
        else
        return false;
     }
     public void widraw(int amt)
     {
         bal=bal-amt;
         System.out.println("Widrawl money is" + amt);
         System.out.println("Your current balance is"+ bal);
     }
}
class Customer implements Runnable
{
    public Account account;
    public String name;
    public Customer(Account account,String name)
    {
        this.account=account;
        this.name=name;
    }
    public void run()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(name +",Enter money to withdraw");
        int amt=sc.nextInt();
        synchronized (account){
        if(account.isSufficientbalance(amt))
        {
            account.widraw(amt);
        }
        else
        {
            System.out.println("Insufficient balance");
        }
    }
    }
}
    class ThreadExample
    {
       public static void main(String[] args)
        {
            Account a=new Account(1000);
            Customer c1=new Customer(a, "Niki"),c2=new Customer(a, "Hits");
            Thread t1=new Thread(c1);
            Thread t2=new Thread(c2);
            t1.start();
            t2.start();
        }
    }

