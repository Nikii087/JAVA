 class Test1{

    int x=3;
    static int y;
     public static void fun1()
    {
        System.out.println("Hey pillu");
    }
    public void fun()
    {
        System.out.println("HEY Shona");
    }
}
 class Hello{
    public static void main(String[] args)
    {
        Test1 ex1=new Test1();
        ex1.fun();
        Test1.fun1();

    }
}
