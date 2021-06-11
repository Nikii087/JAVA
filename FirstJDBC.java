
import java.sql.*;
class FirstJDBC 
{
    public static void main(String[] args)
    {
        try
        {
            //load Driver
            Class.forName("com.mysql.jdbc.Driver");
            //Create Connection
            String url="jdbc:mysql://localhost:3306/mydb";
            String username="root";
            String password="";
            Connection con=DriverManager.getConnection(url, username, password);
            if(con.isClosed())
            {
                System.out.println("Connection Closed");
            }
            else
            {
                System.out.println("Connection Created");
            }
        }
        catch(Throwable e)
        {
            e.printStackTrace();
        }

    }
    
}