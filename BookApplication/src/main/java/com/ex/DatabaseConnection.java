package com.ex;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DatabaseConnection {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/bookapp";
		String username="Aakash";
		String password="password";
		Connection connection=DriverManager.getConnection(url, username,password);
		return connection;
	}
}
