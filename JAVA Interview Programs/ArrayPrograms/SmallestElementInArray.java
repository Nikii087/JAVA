class SmallestElementInArray
{
    public static void main(String[] args)
    {
        int[] arr=new int[]{12,6,34,54,67,98};
        //set maximum element
        int min=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println("Largest element is "+min);
        
    }
}