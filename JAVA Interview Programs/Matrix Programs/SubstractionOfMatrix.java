class SubstractionOfMatrix {
    public static void main(String[] args)
    {
        int rows,cols;
        int a[][]={{1,2,3},
                   {4,5,6},
                   {7,8,9}
                  };

        int b[][]={{2,4,3},
                  {4,2,6},
                  {7,8,9}
                 };

        rows=a.length;
        cols=a[0].length;

        int c[][]=new int[3][3];

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                c[i][j]=a[i][j]-b[i][j];
            }
        }

        System.out.println("Substraction of matrix");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
               System.out.print(c[i][j]+" ");
            }
        }


    }
    
}
