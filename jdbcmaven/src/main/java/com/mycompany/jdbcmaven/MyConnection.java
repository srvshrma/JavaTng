package com.mycompany.jdbcmaven;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


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
	public static Properties getConnectionProperties() throws SQLException, IOException{
		
		InputStream in=new FileInputStream("mysql.properties");
		Properties prop=new Properties();
		prop.load(in);
		
		return prop;
		
		
	}
	
	public Connection getMyConnection() throws SQLException, IOException{
		Properties prop=getConnectionProperties();
		String url=prop.getProperty("connection.url");
		String user=prop.getProperty("connection.user");
		String password=prop.getProperty("connection.password");
		
		
		connection=DriverManager.getConnection(url,user,password);
		return connection;
	}
}
