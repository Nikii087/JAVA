import java.util.Scanner;
class vovels
{
   public static void main(String[ ] arg)
   {
	boolean isVowel=false;;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String : ");
    String str= sc.nextLine();
	
	sc.close();
	switch(str)
	{
	   case "a" :
	   case "e" :
       case "i" :
	   case "o" :
	   case "u" :
	   case "A" :
	   case "E" :
	   case "I" :
	   case "O" :
	   case "U" : isVowel = true;
	}
	if(isVowel == true) {
	   System.out.println(str+" is  a Vowel");
	}
	else {
        System.out.println("The string not contain vovels");		
        }
   }
   }
