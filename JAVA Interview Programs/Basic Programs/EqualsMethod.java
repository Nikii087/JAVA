 class EqualsMethod {
     public static void main(String args[])
     {
         //creating constructor og double x
         Double x=new Double(123.4567);
         //creating constructor of long y
         Long y=new Long(23343534);

         System.out.println(x.equals(y));
         System.out.println(x.equals(123.4567));
     }
    
}
// Difference Between == Operator and equals() Method
// In Java, the == operator compares that two references are identical or not. Whereas the equals() method compares two objects.

//Java hashCode() Method:
//Syntax:

// public int hashCode()  
// It returns a randomly generated hash code value of the object that is unique for each instance.