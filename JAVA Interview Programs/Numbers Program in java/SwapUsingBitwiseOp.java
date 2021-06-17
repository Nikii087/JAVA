class SwapUsingBitwiseOp {

    public static void main(String args[])
    {
        int a=20 ,b=30 ,temp;
        System.out.println("Before swapping :");
        System.out.println("a : "+a+",b : "+b);
        temp=a;   //a=a*b;  //a=a^b;
        a=b;      //b=a/b;  //b=a^b;
        b=temp;   //a=a/b;  //a=a^b;
        System.out.println("After swapping :");
        System.out.println("a : "+a+",b : "+b);
        
    }
    
}
 