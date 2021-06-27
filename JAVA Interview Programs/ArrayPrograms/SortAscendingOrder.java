class SortAscendingOrder
{
    public static void main(String[] args)
    {
        int[] arr=new int[]{8,6,7,5,4,9,5};
        int temp=0;
        System.out.println("Original Array");

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }

        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                //This is for decsending order
                //if(arr[i]<arr[j])
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                 }
            }
        }

        System.out.println();
        //print ascending array
        System.out.println("Array in ascending order");
         for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }




    }
}