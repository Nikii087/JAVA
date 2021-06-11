import java.util.*;
class Book
{
    public String name;
    public double price;

    public Book(String name,double price)
    {
        this.name=name;
        this.price=price;
    }
    public String getName()
    {
        return(name);
    }
    public double getPrice()
    {
        return(price);
    }
}
class Mycomparator implements Comparator
{
    public int compare(Object o1,Object o2)
    {
        Book book1=(Book)o1;
        Book book2=(Book)o2;
        if(book1.getPrice()<book2.getPrice())
        {
            return(-1);
        }
        else
        {
            return(1);
        }

    }
}
public class TreesetExample {
    public static void main(String[] args)
    {
        Book b1,b2,b3;
        b1=new Book("PHP",300.00);
        b2=new Book("JAVA",200.00);
        b3=new Book("CPP",100.00);
        TreeSet t=new TreeSet(new Mycomparator());
        t.add(b1);
        t.add(b2);
        t.add(b3);
        Book b;
        Iterator it=t.iterator();
        while(it.hasNext())
        {
            b=(Book) it.next();
            System.out.println(b.getName()+  "  "   +b.getPrice());
        }
    }
    
}
