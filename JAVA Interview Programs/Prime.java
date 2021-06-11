import java.util.Scanner;

class Prime
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);  
       System.out.print("Enter a number : ");  
       int num = sc.nextInt();
        //set flag
        boolean isPrime=true;

        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
              isPrime=false;
              break;
            }
        }
        //if  isPrime is true yet the its a prime no
        if(isPrime)
        {
            System.out.println(num+ " is prime number");
        }
        else
        {
            System.out.println(num+ " is not prime number");
        }

   

    }
}