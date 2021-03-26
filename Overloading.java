class Car
{
    String carname="Creta";
    int modelno=22;

    public void Car1()
    {
       System.out.println("Class A");
    }
}
class Bike extends Car
{
    public String brand;
    public float price;
    public int pltno;

//Function Overloading
    public void Car1(String brand,int pltno,float price)
    {
        this .brand=brand;
        this.pltno =pltno;
        this.price =price;

        System.out.println("Class B");
    }
}
class Overloading
{
    public static void main(String[] args)
    {
        Bike b1=new Bike();
        b1.Car1();
        b1.Car1("abx",2,200000);
        System.out.println("Car Name     :"+b1.carname);
        System.out.println("Car Modelno  :"+b1.modelno);
        System.out.println("Car Brand    :"+b1.brand);
        System.out.println("Car Price    :"+b1.price);
        System.out.println("Car pltno    :"+b1.pltno);
    }
}

/*...Output;
Class A
Class B
Car Name     :Creta
Car Modelno  :22 
Car Brand    :abx
Car Price    :200000.0
Car pltno    :2 
..*/
