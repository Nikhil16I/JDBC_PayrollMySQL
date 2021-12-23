package com.JDBC.Payroll;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

import java.sql.Driver;

public class JDBC_Payroll_Services {

	static String URL = "jdbc:mysql://localhost:3306/payroll_services";// Loading Driver
	static String USERNAME = "root";
	static String PASSWORD = "Nikhil@16071998";// Sql Password

	public static void main(String[] args) throws ClassNotFoundException {
		Connection con;

		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loaded.");

		ListDrivers();

//Connecting With Database
		try {
			System.out.println("Connecting to DataBase..." + URL);
			con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Connetion Success....!" + con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

//Now Listing the Drivers
	public static void ListDrivers() {
		Enumeration<Driver> driverList = DriverManager.getDrivers();
		while (driverList.hasMoreElements()) {
			Driver driver = (Driver) driverList.nextElement();
			System.out.println(" " + driverList.getClass().getName());
		}
	}
}
