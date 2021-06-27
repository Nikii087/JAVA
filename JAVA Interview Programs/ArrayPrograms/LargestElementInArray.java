class LargestElementInArray
{
    public static void main(String[] args)
    {
        int[] arr=new int[]{12,34,54,67,98};
        //set maximum element
        int max=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            max=arr[i];
        }
        System.out.println("Largest element is "+max);
        
    }
}