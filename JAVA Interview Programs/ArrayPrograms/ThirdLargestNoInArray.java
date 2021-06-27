 class ThirdLargestNoInArray {

    public static int getThirdLargestElement(int[] a,int total)
    {
        int temp;  
        for(int i=0;i<total;i++)
        {
            for(int j=i+1;j<total;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        //This is for second largest integer
        //return a[total-2];
        
        return a[total-3];
        
    }


    public static void main(String[] args)
    {
        int a[]={1,2,5,6,3,2};  
        int b[]={44,66,99,77,33,22,55};  
        System.out.println("Third Largest: "+getThirdLargestElement(a,6));  
        System.out.println("Third Largest: "+getThirdLargestElement(b,7));  

    }
    
}
