class LinearSerchingElementInArray {
    public static void main(String args[])
    {
        int a[]={30,60,70,50,10};
        int serch_ele=30;
        boolean flag=false;
        for(int i=0;i<a.length;i++)
        {
            if(serch_ele==a[i])
            {
                System.out.println("Element Found at: "+i);
                flag=true;

            }
        }
        if(flag==false)
        {
            System.out.println("Element not found");
        }
    }
    
}
