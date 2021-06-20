import java.util.Scanner;

class LargestNo {
    public static void main(String args[])
    {
       int a,b,c,temp,largest;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter first number");
        a=sc.nextInt();
       System.out.println("Enter Second number");
        b=sc.nextInt();
       System.out.println("Enter Third number");
       c=sc.nextInt();

       temp=a>b?a:b;
       largest=c>temp?c:temp;
       System.out.println("the largest no is " +largest);
    }
    
}
