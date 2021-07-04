import java.util.Scanner;
class StringReverseUsing3Ways {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        String str=sc.nextLine();

        String rev="";
       /* int length=str.length();
        for(int i=length-1;i>=0;i--)
        {
            //charAt() extract specific character by index tsrts from 0
            rev=rev+str.charAt(i);
        }
        System.out.println("Reverse string: "+rev);*/

        //Using character array

        /*char a[]=str.toCharArray(); //first convert string into array
        int len=a.length;

        for(int i=len-1;i>=0;i--)
        {
            rev=rev+a[i];
        }
        System.out.println("Reverse string: "+rev);*/

        //3.Using StringBuffer Class

        StringBuffer sb=new StringBuffer(str); 
        System.out.println(sb.reverse());   

    }
    
}
