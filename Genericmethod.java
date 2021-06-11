class Genericmethod
{
    public <E> void printarray(E[] s)
    {
        for(E x:s)
        System.out.println(x);
    }
    public static void main(String[] args)
    {
        Genericmethod g1=new Genericmethod();
        String countries[]=new String[]{"Niki","Shruti","Hits"};
        Integer numbers[]=new Integer[]{1,3,2,4,5};
        g1.printarray(countries);
        g1.printarray(numbers);

    }
}