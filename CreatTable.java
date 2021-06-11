import java.sql.*;
class CreatTable
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

            String q="create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(400))";
            
            //Create Statement
            Statement stmt=con.createStatement();

            stmt.executeUpdate(q);

            System.out.println("table is created...............");

            con.close();


        }
        catch(Throwable e)
        {
            e.printStackTrace();
        }
    }
}



