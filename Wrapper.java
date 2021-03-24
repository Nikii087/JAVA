public class Wrapper {
    public static void main(String [] args)
{
    byte b=10;
    short s=20;
    int i=30;

    //Autoboxing:Converts primitive into objects

    Byte byteobj=b;
    Short shortobj=s;
    Integer intobj=i;

    System.out.println("Byte object " +byteobj);
    System.out.println("Short object " +shortobj);
    System.out.println("Integer object " +intobj);

    //Unboxing :Converts objects into primitives

    byte bytevalue=byteobj;
    short shortvalue=shortobj;
    int intvalue=intobj;

    System.out.println("Byte Value "+bytevalue);
    System.out.println("Short Value "+shortvalue);
    System.out.println("Integer Value "+intvalue);



}    
}

/*  OUTPUT:

Byte object 10
Short object 20  
Integer object 30
Byte Value 10    
Short Value 20   
Integer Value 30     */
