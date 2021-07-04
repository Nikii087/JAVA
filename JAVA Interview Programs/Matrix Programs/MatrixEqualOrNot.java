 class MatrixEqualOrNot {
     public static void main(String[] args)
     {
         int row1,col1,row2,col2;
         boolean flag=true;
      
         int a[][]={{2,4,3},
                    {4,2,6},
                    {7,8,9}
                   };
 
         int b[][]={{2,4,3},
                   {4,2,6},
                   {7,8,9}
                  };
        //calculate the rows and columns present in the 1st matrix
         row1=a.length;
         col1=a[0].length;
         //calculate the rows and columns present in the 2nd matrix
         row2=a.length;
         col2=a[0].length;

        //Check dimension of both matrices are equal
         if(row1!=row2||col1!=col2)
         {
             System.out.println("Matrix are not equal");
         }
         else
         {
             for(int i=0; i<row1;i++)
             { 
                for(int j=0; j<row1;j++)
                {
                    if(a[i][j]!=b[i][j])
                    {
                        flag=false;
                        break;

                    }
                }

             }

             if(flag)
             {
                 System.out.println("Matrix is equal");
             }
             else
             {
                System.out.println("Matrix is not equal"); 
             }

         }
     }
    
}
