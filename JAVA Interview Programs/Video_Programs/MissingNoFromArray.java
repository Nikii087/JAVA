class MissingNoFromArray {

    public static void main(String[] args)
    {
        int a[]={1,3,4,5,6,7,8};
        int sum1=0;

        for(int i=0;i<a.length;i++)
        {
            sum1=sum1+a[i];
        }
        System.out.println("Sum of array elements "+sum1);

        int sum2=0;
        for(int i=1;i<=8;i++)
        {
            sum2=sum2+i;
        }
        System.out.println("Sum of range in array elements "+sum2);
        System.out.println("Missing array element is "+ (sum2-sum1));
    }
}
