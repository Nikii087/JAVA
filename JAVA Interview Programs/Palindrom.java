class Palindrom
{
    public static void main(String args[])
    {
        int no=122,temp=no,rem,result=0;
        while(no>0)
        {
           rem=no%10;
           result=(result*10)+rem;
           no=no/10;   
        }
        if(result==temp)
        {
            System.out.println(" Is palindrom no");
        }
        else
        {
            System.out.println(" Is not palindrom");
        }


    }
}