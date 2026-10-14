import java.sql.*;
public class Demo
{
   public static void main(String s[])throws Exception
   {
       Connection con;
       PreparedStatement ps;
       
       Class.forName("com.mysql.jdbc.Driver");
       con = DriverManager.getConnection("jdbc:mysql;//localhost:3306/saro","root","");
       ps = con.prepareStatemnt ("insert into bank values(101,'saro',50000)");
       ps.executeUpdate();
       ps.close();
       System.out.println("Record Inserted");
       }
       }
