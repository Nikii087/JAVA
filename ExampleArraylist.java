import java.util.*;
class ExampleArraylist
{
    public static void main(String [] args)
    {
        ArrayList l1=new ArrayList(4);
        l1.add("Nikita");
        l1.add("Ankita");
        Iterator it=l1.iterator();
            
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

}