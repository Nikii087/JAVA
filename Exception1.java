class Exception1
{
    public static void main(String[] args)
    {
        int balance=8000;
        int widrawlbalance=4000;
        try
        {
        if(balance<widrawlbalance)
        throw new ArithmeticException("Insufficient Balance");

        balance=balance-widrawlbalance;
        System.out.println("Transaction Completed Successfully");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception"+e.getMessage());
        }
        System.out.println("....................Program continue...................");
    }
}