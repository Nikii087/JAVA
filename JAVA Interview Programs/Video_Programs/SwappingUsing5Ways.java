class SwappingUsing5Ways
{
    public static void main(String args[])
    {
        int a=10, b=30,temp;
        System.out.println("Before swapping numbers are a="+a+" b="+b);

        //Logic first using third variable
        temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping numbers are a="+a+" b="+b);


        //Logic second without using third variable

        a=a+b; //a=30
        b=a-b; //b=10
        a=a-b; //a=20

        System.out.println("After swapping numbers are a="+a+" b="+b);

        //Logic third  using * and / the values of a and b notequal to 0

        a=a*b; //a=200
        b=a/b; //b=10;
        a=a/b; //a=20;

        System.out.println("After swapping numbers are a="+a+" b="+b);
        
        //Logic four using XOR operator
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping numbers are a="+a+" b="+b);

        //Logic five in one statement

        b=a+b-(a=b);
        System.out.println("After swapping numbers are a="+a+" b="+b);







    }
}