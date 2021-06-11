import java.util.Scanner;

class PrimeBetnTwoNo
{
    public static void main(String args[])
    {
        int start,end,i,j;
        Scanner s = new Scanner(System.in);  
        System.out.print("Enter the first number : ");  
         start = s.nextInt();  
        System.out.print("Enter the second number : ");  
         end = s.nextInt();  

        for(i=start;i<=end;i++)
        {
            for(j=2;j<=i;j++)
            {
                if(i%j==0)
                break;
            }
            if(i==j)
            System.out.println(j+" ");
        }
    }

}