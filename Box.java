public class Box
{
  
    private int l,h,b;
    public Box()
    {
        l=10;
        h=15;
        b=20;

    }
     //Constructor Overloading:
    public Box(int L,int H,int B)
    {
        l=L;
        b=B;
        h=H;
     }
     public static void main(String[] args)
     {
         Box b1 =new Box();
         Box b2 =new Box(10,30,40);
         System.out.println("Length   :"+b1.l);
         System.out.println("Height   :"+b1.h);
         System.out.println("Bradth   :"+b1.b);


         System.out.println("Length   :"+b2.l);
         System.out.println("Height   :"+b2.h);
         System.out.println("Breadth  :"+b2.b);
     }
    
    
    
}

