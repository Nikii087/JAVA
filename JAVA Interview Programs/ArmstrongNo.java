class ArmstrongNo
{
    public static void main(String args[])
    {
        int no=153,res=0,temp,a;
        temp=no;
        while(no>0)
        {
            a=no%10;
            no=no/10;
            res=res+(no*no*no);
         }
         if(temp==res)
         {
            System.out.println(" is armstrong no");
         }
         else
         {
             System.err.println(" is not anarmstrong no");
         }
    }
}