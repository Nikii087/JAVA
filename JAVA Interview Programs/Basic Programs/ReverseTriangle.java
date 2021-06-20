class ReverseTriangle
{
    public static void main(String args[]) {
        int i,j,k,row=5;
        for(i=1; i<=row; i++)
        {
            for(j=1;j<=i;j++){

                System.out.print(" ");

            }
            for(k=i;k<=row;k++){

                System.out.print("* ");

            }
            System.out.println();
        }
        
    }
    
}
