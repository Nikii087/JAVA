class Outer
{
    int i=10;
   // static class Inner
   class Inner
    {
        public void show()
        {
            System.out.println("Nike"+i);
        }
    }
}
class NestedInner {
    public static void main(String [] args)
    {
        Outer out=new Outer();
        Outer.Inner o1=out.new Inner();

      //  If class is static inner class
        //Outer.Inner o1=new Outer.Inner()
        o1.show();
    }
    
}