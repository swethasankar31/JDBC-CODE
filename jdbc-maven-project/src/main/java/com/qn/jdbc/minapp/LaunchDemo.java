package com.qn.jdbc.minapp;

import java.sql.DriverManager;
import java.sql.SQLException;

public class LaunchDemo {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("connected");
		System.out.println("hello");
	}

}
