class AddTwoMatrix {
    public static void main(String args[])
    {
        //initialize two matrix
        int a[][]={{4,5,3},{7,5,6},{7,8,9}};
        int b[][]={{1,2,3},{4,5,6},{7,8,9}};
        //Create new matrix to store sum of elements
        int c[][]=new int[3][3];

        //Addition of two matrix
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)  
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();//for newline

        }
        

    }
    
}
