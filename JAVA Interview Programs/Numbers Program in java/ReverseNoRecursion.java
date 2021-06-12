import java.util.Scanner;

class Reverse1 {

    public static void reverse(int num)
    {
        if(num<10)
        {
            System.out.println(num);
            return;
        }
        else
        {
            System.out.print(num % 10);  
            reverse(num/10);  
        }
       
    }
    }
    class ReverseNoRecursion
    {
        public static void main(String args[])
        {
            
            System.out.print("Enter the number that you want to reverse: ");  
            Scanner sc = new Scanner(System.in);  
            int num = sc.nextInt();  
            System.out.print("The reverse of the given number is: ");  
            //method calling  
            Reverse1 r=new Reverse1();
            r.reverse(num);  

        }

    }
