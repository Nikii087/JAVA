public class Copy1stArrayInto2nd {
    public static void main(String args[])
    {
        int [] arr1=new int[]{1,2,3,4,5};
        int [] arr2=new int[arr1.length];

        //coping element of array
        for(int i=0;i<arr1.length;i++)
        {
            arr2[i]=arr1[i];
        }

        System.out.println("The elements in the 1st array");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }
        System.out.println();    

        System.out.println("The elements in the 2nd array");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println(arr2[i]);
        }

        


    }
    
}
