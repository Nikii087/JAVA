import java.util.Scanner;
 class ReverseString {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String str=sc.nextLine();
        String temp=str;

        String rev="";

         int length=str.length();
        for(int i=length-1;i>=0;i--)
        {
            //charAt() extract specific character by index tsrts from 0
            rev=rev+str.charAt(i);
        }
        System.out.println("Reverse string: "+rev);

        if(temp.equals(rev))
        {
            System.out.println("The string is palindrom");
        }
        else
        {
            System.out.println("The string is not palindrom");
        }

    }
    
}
