class CountNoDigitsInNumber 
{
    public static void main(String[] args)
    {
        int num=12304456;
        int count=0;
        while(num!=0)
        {
            num=num/10;
            count++;
        
        }
        System.out.println("No of digits are:"+count);
        

    }
    
}
