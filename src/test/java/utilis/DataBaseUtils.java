package utilis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseUtils {
	
	public static void main (String args[]) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
	//public void makeDbConnection() throws SQLException {
		Connection con= null;
		Statement st=null;
		ResultSet rs=null;
	     //Class.forName(" com.mysql.cj.jdbc.exceptions.CommunicationsException").newInstance();
	     
	    // com.mysql.cj.jdbc.exceptions.CommunicationsException;
		//Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/classicmodels","root","Ravi@12345");
		st=con.createStatement();
		st.executeQuery("select * from customers where customernumber =119");
		rs.next();
		String name=rs.getString("customername");
		System.out.println(name);
	}
	public void closeDbConnection() throws SQLException {
		//con.close();
	}

}
