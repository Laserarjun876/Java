package jdbcpack;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcTutorial {
	public static void main(String[] args) throws Exception 
	{
		String url="jdbc:mysql://localhost:3306/jdbcdemo";
		String uname="root";
		String pass="";
		String query="select name from student where roll=1";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String username=rs.getString("name");
		System.out.println(username);
		st.close();
		con.close();
		
		
	}

}
