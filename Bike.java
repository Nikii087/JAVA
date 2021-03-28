interface Bike1{
    void show();
    void getdata();
}
interface Bike2
{
    void display();
}
class A implements Bike1,Bike2
{
    
    public void show()
    {
        System.out.println("Hey nike");
    }
    public void getdata()
    {
        System.out.println("Hello");
    }
    public void display()
    {
        System.out.println("Nishu");
    }
}
class Bike
{
    public static void main(String []args)
    {
        
        //Cant instantiated to interface bt we can use its refernce varable
        A obj=new A();
        obj.show();
        obj.getdata();
        obj.display();

    }
}