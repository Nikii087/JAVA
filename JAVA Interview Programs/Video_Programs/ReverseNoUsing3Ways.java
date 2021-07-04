import java.util.Scanner;

class ReverseNoUsing3Ways
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int num=sc.nextInt();
        //First logic
        /*int result=0,rem;
        while(num!=0)
        {
            rem=num%10;
            result=(result*10)+rem;
            num=num/10;
        }

        System.out.println("Reverse no is "+result);*/

        //Second logic using stringBuffer class

        StringBuffer sb=new StringBuffer(String.valueOf(num));
        StringBuffer rev=sb.reverse();
        System.out.println("Reverse no is "+rev);

    }
}