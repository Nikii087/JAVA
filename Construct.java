class Home
{
    int b;
    //public int homeno;
    public Home()
    {
         System.out.println("Class A");
    }
}
class Flat extends Home
{
    int a;
    String b;
    
    public Flat()
    {
        //called to 2nd constructor in subclass
        this(2);
        System.out.println("Class B");
    }
    public Flat(int a)
    {
        //this firstly called parent class 
        super();
        System.out.println("class B1");
    }
}
class Construct
{
    public static void main(String[] args)
    {
        Flat obj= new Flat();
    }
}