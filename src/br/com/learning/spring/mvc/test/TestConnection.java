package br.com.learning.spring.mvc.test;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.learning.spring.mvc.dao.ConnectionFactory;

public class TestConnection {

	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Open connection!");
		connection.close();	
	}
}
