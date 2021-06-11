import java.io.FileInputStream;
import java.sql.*;
import java.io.*;
class ImageSave 
{
  public static void main(String[] args)
  {
      try
      {
           //Load Driver
           Class.forName("com.mysql.jdbc.Driver");

           // Create Connection
            String url="jdbc:mysql://localhost:3306/mydb";
            String username="root";
            String password="";
            Connection con=DriverManager.getConnection(url, username, password);

            
            //Create Query
            String q="insert into images(pic) values(?)";

            //get PreparedStatement Object
            PreparedStatement pstmt=con.prepareStatement(q);

            FileInputStream fis=new FileInputStream("ball1.jpeg");

            pstmt.setBinaryStream(1,fis,fis.available());

            pstmt.executeUpdate();

            System.out.println("Image inserted");
            con.close();


      }
      catch(Throwable e)
      {
          e.printStackTrace();
      }
  } 
}
