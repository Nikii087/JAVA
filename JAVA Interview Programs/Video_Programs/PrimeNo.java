class PrimeNo
 {
    public static void main(String[] args)
    {
        int no=1;
        boolean isPrime=true;
       if(no>1)
       {
        for(int i=2;i<no;i++)
        {
            if(no%i==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println(no+" is a prime number");
        }
        else
        {
            System.out.println(no+" is not ae prime number");
        }
    }
    else
    {
        System.out.println(no+" is not ae prime number");

    }
}
   

}
    


