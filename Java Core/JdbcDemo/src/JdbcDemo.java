import java.sql.*;

public class JdbcDemo {

	public static void main(String[] args) throws ClassNotFoundException ,SQLException{
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Product","root","");
		Statement st=con.createStatement();
		//st.executeUpdate("create table Products(pid int, name varchar(30))");
		//System.out.println("table created");
		//st.executeUpdate("insert into Products(pid,name) values(1,'pradyumn')");
		//st.executeUpdate("insert into Products(pid,name) values(1,'prakhar')");
		//st.executeUpdate("delete from products where name='pradyumn'");
		//st.executeUpdate(" create table mobile(mid int primary key,mobile varchar(30), price int)");
		//st.executeUpdate(" drop table Products");
		System.out.println("Mission Successful");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
