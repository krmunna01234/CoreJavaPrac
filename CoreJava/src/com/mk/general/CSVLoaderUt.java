package com.mk.general;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CSVLoaderUt {

	private static String JDBC_CONNECTION_URL = "jdbc:oracle:thin:SCOTT/TIGER@localhost:1500:MyDB";

	public static void main(String[] args) {
		try {

			/*
			 * CSVLoaderUt loader = new CSVLoaderUt(getCon());
			 * 
			 * loader.loadCSV("C:\\employee.sql", "CUSTOMER", true);
			 */

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static Connection getCon() {
		Connection connection = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(JDBC_CONNECTION_URL);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return connection;
	}
}