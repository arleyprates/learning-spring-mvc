package br.com.learning.spring.mvc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver ());
			return DriverManager.getConnection("jdbc:mysql://localhost/spring_mvc", "root", "123");
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
