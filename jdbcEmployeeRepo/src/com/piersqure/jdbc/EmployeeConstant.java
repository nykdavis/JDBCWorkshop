package com.piersqure.jdbc;

/**
 * The EmployeeConstant class holds the database configuration constants such as
 * URL, Username, and password for the JDBC connection. These values are used
 * throughout the application to ensure a consistent configuration and avoid
 * hardcoding values in multiple places.
 *
 * <p>
 * This is a utility class and should not be instantiated.
 * </p>
 * 
 * <p>
 * Developer: Davis
 * </p>
 * <p>
 * Date: July 30, 2024
 * </p>
 */

public class EmployeeConstant {

	private EmployeeConstant() {

	}

	public static final String DB_URL = "jdbc:mysql://localhost:3306/GithubProjects";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "root";
	public static final String INSERT_QUERY = "INSERT INTO JDBCEmployee (id, name, department , salary) VALUES (?, ?, ?, ?)";
	public static final String GET_QUERY = "SELECT * FROM JDBCEmployee";
	public static final String DELETE_BY_ID_QUERY = "DELETE FROM JDBCEmployee WHERE id = ?";
	public static final String UPDATE_BY_ID_QUERY = "UPDATE JDBCEmployee SET salary = ? WHERE id = ?";
}
