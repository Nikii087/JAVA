import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

class Fun {
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
            String q="insert into table1(tName,tCity) values(?,?)";

            //get PreparedStatement Object
            PreparedStatement pstmt=con.prepareStatement(q);

            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Name:");
            String name=br.readLine();

            System.out.println("Enter City:");
            String city=br.readLine();

            //set the values to query
            pstmt.setString(1,name);
            pstmt.setString(2, city);

            pstmt.executeUpdate();

            System.out.println("Data Insertd");
            con.close();

         }
        catch(Throwable e)
        {
            e.printStackTrace();
        }
    }
    
}
