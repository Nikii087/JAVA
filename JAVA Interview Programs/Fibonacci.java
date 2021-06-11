class Fibonacci
{
    public static void main(String args[])
    {
        int n1=0,n2=1,n3,i,count=11;
        //printing 0 &1
        System.out.println(n1+" "+n2);
        //loop starts from 2 bcoz 0 & 1 already defined
        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.println(""+n3);
            n1=n2;
            n2=n3;

        }
    }
}