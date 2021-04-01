public class FinalizeEx {

    public static void main(String[] args) throws Throwable
    {
        FinalizeEx f1=new FinalizeEx();
        System.out.println(f1.hashCode());
        f1=null;
        //Calling garbage collector
        System.gc();
        System.out.println("Garbage Collector");

    }
    @Override
    protected void finalize()
    {
        System.out.println("Finalize method called");
    }
    
}
