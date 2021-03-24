public class Box
{
    private static final String Box = null;
    private int l,h,b;
    public Box()
    {
        l=10;
        h=15;
        b=20;

    }
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
         System.out.println("lenght:"+b1.Box());
     }
    
}

