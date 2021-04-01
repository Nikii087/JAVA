 class Exception {

    public static void main(String[] args)
    {
        try
        {
            System.out.println(3/0);
            System.out.println("Try it");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception :"+e.getMessage());
        }
        System.out.println("Hey Nike");
    }
    
}
