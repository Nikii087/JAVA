class Fruit
{
     int price=100;
    public String name="Mango";

    public void color()
    {
        System.out.println("The color of the fruit is yello");
    }
}

class Banana extends Fruit
{
    public String taste="sweet";

    public void size()
    {
        System.out.println("Size of fruit is  2 inch");
    
    }
}
class Single
{
    public static void main(String[] args)
    {
        Banana b1=new Banana();
        b1.size();
        b1.color();
        System.out.println("The price of the fruit is  :" +b1.price);
        System.out.println("The name of the fruit is  :" +b1.name);
        System.out.println("The Taste of the fruit is  :" +b1.taste);


    }
}

/*Output:-

Size of fruit is  2 inch
The color of the fruit is yello
The price of the fruit is  :100
The name of the fruit is  :Mango 
The Taste of the fruit is  :sweet

....*/