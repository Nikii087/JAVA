import java.io.*;
class FileExample {

    public static void main(String[] args) throws IOException
    {
        File f1=new File("C:/Users/PCP/OneDrive/Desktop/JAVA Practice/name1.txt");
        f1.createNewFile();
        System.out.println("File Exist :"+ f1.exists());
        System.out.println("File Size :"+ f1.length());
        f1.delete();
    }
    
}
