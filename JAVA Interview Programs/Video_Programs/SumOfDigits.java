class SumOfDigits {
    public static void main(String args[])
    {
        int num=123456789;
        int sum=0;
        while(num>0)
        {
            sum=sum+num%10; //9+8+7+6+5+4+3+2+1
            num=num/10;
        }
        System.out.println("Sum of numbers : "+sum);

    }
    
}
