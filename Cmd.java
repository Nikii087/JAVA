public class Cmd {
    public static void main(String[] args)
    {
    
        int s=0;
        for(int i=0;i<args.length;i++)
        s=s+Integer.parseInt(args[i]);
        System.out.println("Sum is"+s);
    }
    
}

/*...Output:


C:\Users\PCP\OneDrive\Desktop\JAVA Practice>javac Cmd.java

C:\Users\PCP\OneDrive\Desktop\JAVA Practice>java Cmd N I K
N
I
K      
....*/