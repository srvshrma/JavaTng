package com.mavenexample.mavenex;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MyConnection {

	private static MyConnection myconnection = null;
	private Connection connection = null;

	public MyConnection() {
		super();
	}

	public static MyConnection getMyConnectionObject() {
		if (myconnection == null) {
			myconnection = new MyConnection();
		}

		return myconnection;
	}

	public Connection getMyConnection() throws IOException, SQLException {
		InputStream in=new FileInputStream("esql.properties");
		
		Properties p=new Properties();
		p.load(in);
		connection=DriverManager.getConnection(p.getProperty("connection.url"),p.getProperty("connection.user"),p.getProperty("connection.password"));
		return connection;
		
	}
	
	
	
}
