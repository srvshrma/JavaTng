package comm.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
	private Connection connection;
	static MyConnection myConnection;
	
	private MyConnection() {
		
	}
	public static MyConnection getMyConnectionObject() {
		if(myConnection==null) {
			return new MyConnection();
		}
		else {
			return myConnection;
		}
		
		
	}
	
	public Connection getMyConnection() throws SQLException{
		if(myConnection==null) {
			myConnection=new MyConnection();
		}
		//DriverManager.registerDriver(new org.h2.Driver());
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","welcome");
		return connection;
	}
	

}
