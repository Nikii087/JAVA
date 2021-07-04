class CountOddEvendigits
{
    public static void main(String[] args)
    {
        int num=1234567,rev;
        int even_count=0;
        int odd_count=0;

        while(num>0)
        {
            rev=num%10; //Give last no as output
            if(rev%2==0)
            {
                even_count++;

            }
            else
            {
                odd_count++;
            }
                num=num/10; //it eleminates last no
        }

        System.out.println("Even no's are "+even_count);
        System.out.println("Odd no's are "+odd_count);

    }
}