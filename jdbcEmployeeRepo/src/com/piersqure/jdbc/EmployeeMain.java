
package com.piersqure.jdbc;

import java.sql.SQLException;
import java.util.Scanner;

/**
 * EmployeeMain is the entry point of the Employee Management application.
 * This class provides a simple command-line interface to perform various 
 * operations on employee records such as Insert, Get, Update, and Delete.
 * 
 * Developed by: Davis Nayak
 * Date: 1st August
 */

public class EmployeeMain {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner scanner = new Scanner(System.in);
		String operation = "";

		System.out.println("Enter operation (Insert, Get, Update, Delete, Exit):");
		operation = scanner.nextLine();

		switch (operation.toLowerCase()) {
		case "insert":
			EmployeeRepository.insertEmployee(scanner);
			break;
		case "get":
			EmployeeRepository.getEmployee(scanner);
			break;
		case "update":
			EmployeeRepository.updateEmployee(scanner);
			break;
		case "delete":
			EmployeeRepository.deleteEmployee(scanner);
			break;
		case "exit":
			System.out.println("Exit.");
		}

	}

}