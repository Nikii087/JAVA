class ConstructorOverloading {
    int i;
    public ConstructorOverloading(int k)
    {
        i=k;
    }
    public ConstructorOverloading(int k,int m)
    {
        if(k>m)
        {
            i=k;
        }
        else
        {
            i=m;
        }
    }

    public static void main(String []args)
    {
        ConstructorOverloading c=new ConstructorOverloading(10);
        ConstructorOverloading c1=new ConstructorOverloading(12,15);

        System.out.println(c.i);
        System.out.println(c1.i);
    }
}
