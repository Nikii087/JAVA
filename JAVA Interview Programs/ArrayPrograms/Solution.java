import java.util.Scanner;
public class Solution {
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many element you want in array");
        
        int n=sc.nextInt();
       int arr[] = new int[n];
        //int rev[] = new int[n];

        System.out.println("Enter "+n+" elements ");
        for( int i=0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Original array");
         for(int i=0;i<arr.length;i++)
         {
             System.out.println(arr[i]);
         }
        
        System.out.println("Reverse array");
         for(int i=arr.length-1;i>=0;i--)
         {
             System.out.println(arr[i]);
         }
        
        
        
    }
}
